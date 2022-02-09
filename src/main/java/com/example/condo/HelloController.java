package com.example.condo;

import Dominio.Eventos;

import Dominio.NovissimaPessoa;
import com.example.condo.Dominio.Pessoa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import com.example.condo.Persistencia.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class HelloController {

    private ObservableList<Eventos> EventosS = FXCollections.observableArrayList();

    @FXML
    private Button bntAlterar;

    @FXML
    private Button bntAlterarcadastro;

    @FXML
    private Button bntAlterarevento;

    @FXML
    private Button bntAlterarevento1;

    @FXML
    private Button bntArquivo;

    @FXML
    private Button bntBAE;

    @FXML
    private Button bntBuscar;

    @FXML
    private Button bntBuscarevento;

    @FXML
    private Button bntCadastro;

    @FXML
    private Button bntCadastro2;

    @FXML
    private Button bntCadastroevento1;

    @FXML
    private Button bntCastroevento;

    @FXML
    private Button bntConsulta;

    @FXML
    private Button bntEntrar;

    @FXML
    private Button bntEvento;

    @FXML
    private Button bntExcluir;

    @FXML
    private Button bntExcluirevento;

    @FXML
    private Button bntLogin1;

    @FXML
    private Button bntMenu1;

    @FXML
    private Button bntOKeventos;

    @FXML
    private Button bntOkcadastro;

    @FXML
    private Button bntPermissoes;

    @FXML
    private Button bntPrincipal;

    @FXML
    private Button bntPrincipal2;

    @FXML
    private Button bntTelEvento;

    @FXML
    private Button bntTelabaecadastro;

    @FXML
    private Button bntTelabaecadastro1;

    @FXML
    private Button bntTelcadastro;

    @FXML
    private Button bntTellogin;

    @FXML
    private Button bntTelmenu;

    @FXML
    private Text cadastroAcertoeerro;

    @FXML
    private TextField caeField;

    @FXML
    private Text erroAcertoEventos;

    @FXML
    private TextField feildIDmorador;

    @FXML
    private TextField fieldAlterardatadenascimento;

    @FXML
    private TextField fieldAlterardatadenascimento1;

    @FXML
    private TextField fieldAlterarnID;

    @FXML
    private TextField fieldAlterarnID1;

    @FXML
    private TextField fieldAlterarnemail;

    @FXML
    private TextField fieldAlterarnemail1;

    @FXML
    private TextField fieldAlterarnnome;

    @FXML
    private TextField fieldAlterarnnome1;

    @FXML
    private TextField fieldAlterarnnúmero;

    @FXML
    private TextField fieldAlterarnnúmero1;

    @FXML
    private TextField fieldBAEevento;

    @FXML
    private TextField fieldCasamorador;

    @FXML
    private TextField fieldDataeventos;

    @FXML
    private TextField fieldDatamorador;

    @FXML
    private TextField fieldDescricaoeventos;

    @FXML
    private TextField fieldDuracaoeventos;

    @FXML
    private TextField fieldEmailmorador;

    @FXML
    private TextField fieldIDeventos;

    @FXML
    private TextField fieldIDmoradoreventos;

    @FXML
    private TextField fieldLocaleventos;

    @FXML
    private TextField fieldLogin;

    @FXML
    private TextField fieldNomemorador;

    @FXML
    private TextField fieldSenha;

    @FXML
    private TableColumn<Eventos, String> tabcDescricaoevento;

    @FXML
    private TableColumn<Eventos, String> tabcDuracaoevento;

    @FXML
    private TableColumn<Eventos, Integer> tabcIDevento;

    @FXML
    private TableColumn<Eventos, String> tabcLocalevento;

    @FXML
    private TableColumn<Eventos, String> tabcTipoevento;

    @FXML
    private TableView<Eventos> tabvEventos;

    @FXML
    private AnchorPane telBuscaevento;

    @FXML
    private AnchorPane telaAlteracao;

    @FXML
    private AnchorPane telaAlteração1;

    @FXML
    private AnchorPane telaBAE;

    @FXML
    private AnchorPane telaBuscar;

    @FXML
    private AnchorPane telaCadastro;

    @FXML
    private AnchorPane telaCadastroevento;

    @FXML
    private AnchorPane telaEvento;

    @FXML
    private AnchorPane telaLogin;

    @FXML
    private Button bntMenu2;

    @FXML
    private Text textErrobuscaevento;

    @FXML
    private AnchorPane telaMenu;

    @FXML
    private AnchorPane telaPrincipal;

    @FXML
    private Text texCadastromorador;

    @FXML
    private Button trocarTelabae;

    @FXML
    void TrocarTelaalteracao(ActionEvent event) {

        this.telaBuscar.setVisible(false);
        this.telaAlteracao.setVisible(true);

    }

    @FXML
    void realizarAlteracaocadastro(ActionEvent event) {

    }

    @FXML
    void realizarAlteracaoevento(ActionEvent event) {

    }

    @FXML
    void realizarAlteraçãoevento(ActionEvent event) {

        this.telaBAE.setVisible(false);
        this.telaAlteração1.setVisible(true);

    }

    @FXML
    void realizarBusca(ActionEvent event) {

    }

    @FXML
    void realizarBuscaevento(ActionEvent event) {
        if(!fieldBAEevento.getText().equals("")) {

            Eventos e = new Eventos();
            EventosDAO eDAO = new EventosDAO();

            e = eDAO.buscar(Integer.parseInt(fieldBAEevento.getText()));

            if(e == null){

                this.textErrobuscaevento.setVisible(true);
                textErrobuscaevento.setText("ERRO!!! ID não encontrado");

            }

            else{

                this.telaBAE.setVisible(false);
                this.telBuscaevento.setVisible(true);

                tabcIDevento.setCellValueFactory(new PropertyValueFactory <> ("id"));
                tabcIDevento.setCellValueFactory(new PropertyValueFactory <> ("tipo"));
                tabcIDevento.setCellValueFactory(new PropertyValueFactory <> ("duracao"));
                tabcIDevento.setCellValueFactory(new PropertyValueFactory <> ("local"));
                tabcIDevento.setCellValueFactory(new PropertyValueFactory <> ("descricao"));

                EventosS.clear();
                EventosS.addAll(e);
                tabvEventos.setItems(EventosS);
            }

        }

    }

    @FXML
    void realizarCadastro(ActionEvent event) {

        ArrayList<NovissimaPessoa> p = null;
        MoradorDAO mDAO = new MoradorDAO();

        p = mDAO.buscarPessoas(Integer.parseInt(feildIDmorador.getText()));

        if(p == null){

            p = new ArrayList<NovissimaPessoa>();



            this.bntOkcadastro.setVisible(true);
            texCadastromorador.setText("Cadastro efetuado");
            this.texCadastromorador.setVisible(true);
        }
        else{

            this.bntOkcadastro.setVisible(true);
            texCadastromorador.setText("Erro, cadastro já realizado!!!!!");
            this.texCadastromorador.setVisible(true);
        }

    }

    @FXML
    void voltarTelcadastromotador(ActionEvent event) {

        this.texCadastromorador.setVisible(false);
        texCadastromorador.setText("");
        this.bntOkcadastro.setVisible(false);

    }

    @FXML
    void realizarCadastroevento(ActionEvent event) {

        Eventos e = null;
        EventosDAO eDAO = new EventosDAO();

        e = eDAO.buscar(Integer.parseInt(fieldIDeventos.getText()));

        if(e == null){

            e = new Eventos();

            e.setId(Integer.parseInt(fieldIDeventos.getText()));
            e.setLocal(fieldLocaleventos.getText());
            e.setDuracao(fieldDuracaoeventos.getText());
            e.setDecricao(fieldDescricaoeventos.getText());

            this.erroAcertoEventos.setVisible(true);
            erroAcertoEventos.setText("Cadastro efetuado");
            this.bntOKeventos.setVisible(true);
        }
        else{

            this.erroAcertoEventos.setVisible(true);
            erroAcertoEventos.setText("Erro, cadastro já realizado!!!!!");
            this.bntOKeventos.setVisible(true);
        }


    }

    @FXML
    void voltarTelokeventos(ActionEvent event) {

        this.erroAcertoEventos.setVisible(false);
        erroAcertoEventos.setText("");
        this.bntOKeventos.setVisible(false);

    }

    @FXML
    void realizarExclusao(ActionEvent event) {

    }

    @FXML
    void realizarExclusaoevento(ActionEvent event) {

    }

    @FXML
    void telaBAEevento(ActionEvent event) {

    }

    @FXML
    void telaCadastroevento(ActionEvent event) {

        this.telaEvento.setVisible(false);
        this.telaCadastroevento.setVisible(true);

    }

    @FXML
    void trocarTelarquivo(ActionEvent event) {

    }

    @FXML
    void trocarTelbae(ActionEvent event) {

        this.telBuscaevento.setVisible(false);
        textErrobuscaevento.setText("");
        this.textErrobuscaevento.setVisible(false);
        this.telaBAE.setVisible(true);

    }

    @FXML
    void trocarTelcadastro(ActionEvent event) {

        this.telaPrincipal.setVisible(false);
        this.telaLogin.setVisible(false);
        this.telaCadastro.setVisible(true);
    }

    @FXML
    void trocarTelconsulta(ActionEvent event) {

        this.telaMenu.setVisible(false);
        this.telaBuscar.setVisible(true);

    }

    @FXML
    void trocarTelevento(ActionEvent event) {

        this.telaMenu.setVisible(false);
        this.telaEvento.setVisible(true);

    }

    @FXML
    void trocarTellogin(ActionEvent event) {

        this.telaPrincipal.setVisible(false);
        this.telaCadastro.setVisible(false);
        this.telaLogin.setVisible(true);

    }

    @FXML
    void voltarTelamenu(ActionEvent event) {

        this.telaBAE.setVisible(false);
        this.telaBuscar.setVisible(false);
        this.telaMenu.setVisible(true);

    }

    @FXML
    void trocarTelmenu(ActionEvent event) {

        String login = "Anderson";
        String senha = "123";
        if(fieldLogin.getText().equals(login) && fieldSenha.getText().equals(senha)) {
            telaLogin.setVisible(false);
            telaMenu.setVisible(true);
        } else {
            fieldLogin.setText("");
            fieldSenha.setText("");
            fieldLogin.requestFocus();
        }

    }

    @FXML
    void trocarTelpermissoes(ActionEvent event) {

    }

    @FXML
    void trocarTelprincipal(ActionEvent event) {

        this.telaPrincipal.setVisible(true);
        this.telaCadastro.setVisible(false);
        this.telaLogin.setVisible(false);

    }

}