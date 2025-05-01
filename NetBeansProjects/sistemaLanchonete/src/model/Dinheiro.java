
package model;

public class Dinheiro {
    private int id;
    private Double valorEntregado;

    public Dinheiro(int id, Double valorEntregado) {
        this.id = id;
        this.valorEntregado = valorEntregado;
    }

    public int getId() {
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
