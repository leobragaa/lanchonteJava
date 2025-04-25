
package model;

public class Delivery {
    private Integer chaveEntrega;
    private Integer numero;
    private String complemento;
    private Endereco endereco_id;

    public Delivery(Integer chaveEntrega, Integer numero, String complemento, Endereco endereco_id) {
        this.chaveEntrega = chaveEntrega;
        this.numero = numero;
        this.complemento = complemento;
        this.endereco_id = endereco_id;
    }

    public Integer getChaveEntrega() {
        return chaveEntrega;
    }

    public void setChaveEntrega(Integer chaveEntrega) {
        this.chaveEntrega = chaveEntrega;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Endereco getEndereco_id() {
        return endereco_id;
    }

    public void setEndereco_id(Endereco endereco_id) {
        this.endereco_id = endereco_id;
    }
    
    
}
