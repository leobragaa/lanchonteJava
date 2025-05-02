
package implementsDao;

import dao.Status_pedidosDao;
import model.Status_pedidos;

public class Status_pedidosImplements implements Status_pedidosDao{

    @Override
    public void salvar(Status_pedidos statusPedidos) {
    }

    @Override
    public void editar(Status_pedidos statusPedidos) {
    }

    @Override
    public void delete(Status_pedidos statusPedidos) {
    }

    @Override
    public Status_pedidos findtStatusPedidosForId(Integer id) {
        return null;
    }

    @Override
    public Status_pedidos findtStatusPedidosForProgresso(String progresso_id) {
        return null;
    }

    @Override
    public Status_pedidos findtStatusPedidosForPedido(String pedido_id) {
        return null;
    }

    
}
