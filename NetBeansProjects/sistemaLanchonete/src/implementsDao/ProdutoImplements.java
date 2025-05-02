
package implementsDao;

import dao.ProdutoDao;
import model.Produto;

public class ProdutoImplements implements ProdutoDao{

    @Override
    public void salvar(Produto produto) {
    }

    @Override
    public void delete(Produto produto) {
    }

    @Override
    public void editar(Produto produto) {
    }

    @Override
    public Produto findProdutoForId(Integer id) {
        return null;
    }

    @Override
    public Produto findProdutoForNome(String nome_id) {
        return null;
    }

    @Override
    public Produto findProdutoForCarrinho(String carrinho_id) {
        return null;
    }

}
