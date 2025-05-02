
package dao;

import model.Status_pedidos;

public interface Status_pedidosDao {
    //
    public void salvar(Status_pedidos statusPedidos);
    public void editar(Status_pedidos statusPedidos);
    public void delete(Status_pedidos statusPedidos);
    //
    public Status_pedidos findtStatusPedidosForId(Integer id);
    public Status_pedidos findtStatusPedidosForProgresso(String progresso_id);
    public Status_pedidos findtStatusPedidosForPedido(String pedido_id);
}
