
package dao;

import java.util.Date;
import model.Carrinho;
import model.Cliente;
import model.Entrega;
import model.Pedido;
import model.Reembolso;
import model.Status_pedidos;

public interface PedidoDao {
    //
    public void salvar (PedidoDao pedido);
    public void delete (PedidoDao pedido);
    public void editar (PedidoDao pedido);
    //
    public Pedido findIdForPedido (Integer id);
    public Pedido findHoraForPedido (String hora_pedido);
    public Pedido findClienteForPedido (Cliente cliente_id);
    public Pedido findNumeroaForPedido (Integer numero_pedido);
    public Pedido findDataForPedido (Date data_pedido);
    public Pedido findStatusForPedido (Status_pedidos status_id);
    public Pedido findEntregaForPedido (Entrega entrega_id);
    public Pedido findReembolsoForPedido (Reembolso reembolso_id);
    public Pedido findCarrinhoForPedido(Carrinho carrinho_id);
}
