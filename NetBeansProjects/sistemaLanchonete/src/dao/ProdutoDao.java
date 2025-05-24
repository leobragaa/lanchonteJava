
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Carrinho;
import model.Produto;

public interface ProdutoDao {
    //
    public void salvar(Produto produto)throws SQLException;
    public void delete(Produto produto)throws SQLException;
    public List listar()throws SQLException;
    public void editar(Produto produto)throws SQLException;
    //
    public Produto findProdutoForId (Integer id);
    public Produto findProdutoForNome (String nome_id);
    public Produto findProdutoForCarrinho (List<Carrinho> carrinho_id);
}
