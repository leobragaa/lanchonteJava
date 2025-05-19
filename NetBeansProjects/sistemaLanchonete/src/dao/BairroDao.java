
package dao;
import java.sql.SQLException;
import java.util.List;
import model.Bairro;
import model.Endereco;

public interface BairroDao {
    //
    public void salvar(Bairro bairroData) throws SQLException;
    public void editar(Bairro bairroData) throws SQLException;
    public List listar() throws SQLException;
    public void delete(Bairro bairroData)throws SQLException;
    //
    public Bairro findIdForBairro (Integer id);
    public Bairro findNomeForBairro (String nome_id);
    public Bairro findEnderecoForBairro (Endereco endereco_id);
}
