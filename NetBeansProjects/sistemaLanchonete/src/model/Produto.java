
package model;

import java.util.List;

public class Produto {
    private String nome;
    List<Carrinho>carrinho;

    public Produto(String nome, List<Carrinho> carrinho) {
        this.nome = nome;
        this.carrinho = carrinho;
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
