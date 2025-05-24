
package dao;
import java.sql.SQLException;
import java.util.List;
import model.Bairro;

public interface BairroDao {
    //
    public void salvar(Bairro bairroData) throws SQLException;
    public void editar(Bairro bairroData) throws SQLException;
    public List listar() throws SQLException;
    public void delete(Bairro bairroData)throws SQLException;
  
}
