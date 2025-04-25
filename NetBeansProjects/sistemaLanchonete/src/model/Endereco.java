
package model;

public class Endereco {
    private String rua;
    private String cep;
    private Bairro bairro_id;
    private Double distancia;

    public Endereco(String rua, String cep, Bairro bairro_id, Double distancia) {
        this.rua = rua;
        this.cep = cep;
        this.bairro_id = bairro_id;
        this.distancia = distancia;
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

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }
    
}
