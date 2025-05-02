
package dao;

import java.sql.SQLException;
import model.Carrinho;
import model.Ingrediente_Escolha;
import model.Produto;

public interface CarrinhoDao {
    //
    public void salvar(Carrinho carrinho) throws SQLException;
    public void editar(Carrinho carrinho);
    public void delete(Carrinho carrinho);
    //
    public Carrinho findIdForCarrinho(Integer id);
    public Carrinho findProdutoForCarrinho(Produto produto_id);
    public Carrinho findEscolhaForCarrinho(Ingrediente_Escolha ingredienteEscolha);
    public Carrinho findQuantidadeForCarrinho(Integer quantidade);
    
}
