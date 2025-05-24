
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Entrega;


public interface EntregaDao {
    //
    public void salvar (Entrega entrega) throws SQLException;
    public void editar (Entrega entrega)throws SQLException;
    public List listar () throws SQLException;
    public void delete (Entrega entrega)throws SQLException;
}
