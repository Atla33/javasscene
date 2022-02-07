package Persistencia;

import Dominio.Protocolo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import com.example.condo.Persistencia.Conexao;



public class ProtocoloDAO implements Persistencia.IProtocoloDAO {
    private Conexao conexao = new Conexao();
    private final String BUSCARPORUSER = "select * from \"protocolo\" where \"id_usuario\"=?";
    private final String BUSCARPORPROTO = "select * from \"protocolo\" where \"id_protocolo\"=? ";
    private final String DELETAR = "DELETE FROM \"PROTOCOLO\" where \"id_protocolo\"=?";
    private final String INSERIR = "insert into \"PROTOCOLO\" (\"id_usuario\",\"descricao\",\"assinado\") values(?,?,?,?)";
    private final String ALTERAR = "UPDATE \"PROTOCOLO\" set \"id_usuario\"=? , \"alterado_em\"=?,\"descricao\"=?,\"assinado\"=? ";

    public ProtocoloDAO() {
    }


    @Override
    public ArrayList<Protocolo> buscarPorIdUsuario(int id_usuario) {
        ArrayList<Protocolo> p = null;
        try {
            this.conexao.conectar();
            PreparedStatement instrucao = this.conexao.getConexao().prepareStatement(BUSCARPORUSER);
            ResultSet rs = instrucao.executeQuery();

            while (rs.next()){
                Protocolo prot = new Protocolo(rs.getInt("protocolo_id"),rs.getInt("id_usuario"),rs.getString("tipo"),rs.getTimestamp("criado_em"),rs.getString("descricao"),rs.getBoolean("assinado"));
                p.add(prot);
            }
            this.conexao.desconectar();
        }catch (SQLException deep){
            System.out.println(deep.getMessage());
        }
        return p;
    }

    @Override
    public Protocolo buscarPoridProtocolo(int id) {
        Protocolo p = null;
        try {
            this.conexao.conectar();
            PreparedStatement instrucao = this.conexao.getConexao().prepareStatement(BUSCARPORPROTO);
            ResultSet rs = instrucao.executeQuery();

            while (rs.next()){
                Protocolo prot = new Protocolo(rs.getInt("protocolo_id"),rs.getInt("id_usuario"),rs.getString("tipo"),rs.getTimestamp("criado_em"),rs.getString("descricao"),rs.getBoolean("assinado"));
                p= prot;
            }
            this.conexao.desconectar();
        }catch (SQLException deep){
            System.out.println(deep.getMessage());
        }
        return p;
    }

    @Override
    public void excluirProtocolo(int id) {
        try{
            this.conexao.conectar();
            PreparedStatement instrucao = this.conexao.getConexao().prepareStatement(DELETAR);
            instrucao.setInt(1,id);
            instrucao.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        this.conexao.desconectar();
    }

    @Override
    public void alterarProtocolo(Protocolo prot, int id_prot) {
        this.conexao.conectar();
        PreparedStatement instrucao = null;
        try {
            instrucao = this.conexao.getConexao().prepareStatement(ALTERAR);
            instrucao.setInt(1,prot.getId_usuario());
            instrucao.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
            instrucao.setString(3,prot.getDescricao());
            instrucao.setBoolean(4, prot.isAssinado());
            instrucao.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.conexao.desconectar();
    }

    @Override
    public void inserirUsuario(Protocolo prot) {
        this.conexao.conectar();
        PreparedStatement instrucao = null;
        try {
            instrucao = this.conexao.getConexao().prepareStatement(INSERIR);
            instrucao.setInt(1,prot.getId_usuario());
            instrucao.setString(2,prot.getDescricao());
            instrucao.setBoolean(3, prot.isAssinado());
            instrucao.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.conexao.desconectar();
    }
}
