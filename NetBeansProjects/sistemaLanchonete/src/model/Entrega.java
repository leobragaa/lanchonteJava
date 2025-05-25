
package model;


public class Entrega {
    private Integer id;
    private int tipoEntrega_id;
    private Cliente cliente_id;
    private Delivery deleviry_id;
    private Pedido pedido_id;
    private Status_pedidos status_pedidos_id;

    public Entrega(Integer id, int tipoEntrega_id, Cliente cliente_id, Delivery deleviry_id, Pedido pedido_id, Status_pedidos status_pedidos_id) {
        this.id = id;
        this.tipoEntrega_id = tipoEntrega_id;
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

    public int getTipoEntrega_id() {
        return tipoEntrega_id;
    }

    public void setTipoEntrega_id(int tipoEntrega_id) {
        this.tipoEntrega_id = tipoEntrega_id;
    }

    public Cliente getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Cliente cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Delivery getDeleviry_id() {
        return deleviry_id;
    }

    public void setDeleviry_id(Delivery deleviry_id) {
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
