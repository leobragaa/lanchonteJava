
package model;

public class Pagamento {
    private Met_Pagamento metPagamento_id;
    private Cupom cupom_id;
    private Pedido pedido_id;

    public Pagamento(Met_Pagamento metPagamento_id, Cupom cupom_id, Pedido pedido_id) {
        this.metPagamento_id = metPagamento_id;
        this.cupom_id = cupom_id;
        this.pedido_id = pedido_id;
    }

    public Met_Pagamento getMetPagamento_id() {
        return metPagamento_id;
    }

    public void setMetPagamento_id(Met_Pagamento metPagamento_id) {
        this.metPagamento_id = metPagamento_id;
    }

    public Cupom getCupom_id() {
        return cupom_id;
    }

    public void setCupom_id(Cupom cupom_id) {
        this.cupom_id = cupom_id;
    }

    public Pedido getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(Pedido pedido_id) {
        this.pedido_id = pedido_id;
    }
    
}