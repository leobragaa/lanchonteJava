
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Carrinho;

public interface CarrinhoDao {
    //
    public void salvar(Carrinho carrinho) throws SQLException;
    public void editar(Carrinho carrinho);
    public List listar() throws SQLException;
    public void delete(Carrinho carrinho);
    //
    public Carrinho findIdForCarrinho(Integer id);
    public Carrinho findProdutoForCarrinho(String produto_id);
    public Carrinho findEscolhaForCarrinho(Integer ingredienteEscolha);
    public Carrinho findQuantidadeForCarrinho(Integer qtnd_id);
    
}
