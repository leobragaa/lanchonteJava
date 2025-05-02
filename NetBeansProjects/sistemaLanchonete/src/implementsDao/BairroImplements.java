
package implementsDao;

import conection.Conexao;
import dao.BairroDao;
import java.sql.SQLException;
import java.util.List;
import model.Bairro;

public class BairroImplements implements BairroDao{

    @Override
    public void salvar(Bairro bairroData) throws SQLException {
        //Criando conexao com banco de dados
        Conexao criaConexao = new Conexao();
        criarConexao.criarConexao();
        
        String sql;
        int posicao = 1;
        
        if (bairroData()>0){
            sql = "";
        }
    }

    @Override
    public void editar(Bairro bairroData) {
    }

    @Override
    public List listar(Bairro bairroData) {
        return null;
    }

    @Override
    public void delete(Bairro bairroData) {
    }

    @Override
    public Bairro findIdForBairro(Integer id) {
        return null;
    }

    @Override
    public Bairro findNomeForBairro(String nome_id) {
        return null;
    }

}
