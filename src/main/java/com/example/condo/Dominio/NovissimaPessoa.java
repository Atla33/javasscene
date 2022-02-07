package Dominio;

import java.sql.Timestamp;

public class NovissimaPessoa {
    private int id_usuario;
    private int casa;
    private Timestamp data_nascimento;
    private String nome;
    private String email;
    private Timestamp criado_em;

    public NovissimaPessoa(){

    }
    public NovissimaPessoa(int id_usuario, int casa, Timestamp data_nascimento, String nome, String email, Timestamp criado_em) {
        this.id_usuario = id_usuario;
        this.casa = casa;
        this.data_nascimento = data_nascimento;
        this.nome = nome;
        this.email = email;
        this.criado_em = criado_em;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getCasa() {
        return casa;
    }

    public void setCasa(int casa) {
        this.casa = casa;
    }

    public Timestamp getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Timestamp data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCriado_em() {
        return criado_em;
    }

    public void setCriado_em(Timestamp criado_em) {
        this.criado_em = criado_em;
    }



}
