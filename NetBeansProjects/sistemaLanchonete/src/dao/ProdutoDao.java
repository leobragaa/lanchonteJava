
package dao;

import model.Produto;

public interface ProdutoDao {
    //
    public void salvar(Produto produto);
    public void delete(Produto produto);
    public void editar(Produto produto);
    //
    public Produto findProdutoForId (Integer id);
    public Produto findProdutoForNome (String nome_id);
    public Produto findProdutoForCarrinho (String carrinho_id);
}
