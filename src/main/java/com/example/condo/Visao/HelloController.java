package com.example.condo.Visao;

import Dominio.Eventos;

import Persistencia.MoradorDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import com.example.condo.Dominio.*;
import com.example.condo.Persistencia.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {

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
    private TableColumn<?, ?> tabcDescricaoevento;

    @FXML
    private TableColumn<?, ?> tabcDuracaoevento;

    @FXML
    private TableColumn<?, ?> tabcIDevento;

    @FXML
    private TableColumn<?, ?> tabcLocalevento;

    @FXML
    private TableColumn<?, ?> tabcTipoevento;

    @FXML
    private TableView<?> tabvEventos;

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
    private AnchorPane telaEvento;

    @FXML
    private AnchorPane telaLogin;

    @FXML
    private AnchorPane telaMenu;

    @FXML
    private AnchorPane telaPrincipal;

    @FXML
    private Button trocarTelabae;

    @FXML
    void TrocarTelaalteracao(ActionEvent event) {

    }

    @FXML
    void realizarAlteracaocadastro(ActionEvent event) {

    }

    @FXML
    void realizarAlteracaoevento(ActionEvent event) {

    }

    @FXML
    void realizarAlteraçãoevento(ActionEvent event) {

    }

    @FXML
    void realizarBusca(ActionEvent event) {

    }

    @FXML
    void realizarBuscaevento(ActionEvent event) {

    }

    @FXML
    void realizarCadastro(ActionEvent event) {

    }

    @FXML
    void voltarTelcadastromotador(ActionEvent event) {

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

    }

    @FXML
    void trocarTelarquivo(ActionEvent event) {

    }

    @FXML
    void trocarTelbae(ActionEvent event) {

    }

    @FXML
    void trocarTelcadastro(ActionEvent event) {

        this.telaPrincipal.setVisible(false);
        this.telaLogin.setVisible(false);
        this.telaCadastro.setVisible(true);
    }

    @FXML
    void trocarTelconsulta(ActionEvent event) {

    }

    @FXML
    void trocarTelevento(ActionEvent event) {

    }

    @FXML
    void trocarTellogin(ActionEvent event) {

        this.telaPrincipal.setVisible(false);
        this.telaCadastro.setVisible(false);
        this.telaLogin.setVisible(true);

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

    }

}