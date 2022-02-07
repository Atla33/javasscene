package com.example.condo.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

    public class Conexao {

        private String caminho;
        private String usuario;
        private String senha;
        private Connection aPropriaConexao;

        public Conexao(){
            caminho = "jdbc:postgresql://localhost:5432/d5ja9ksq21oc9f";
            usuario = "nnrlslfnqpuvlb";
            senha = "bd5ab46aa4df38f35676056c5d9e8273636de623e2744e2062fa8c110be0f0fa";
        }

        public Conexao(String c, String u, String s){
            caminho = c;
            usuario = u;
            senha = s;
        }

        public void conectar(){
            try{
                Class.forName("org.postgresql.Driver"); //carregar o driver
                aPropriaConexao = DriverManager.getConnection(caminho, usuario, senha); //abrir a conexão
            }catch(Exception e){
                System.out.println("Erro na conexão: "+e.getMessage());
            }
        }
        public void desconectar(){
            try{
                aPropriaConexao.close();
            }catch(Exception e){
                System.out.println("Erro na desconexão: "+e.getMessage());
            }
        }
        public Connection getConexao(){
            return aPropriaConexao;
        }
    }