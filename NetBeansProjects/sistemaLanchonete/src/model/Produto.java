
package model;

import java.util.List;

public class Produto {
    private Integer id;
    private String nome;
    private List<Carrinho>carrinho;

    public Produto(Integer id, String nome, List<Carrinho> carrinho) {
        this.id = id;
        this.nome = nome;
        this.carrinho = carrinho;
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

    public List<Carrinho> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(List<Carrinho> carrinho) {
        this.carrinho = carrinho;
    }
    
}
