
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Taxa_Entrega;

public interface Taxa_EntregaDao {
    //
    public void salvar(Taxa_Entrega taxaDaEntrega) throws SQLException;
    public void editar(Taxa_Entrega taxaDaEntrega) throws SQLException;
    public List listar() throws SQLException;
    public void delete(Taxa_Entrega taxaDaEntrega) throws SQLException;
    
}
