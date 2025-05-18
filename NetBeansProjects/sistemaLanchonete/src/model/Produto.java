
package model;

import java.util.List;

public class Produto {
    private Integer id;
    private String nome;
    private Double valorUnitario;
    private List<Carrinho>carrinho;

    public Produto(Integer id, String nome, Double valorUnitario, List<Carrinho> carrinho) {
        this.id = id;
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.carrinho = carrinho;
    }

    public Produto(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public List<Carrinho> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(List<Carrinho> carrinho) {
        this.carrinho = carrinho;
    }
    
}
