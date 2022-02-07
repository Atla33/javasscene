package Persistencia;

import java.util.ArrayList;

import Dominio.Protocolo;

public interface IProtocoloDAO {
    ArrayList<Protocolo> buscarPorIdUsuario(int id_usuario);
    Protocolo buscarPoridProtocolo( int id);
    void excluirProtocolo(int id);
    void alterarProtocolo(Protocolo prot, int id_prot);
    void inserirUsuario(Protocolo prot);
}
