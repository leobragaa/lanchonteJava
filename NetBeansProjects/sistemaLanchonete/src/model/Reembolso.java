
package model;

public class Reembolso {
    private Integer id;
    private String motivo;
    private Pedido pedido_id;

    public Reembolso(Integer id, String motivo, Pedido pedido_id) {
        this.id = id;
        this.motivo = motivo;
        this.pedido_id = pedido_id;
    }

    public Reembolso() {
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Pedido getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(Pedido pedido_id) {
        this.pedido_id = pedido_id;
    }
    
}
