
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Pagamento;

public interface PagamentoDao {
    //
    public void salvar(Pagamento pagamento)throws SQLException;
    public void editar(Pagamento pagamento)throws SQLException;
    public List listar()throws SQLException;
    public void delete(Pagamento pagamento)throws SQLException;

}
