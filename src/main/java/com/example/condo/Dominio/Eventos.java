package Dominio;

import java.util.ArrayList;

public class Eventos {
    private int id;
    private int tipo;
    private String duracao;
    private String local;
    private String descricao;

    private ArrayList<Eventos> listaEve;

    public Eventos(int tipo, String duracao, String local, String descricao ) {
        this.id = id;
        this.tipo = tipo;
        this.duracao = duracao;
        this.local = local;
        this.descricao = descricao;
        listaEve = new ArrayList<>();
    }

    public Eventos() {listaEve = new ArrayList<>();}

    public Eventos(int id, int tipo, String duracao, String local, String descricao) {
    }

    public Eventos consultarEventos(int id){
        int i;
        for(i=0; i<listaEve.size(); i++){
            if(listaEve.get(i).getId()==id)
                return listaEve.get(i);
        }
        return null;
    }

    public int getTipo() { return tipo;}

    public String getDuracao() {
        return duracao;
    }

    public String getLocal() {
        return local;
    }

    public String getDecricao() {
        return descricao;
    }

    public int getId() { return id;}

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setDecricao(String decricao) {
        this.descricao = decricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTamanhoLista(){
        return listaEve.size();
    }

    public Eventos getDependente(int i){
        return listaEve.get(i);
    }

    public void setListaDependentes(ArrayList<Eventos> listaDep) {
        this.listaEve = listaDep;
    }

    public ArrayList<Eventos> getListaDependentes(){
        return listaEve;
    }
}
