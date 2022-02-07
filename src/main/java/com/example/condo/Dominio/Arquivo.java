package Dominio;

import java.util.ArrayList;
import java.util.Date;

public class Arquivo {

    private int id;
    private String tipoArquivo;
    private String dadoArquivo;
    private Date criadoEm;
    private Date modificadoEm;

    private ArrayList<Arquivo> listaArq;

    public Arquivo() {listaArq = new ArrayList<>();}

    public Arquivo(int id, String tipoArquivo, String dadoArquivo, Date criadoEm, Date modificadoEm) {

        this.id = id;
        this.tipoArquivo = tipoArquivo;
        this.dadoArquivo = dadoArquivo;
        this.criadoEm = criadoEm;
        this.modificadoEm = modificadoEm;
        listaArq = new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {this.id = id;}

    public String gettipoArquivo() {
        return tipoArquivo;
    }

    public void settipoArquivo(String tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }

    public String getDadoArquivo() {return dadoArquivo;}

    public void setdadoArquivo(String dadoArquivoado) {
        this.dadoArquivo = dadoArquivo;
    }

    public java.sql.Date getCriadoEm() {
        return (java.sql.Date) criadoEm;
    }

    public void setCriadoEm(Date criadoEm) {
        this.criadoEm = criadoEm;
    }

    public java.sql.Date getModificadoEm() {
        return (java.sql.Date) modificadoEm;
    }

    public void setModificadoEm(Date modificadoEm) {
        this.modificadoEm = modificadoEm;
    }

    public Arquivo consultarArquivo(int id){
        int i;
        for(i=0; i<listaArq.size(); i++){
            if(listaArq.get(i).getId()==id)
                return listaArq.get(i);
        }
        return null;
    }

    public int getTamanhoLista(){
        return listaArq.size();
    }

    public Arquivo getDependente(int i){
        return listaArq.get(i);
    }

    public void setListaArquivo(ArrayList<Arquivo> listaDep) {this.listaArq = listaArq;}

    public ArrayList<Arquivo> getListaDependentes(){
        return listaArq;
    }

}
