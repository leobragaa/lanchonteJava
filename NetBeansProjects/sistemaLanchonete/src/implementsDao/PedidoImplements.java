
package implementsDao;

import dao.PedidoDao;
import java.util.Date;
import model.Pedido;

public class PedidoImplements implements PedidoDao{

    @Override
    public void salvar(Pedido pedido) {
    }

    @Override
    public void delete(Pedido pedido) {
    }

    @Override
    public void editar(Pedido pedido) {
    }

    @Override
    public Pedido findIdForPedido(Integer id) {
        return null;
    }

    @Override
    public Pedido findHoraForPedido(String hora_pedido) {
        return null;
    }

    @Override
    public Pedido findClienteForPedido(String cliente_id) {
        return null;
    }

    @Override
    public Pedido findNumeroaForPedido(Integer numero_pedido) {
        return null;
    }

    @Override
    public Pedido findDataForPedido(Date data_pedido) {
        return null;
    }

    @Override
    public Pedido findStatusForPedido(String status_id) {
        return null;
    }

    @Override
    public Pedido findEntregaForPedido(Integer entrega_id) {
        return null;
    }

    @Override
    public Pedido findReembolsoForPedido(Integer reembolso_id) {
        return null;
    }

    @Override
    public Pedido findCarrinhoForPedido(String carrinho_id) {
        return null;
    }

}
