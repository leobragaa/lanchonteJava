
package model;

public class Status_pedidos {
    private String progresso;
    private Pedido pedido;
    private int id;

    public Status_pedidos(String progresso, Pedido pedido, int id) {
        this.progresso = progresso;
        this.pedido = pedido;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
