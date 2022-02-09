package com.example.condo.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

    public class Conexao {

        private String caminho;
        private String usuario;
        private String senha;
        private Connection aPropriaConexao;

        public Conexao(){
            caminho = "jdbc:postgresql://localhost:5432/d36d6q4edd0d4l";
            usuario = "kqklryaeekpupg";
            senha = "cfe1225751fccd11c58adafce7ce6e5de2d754c0c585b0162ae11d1ec9f75bb5";
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