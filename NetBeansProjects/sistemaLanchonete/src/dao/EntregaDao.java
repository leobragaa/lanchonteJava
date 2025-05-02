
package dao;

import java.util.List;
import model.Endereco;

public interface EntregaDao {
    //
    public void salvar (EntregaDao entrega);
    public void editar (EntregaDao entrega);
    public List listar (EntregaDao entrega);
    public void delete (EntregaDao entrega);
    //
    public Endereco findIdForEntrega(Integer id);
    public Endereco findTipoEntregaForEntrega(boolean tipoEntrega_id);
    public Endereco findClienteForEntrega(String cliente_id);
    public Endereco findDeliveryForEntrega(String delivery_id);
    public Endereco findPedidoForEntrega(String pedido_id);
    public Endereco findStatusPedidoForEntrega(String statusPedidos_id);
}
