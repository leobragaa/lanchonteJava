
package model;

public class Dinheiro {
    private Integer id;
    private Double valorEntrega;
    private Met_Pagamento metPagamento_id;

    public Dinheiro(Integer id, Double valorEntrega, Met_Pagamento metPagamento_id) {
        this.id = id;
        this.valorEntrega = valorEntrega;
        this.metPagamento_id = metPagamento_id;
    }

    public Dinheiro() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getValorEntrega() {
        return valorEntrega;
    }

    public void setValorEntrega(Double valorEntrega) {
        this.valorEntrega = valorEntrega;
    }

    public Met_Pagamento getMetPagamento_id() {
        return metPagamento_id;
    }

    public void setMetPagamento_id(Met_Pagamento metPagamento_id) {
        this.metPagamento_id = metPagamento_id;
    }
    
    
}
