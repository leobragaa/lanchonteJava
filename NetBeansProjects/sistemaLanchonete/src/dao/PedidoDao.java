
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Pedido;

public interface PedidoDao {
    //
    public void salvar (Pedido pedido)throws SQLException;
    public void delete (Pedido pedido)throws SQLException;
    public List listar ()throws SQLException;
    public void editar (Pedido pedido)throws SQLException;

}
