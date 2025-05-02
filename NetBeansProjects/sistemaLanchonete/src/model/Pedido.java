
package model;

import java.util.Date;
import java.util.List;

public class Pedido {
    private Integer id;
    private String hora_pedido;
    private Cliente cliente_id;
    private Integer numero_pedido;
    private Date data_pedido;
    private Status_pedidos status_id;
    private Entrega entrega_id;
    private Reembolso reembolso_id;
    private List<Carrinho>carrinho_id;
    
    public Pedido(Integer id, String hora_pedido, Cliente cliente_id, Integer numero_pedido,List carrinho_id, Date data_pedido, Status_pedidos status_id, Entrega entrega_id, Reembolso reembolso_id) {
        this.id = id;
        this.hora_pedido = hora_pedido;
        this.cliente_id = cliente_id;
        this.numero_pedido = numero_pedido;
        this.carrinho_id = carrinho_id;
        this.data_pedido = data_pedido;
        this.status_id = status_id;
        this.entrega_id = entrega_id;
        this.reembolso_id = reembolso_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHora_pedido() {
        return hora_pedido;
    }

    public void setHora_pedido(String hora_pedido) {
        this.hora_pedido = hora_pedido;
    }

    public Cliente getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Cliente cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Integer getNumero_pedido() {
        return numero_pedido;
    }

    public void setNumero_pedido(Integer numero_pedido) {
        this.numero_pedido = numero_pedido;
    }

    public List<Carrinho> getCarrinho_id() {
        return carrinho_id;
    }

    public void setCarrinho_id(List carrinho_id) {
        this.carrinho_id = carrinho_id;
    }

    public Date getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(Date data_pedido) {
        this.data_pedido = data_pedido;
    }

    public Status_pedidos getStatus_id() {
        return status_id;
    }

    public void setStatus_id(Status_pedidos status_id) {
        this.status_id = status_id;
    }

    public Entrega getEntrega_id() {
        return entrega_id;
    }

    public void setEntrega_id(Entrega entrega_id) {
        this.entrega_id = entrega_id;
    }

    public Reembolso getReembolso_id() {
        return reembolso_id;
    }

    public void setReembolso_id(Reembolso reembolso_id) {
        this.reembolso_id = reembolso_id;
    }
    
    
            
}
