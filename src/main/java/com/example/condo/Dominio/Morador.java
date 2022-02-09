package com.example.condo.Dominio;

//Herança
public class Morador extends Pessoa {
    public Morador(String nome, String email, String dataNascimento, String senha, int casa) {
        super(nome, email, dataNascimento, senha, casa);
    }

    public void logar(String name, String senha) {
        setNome(name);
        setSenha(senha);
    }
}
