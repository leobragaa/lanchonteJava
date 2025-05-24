
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Cupom;

public interface CupomDao {
    //
    public void salvar(Cupom cupom)throws SQLException;
    public void editar(Cupom cupom)throws SQLException;
    public List listar() throws SQLException;
    public void delete(Cupom cupom)throws SQLException;

}
