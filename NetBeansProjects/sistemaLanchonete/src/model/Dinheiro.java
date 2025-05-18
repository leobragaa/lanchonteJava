
package model;

public class Dinheiro {
    private Integer id;
    private Double valorEntregado;
    private Met_Pagamento metPagamento_id;

    public Dinheiro(Integer id, Double valorEntregado, Met_Pagamento metPagamento_id) {
        this.id = id;
        this.valorEntregado = valorEntregado;
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

    public Double getValorEntregado() {
        return valorEntregado;
    }

    public void setValorEntregado(Double valorEntregado) {
        this.valorEntregado = valorEntregado;
    }

    public Met_Pagamento getMetPagamento_id() {
        return metPagamento_id;
    }

    public void setMetPagamento_id(Met_Pagamento metPagamento_id) {
        this.metPagamento_id = metPagamento_id;
    }
    
    
}
