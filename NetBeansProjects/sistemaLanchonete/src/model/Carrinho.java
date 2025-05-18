
package model;

public class Carrinho {
    private Integer id;
    private Produto produto_id;
    private Ingrediente_Escolha ingredienteEscolha_id;
    private Integer quantidade;

    public Carrinho(Integer id, Produto produto_id, Ingrediente_Escolha ingredienteEscolha_id, Integer quantidade) {
        this.id =  id;
        this.produto_id = produto_id;
        this.ingredienteEscolha_id = ingredienteEscolha_id;
        this.quantidade = quantidade;
    }

    public Carrinho() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Produto getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(Produto produto_id) {
        this.produto_id = produto_id;
    }

    public Ingrediente_Escolha getIngredienteEscolha_id() {
        return ingredienteEscolha_id;
    }

    public void setIngredienteEscolha_id(Ingrediente_Escolha ingredienteEscolha_id) {
        this.ingredienteEscolha_id = ingredienteEscolha_id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

}
