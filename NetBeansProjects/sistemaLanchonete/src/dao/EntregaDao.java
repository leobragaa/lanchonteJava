
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Entrega;

public interface EntregaDao {
    //
    public void salvar (Entrega entrega) throws SQLException;
    public void editar (Entrega entrega);
    public List listar () throws SQLException;
    public void delete (Entrega entrega);
    //
    public Entrega findIdForEntrega(Integer id);
    public Entrega findTipoEntregaForEntrega(boolean tipoEntrega_id);
    public Entrega findClienteForEntrega(String cliente_id);
    public Entrega findDeliveryForEntrega(String delivery_id);
    public Entrega findPedidoForEntrega(String pedido_id);
    public Entrega findStatusPedidoForEntrega(String statusPedidos_id);
}
