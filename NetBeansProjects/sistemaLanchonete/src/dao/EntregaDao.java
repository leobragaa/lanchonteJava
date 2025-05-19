
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Delivery;
import model.Entrega;
import model.Pedido;
import model.Status_pedidos;

public interface EntregaDao {
    //
    public void salvar (Entrega entrega) throws SQLException;
    public void editar (Entrega entrega)throws SQLException;
    public List listar () throws SQLException;
    public void delete (Entrega entrega)throws SQLException;
    //
    public Entrega findIdForEntrega(Integer id);
    public Entrega findTipoEntregaForEntrega(boolean tipoEntrega_id);
    public Entrega findClienteForEntrega(String cliente_id);
    public List<Entrega> findDeliveryForEntrega(List<Delivery> delivery_id);
    public Entrega findPedidoForEntrega(Pedido pedido_id);
    public Entrega findStatusPedidoForEntrega(Status_pedidos statusPedidos_id);
}
