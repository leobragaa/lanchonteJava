
package dao;

import java.util.List;
import java.sql.SQLException;
import model.Cliente;

public interface ClienteDao {
    //
    public void salvar(Cliente cliente) throws SQLException;
    public void editar(Cliente cliente) throws SQLException;
    public List listar() throws SQLException;
    public void delete(Cliente cliente) throws SQLException;
}
