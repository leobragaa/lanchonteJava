
package dao;

import model.Bairro;
import model.Cliente;
import model.Delivery;
import model.Endereco;
import model.Pedido;
import model.Status_pedidos;

public interface EntregaDao {
    //
    public void salvar (EntregaDao entrega);
    public void editar (EntregaDao entrega);
    public void delete (EntregaDao entrega);
    //
    public Endereco findIdForEntrega(Integer id);
    public Endereco findTipoEntregaForEntrega(boolean tipoEntrega);
    public Endereco findClienteForEntrega(Cliente cliente_id);
    public Endereco findDeliveryForEntrega(Delivery deleviry_id);
    public Endereco findPedidoForEntrega(Pedido pedido_id);
    public Endereco findStatusPedidoForEntrega(Status_pedidos status_pedidos_id);
}
