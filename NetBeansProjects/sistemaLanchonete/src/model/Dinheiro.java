
package model;

public class Dinheiro {
    private Integer id;
    private Double valorEntregado;

    public Dinheiro(Integer id, Double valorEntregado) {
        this.id = id;
        this.valorEntregado = valorEntregado;
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
    
}
