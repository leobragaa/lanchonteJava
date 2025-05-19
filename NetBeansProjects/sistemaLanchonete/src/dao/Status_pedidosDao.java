
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Pedido;
import model.Status_pedidos;

public interface Status_pedidosDao {
    //
    public void salvar(Status_pedidos statusPedidos) throws SQLException;
    public void editar(Status_pedidos statusPedidos) throws SQLException;
    public List listar() throws SQLException;
    public void delete(Status_pedidos statusPedidos) throws SQLException;
    //
    public Status_pedidos findtStatusPedidosForId(Integer id);
    public Status_pedidos findtStatusPedidosForProgresso(String progresso_id);
    public Status_pedidos findtStatusPedidosForPedido(Pedido pedido_id);
}
