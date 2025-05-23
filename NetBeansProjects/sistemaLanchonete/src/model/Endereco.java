
package model;

public class Endereco {
    private Integer id;
    private String rua;
    private String cep;
    private Bairro bairro_id;
    private Double distancia_id;
    private Delivery delivery_id;
    private Taxa_Entrega taxaEntrega_id;

    public Endereco() {
    }

    public Endereco(Integer id, String rua, String cep, Bairro bairro_id, Double distancia_id, Delivery delivery_id, Taxa_Entrega taxaEntrega_id) {
        this.id = id;
        this.rua = rua;
        this.cep = cep;
        this.bairro_id = bairro_id;
        this.distancia_id = distancia_id;
        this.delivery_id = delivery_id;
        this.taxaEntrega_id = taxaEntrega_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Bairro getBairro_id() {
        return bairro_id;
    }

    public void setBairro_id(Bairro bairro_id) {
        this.bairro_id = bairro_id;
    }

    public Double getDistancia_id() {
        return distancia_id;
    }

    public void setDistancia_id(Double distancia_id) {
        this.distancia_id = distancia_id;
    }

    public Delivery getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(Delivery delivery_id) {
        this.delivery_id = delivery_id;
    }

    public Taxa_Entrega getTaxaEntrega_id() {
        return taxaEntrega_id;
    }

    public void setTaxaEntrega_id(Taxa_Entrega taxaEntrega_id) {
        this.taxaEntrega_id = taxaEntrega_id;
    }
    
}
