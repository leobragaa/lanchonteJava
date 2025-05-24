
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Dinheiro;

public interface DinheiroDao {
    //
    public void salvar(Dinheiro dinheiro) throws SQLException;
    public void delete(Dinheiro dinheiro)throws SQLException;
    public List listar() throws SQLException;
    public void editar(Dinheiro dinheiro)throws SQLException;

}
