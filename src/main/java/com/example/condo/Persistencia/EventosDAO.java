package com.example.condo.Persistencia;

import Dominio.Eventos;
import com.example.condo.Persistencia.Conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EventosDAO {

    private Conexao minhaConexao;
    private final String INCLUIR = "insert into \"Eventos\" (\"eventosID\", \"tipo\", "
            + "\"duracao\", \"local\", \"descricao\") values (?, ?, ?, ?, ?)";
    private final String BUSCAR = "select * from \"Eventos\" where \"eventosID\"=?";
    private final String ALTERAR = "update \"Eventos\" set \"eventosID\"=?, \"tipo\"=?, "
            + "\"duracao\"=?, \"duracao\"=?, \"local\"=?, \"descricao\"=? + where \"eventosID\"=?";
    private final String EXCLUIR = "delete from \"Eventos\" where \"eventosID\"=?";


    public EventosDAO() {
        minhaConexao = new Conexao();
    }

    public void inclusao(Eventos ev) {
        try {
            minhaConexao.conectar();
            PreparedStatement instrucao = minhaConexao.getConexao().prepareStatement(INCLUIR);
            instrucao.setInt(1, ev.getId());
            instrucao.setInt(2, ev.getTipo());
            instrucao.setString(3, ev.getDuracao());
            instrucao.setString(4, ev.getLocal());
            instrucao.setString(5, ev.getDecricao());
            instrucao.execute();
            minhaConexao.desconectar();
        } catch (Exception e) {
            System.out.println("Erro na inclusão: " + e.getMessage());
        }
    }

    public Eventos buscar(int id){
        Eventos ev = null;
        try{
            minhaConexao.conectar();
            PreparedStatement instrucao = minhaConexao.getConexao().prepareStatement(BUSCAR);
            instrucao.setInt(1, id);
            ResultSet rs = instrucao.executeQuery();
            if(rs.next()){
                ev = new Eventos(rs.getInt("id"), rs.getInt("tipo"), rs.getString("duracao"),
                        rs.getString("local"), rs.getString("descricao"));
            }
            minhaConexao.desconectar();
        }catch(SQLException e){
            System.out.println("Erro na busca: "+e.getMessage());
        }
        return ev;
    }

    public void alteracao(Eventos ev, int idAntgo){
        try{
            minhaConexao.conectar();
            PreparedStatement instrucao = minhaConexao.getConexao().prepareStatement(ALTERAR);
            instrucao.setInt(1, ev.getId());
            instrucao.setInt(2, ev.getTipo());
            instrucao.setString(3, ev.getDuracao());
            instrucao.setString(4, ev.getLocal());
            instrucao.setString(4, ev.getDecricao());
            instrucao.setInt(5, idAntgo);
            instrucao.execute();
            minhaConexao.desconectar();
        }catch(Exception e){
            System.out.println("Erro na altera��o: "+e.getMessage());
        }
    }

    public void exclusao(int id){
        try{
            minhaConexao.conectar();
            PreparedStatement instrucao = minhaConexao.getConexao().prepareStatement(EXCLUIR);
            instrucao.setInt(1, id);
            instrucao.execute();
            minhaConexao.desconectar();
        }catch(Exception e){
            System.out.println("Erro na exclus�o: "+e.getMessage());
        }
    }

}