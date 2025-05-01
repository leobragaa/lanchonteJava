
package dao;

import model.Pedido;
import model.Status_pedidos;

public interface Status_pedidosDao {
    //
    public void salvar(Status_pedidosDao statusPedidos);
    public void editar(Status_pedidosDao statusPedidos);
    public void delete(Status_pedidosDao statusPedidos);
    //
    public Status_pedidos findtStatusPedidosForId(Integer id);
    public Status_pedidos findtStatusPedidosForProgresso(String progresso);
    public Status_pedidos findtStatusPedidosForPedido(Pedido pedido);
}
