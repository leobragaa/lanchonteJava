
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Reembolso;

public interface ReembolsoDao {
    //
    public void salvar(Reembolso rembolso) throws SQLException;
    public void editar(Reembolso rembolso)throws SQLException;;
    public List listar()throws SQLException;;
    public void delete(Reembolso rembolso)throws SQLException;;

}
