
package dao;
import java.sql.SQLException;
import model.Bairro;

public interface BairroDao {
    //
    public void salvar(Bairro bairroData) throws SQLException;
    public void editar(Bairro bairroData);
    public void listar(Bairro bairroData);
    public void delete(Bairro bairroData);
    //
    public Bairro findIdForBairro (Integer id);
    public Bairro findNomeForBairro (String nome_id);
}
