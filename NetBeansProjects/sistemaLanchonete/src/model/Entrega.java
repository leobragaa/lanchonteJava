
package model;

import java.util.List;

public class Entrega {
    private Integer id;
    private boolean tipoEntrega;
    private Cliente cliente_id;
    private List<Delivery> deleviry_id;
    private Pedido pedido_id;
    private Status_pedidos status_pedidos_id;

    public Entrega(Integer id, boolean tipoEntrega, Cliente cliente_id, List<Delivery> deleviry_id, Pedido pedido_id, Status_pedidos status_pedidos_id) {
        this.id = id;
        this.tipoEntrega = tipoEntrega;
        this.cliente_id = cliente_id;
        this.deleviry_id = deleviry_id;
        this.pedido_id = pedido_id;
        this.status_pedidos_id = status_pedidos_id;
    }

    public Entrega() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(boolean tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public Cliente getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Cliente cliente_id) {
        this.cliente_id = cliente_id;
    }

    public List<Delivery> getDeleviry_id() {
        return deleviry_id;
    }

    public void setDeleviry_id(List<Delivery> deleviry_id) {
        this.deleviry_id = deleviry_id;
    }

    public Pedido getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(Pedido pedido_id) {
        this.pedido_id = pedido_id;
    }

    public Status_pedidos getStatus_pedidos_id() {
        return status_pedidos_id;
    }

    public void setStatus_pedidos_id(Status_pedidos status_pedidos_id) {
        this.status_pedidos_id = status_pedidos_id;
    }

}
