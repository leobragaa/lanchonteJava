
package dao;

import java.util.Date;
import java.util.List;
import model.Pedido;

public interface PedidoDao {
    //
    public void salvar (Pedido pedido);
    public void delete (Pedido pedido);
    public List listar (Pedido pedido);
    public void editar (Pedido pedido);
    //
    public Pedido findIdForPedido (Integer id);
    public Pedido findHoraForPedido (String hora_pedido);
    public Pedido findClienteForPedido (String cliente_id);
    public Pedido findNumeroaForPedido (Integer numero_pedido);
    public Pedido findDataForPedido (Date data_pedido);
    public Pedido findStatusForPedido (String status_id);
    public Pedido findEntregaForPedido (Integer entrega_id);
    public Pedido findReembolsoForPedido (Integer reembolso_id);
    public Pedido findCarrinhoForPedido(String carrinho_id);
}
