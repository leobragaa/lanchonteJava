
package dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import model.Carrinho;
import model.Cliente;
import model.Entrega;
import model.Pedido;
import model.Reembolso;
import model.Status_pedidos;

public interface PedidoDao {
    //
    public void salvar (Pedido pedido)throws SQLException;
    public void delete (Pedido pedido)throws SQLException;
    public List listar ()throws SQLException;
    public void editar (Pedido pedido)throws SQLException;
    //
    public Pedido findIdForPedido (Integer id);
    public Pedido findHoraForPedido (String hora_pedido);
    public Pedido findClienteForPedido (Cliente cliente_id);
    public Pedido findNumeroaForPedido (Integer numero_pedido);
    public Pedido findDataForPedido (Date data_pedido);
    public Pedido findStatusForPedido (Status_pedidos status_id);
    public Pedido findEntregaForPedido (Entrega entrega_id);
    public Pedido findReembolsoForPedido (List<Reembolso> reembolso_id);
    public Pedido findCarrinhoForPedido(List<Carrinho> carrinho_id);
}
