package com.example.condo.Persistencia;

import Dominio.NovissimaPessoa;
import com.example.condo.Persistencia.Conexao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MoradorDAO {

    private Conexao conexaoDb;

    public ArrayList<NovissimaPessoa> buscarPessoas(int i){
        ArrayList lista = new ArrayList();
        try {
            this.conexaoDb.conectar();
            Statement instrucao = this.conexaoDb.getConexao().createStatement();
            ResultSet rs = instrucao.executeQuery("select * from  \"Pessoa\" ");


            while (rs.next()){
                NovissimaPessoa p = new NovissimaPessoa(rs.getInt("id_usuario"),rs.getInt("casa"),rs.getTimestamp("data_nascimento"),rs.getString("nome"),rs.getString("email"),rs.getTimestamp("criadoEm"));
                lista.add(p);
            }
        }catch (SQLException error){
            System.out.println(error.getMessage());
        }
        this.conexaoDb.desconectar();
        return lista;
    }
    
    public NovissimaPessoa buscarPessoaPorCasa(int casa){
        NovissimaPessoa p = null;
        try{
            this.conexaoDb.conectar();
            PreparedStatement instrucao = this.conexaoDb.getConexao().prepareStatement("select * from \"pessoa\" where \"casa\"=?");
            instrucao.setInt(1,casa);
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()){
                 p = new NovissimaPessoa(rs.getInt("id_usuario"),rs.getInt("casa"),rs.getTimestamp("data_nascimento"),rs.getString("nome"),rs.getString("email"),rs.getTimestamp("criadoEm"));
            }
            this.conexaoDb.desconectar();
        } catch (SQLException exc){
            System.out.println(exc.getMessage());
        }
        return p;
    }
}
