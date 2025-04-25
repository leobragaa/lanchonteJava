
package model;

public class Status_pedidos {
    private String progresso;
    private Pedido pedido;

    public Status_pedidos(String progresso, Pedido pedido) {
        this.progresso = progresso;
        this.pedido = pedido;
    }

    public String getProgresso() {
        return progresso;
    }

    public void setProgresso(String progresso) {
        this.progresso = progresso;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
}
