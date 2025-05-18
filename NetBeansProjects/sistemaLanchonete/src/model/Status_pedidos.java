
package model;

public class Status_pedidos {
    private Integer id;
    private String progresso;
    private Pedido pedido;

    public Status_pedidos(String progresso, Pedido pedido, Integer id) {
        this.progresso = progresso;
        this.pedido = pedido;
        this.id = id;
    }
    public Status_pedidos(){

    }
    public int getId() {
        return id;
    }

    public void setId(Integer id) {
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
