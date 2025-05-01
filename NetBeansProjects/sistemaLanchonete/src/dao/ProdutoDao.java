
package dao;

import model.Carrinho;
import model.Produto;

public interface ProdutoDao {
    //
    public void salvar(ProdutoDao produto);
    public void delete(ProdutoDao produto);
    public void editar(ProdutoDao produto);
    //
    public Produto findProdutoForId (Integer id);
    public Produto findProdutoForNome (String nome);
    public Produto findProdutoForCarrinho (Carrinho carrinho);
}
