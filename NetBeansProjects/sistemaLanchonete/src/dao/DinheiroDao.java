
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Dinheiro;

public interface DinheiroDao {
    //
    public void salvar(Dinheiro dinheiro) throws SQLException;
    public void delete(Dinheiro dinheiro);
    public List listar() throws SQLException;
    public void editar(Dinheiro dinheiro);
    //
    public Dinheiro findIdForDinheiro(Integer id);
    public Dinheiro findValorEntregaForDinheiro(Double valorEntrega_id);
}
