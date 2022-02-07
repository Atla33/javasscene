package Dominio;

import java.sql.Timestamp;

public class Protocolo {
    private int id_protocolo;
    private int id_usuario;
    private String tipo_protocolo;
    private Timestamp criado_em;
    private String descricao;
    private boolean assinado;

    public Protocolo(int id_protocolo, int id_usuario, String tipo_protocolo, Timestamp criado_em, String descricao, boolean assinado) {
        this.id_protocolo = id_protocolo;
        this.id_usuario = id_usuario;
        this.tipo_protocolo = tipo_protocolo;
        this.criado_em = criado_em;
        this.descricao = descricao;
        this.assinado = assinado;
    }

    public int getId_protocolo() {
        return id_protocolo;
    }

    public void setId_protocolo(int id_protocolo) {
        this.id_protocolo = id_protocolo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getTipo_protocolo() {
        return tipo_protocolo;
    }

    public void setTipo_protocolo(String tipo_protocolo) {
        this.tipo_protocolo = tipo_protocolo;
    }

    public Timestamp getCriado_em() {
        return criado_em;
    }

    public void setCriado_em(Timestamp criado_em) {
        this.criado_em = criado_em;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAssinado() {
        return assinado;
    }

    public void setAssinado(boolean assinado) {
        this.assinado = assinado;
    }
}
