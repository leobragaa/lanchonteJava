
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Carrinho;

public interface CarrinhoDao {
    //
    public void salvar(Carrinho carrinho) throws SQLException;
    public void editar(Carrinho carrinho) throws SQLException;
    public List listar() throws SQLException;
    public void delete(Carrinho carrinho) throws SQLException;

}
