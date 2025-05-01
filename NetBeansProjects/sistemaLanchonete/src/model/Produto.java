
package model;

import java.util.List;

public class Produto {
    private int id;
    private String nome;
    private List<Carrinho>carrinho;

    public Produto(int id, String nome, List<Carrinho> carrinho) {
        this.id = id;
        this.nome = nome;
        this.carrinho = carrinho;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
