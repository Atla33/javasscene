package Persistencia;

import Dominio.Arquivo;
import com.example.condo.Persistencia.Conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ArquivoDAO {

    private Conexao minhaConexao;
    private final String INCLUIR = "insert into \"Arquivos\" (\"arquivosID\", \"tipoarquivo\", "
            + "\"dadoarquivo\", \"criadoem\", \"modifcadoem\") values (?, ?, ?, ?, ?)";
    private final String BUSCAR = "select * from \"Arquivos\" where \"arquivosID\"=?";
    private final String ALTERAR = "update \"Arquivos\" set \"arquivosID\"=?, \"tipoarquivo\"=?, "
            + "\"dadoarquivo\"=?, \"criadoem\"=?, \"modifcadoem\"=? where \"arquivosID\"=?";
    private final String EXCLUIR = "delete from \"Arquivos\" where \"arquivosID\"=?";


    public ArquivoDAO(){
        minhaConexao = new Conexao();
    }

    public void inclusao(Arquivo a){
        try{
            minhaConexao.conectar();
            PreparedStatement instrucao = minhaConexao.getConexao().prepareStatement(INCLUIR);
            instrucao.setInt(1, a.getId());
            instrucao.setString(2, a.gettipoArquivo());
            instrucao.setString(3, a.getDadoArquivo());
            instrucao.setDate(4, a.getCriadoEm());
            instrucao.setDate(5, a.getModificadoEm());
            instrucao.execute();
            minhaConexao.desconectar();
        }catch(Exception e){
            System.out.println("Erro na inclus�o: "+e.getMessage());
        }
    }

    public Arquivo buscar(int id){
        Arquivo a = null;
        try{
            minhaConexao.conectar();
            PreparedStatement instrucao = minhaConexao.getConexao().prepareStatement(BUSCAR);
            instrucao.setInt(1, id);
            ResultSet rs = instrucao.executeQuery();
            if(rs.next()){
                a = new Arquivo(rs.getInt("id"),rs.getString("tipoArquivo"),
                        rs.getString("dadoArquivo"), rs.getDate("criadoEm"),
                        rs.getDate("modificadoEm"));
            }
            minhaConexao.desconectar();
        }catch(SQLException e){
            System.out.println("Erro na busca: "+e.getMessage());
        }
        return a;
    }

    public void alteracao(Arquivo a, int idAntigo){
        try{
            minhaConexao.conectar();
            PreparedStatement instrucao = minhaConexao.getConexao().prepareStatement(ALTERAR);
            instrucao.setInt(1, a.getId());
            instrucao.setString(2, a.gettipoArquivo());
            instrucao.setString(3, a.getDadoArquivo());
            instrucao.setDate(4, a.getCriadoEm());
            instrucao.setDate(5, a.getModificadoEm());
            instrucao.setInt(4, idAntigo);
            instrucao.execute();
            minhaConexao.desconectar();
        }catch(Exception e){
            System.out.println("Erro na altera��o: "+e.getMessage());
        }
    }

    public void exclusao(int id){
        try{
            minhaConexao.conectar();
            PreparedStatement instrucao = minhaConexao.getConexao().prepareStatement(EXCLUIR);
            instrucao.setInt(1, id);
            instrucao.execute();
            minhaConexao.desconectar();
        }catch(Exception e){
            System.out.println("Erro na exclus�o: "+e.getMessage());
        }
    }
}
