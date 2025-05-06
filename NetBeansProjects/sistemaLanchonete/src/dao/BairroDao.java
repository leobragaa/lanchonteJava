
package dao;
import java.sql.SQLException;
import java.util.List;
import model.Bairro;

public interface BairroDao {
    //
    public void salvar(Bairro bairroData) throws SQLException;
    public void editar(Bairro bairroData);
    public List listar() throws SQLException;
    public void delete(Bairro bairroData);
    //
    public Bairro findIdForBairro (Integer id);
    public Bairro findNomeForBairro (String nome_id);
}
