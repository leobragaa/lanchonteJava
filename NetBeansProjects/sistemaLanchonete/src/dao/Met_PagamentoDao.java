
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Met_Pagamento;

public interface Met_PagamentoDao {
    //
    public void salvar (Met_Pagamento metPagamento)throws SQLException;
    public void editar (Met_Pagamento metPagamento)throws SQLException;
    public List listar ()throws SQLException;
    public void delete (Met_Pagamento metPagamento)throws SQLException;
}
