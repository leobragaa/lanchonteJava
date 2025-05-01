
package model;

public class Taxa_Entrega {
    private int id;
    private Double taxaEntrega;
    private Endereco endereco_id;

    public Taxa_Entrega(int id, Double taxaEntrega, Endereco endereco_id) {
        this.id = id;
        this.taxaEntrega = taxaEntrega;
        this.endereco_id = endereco_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(Double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public Endereco getEndereco_id() {
        return endereco_id;
    }

    public void setEndereco_id(Endereco endereco_id) {
        this.endereco_id = endereco_id;
    }
    
}
