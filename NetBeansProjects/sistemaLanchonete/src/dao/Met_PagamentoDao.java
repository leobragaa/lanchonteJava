
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Cartao;
import model.Dinheiro;
import model.Met_Pagamento;

public interface Met_PagamentoDao {
    //
    public void criarConexao();
    public void salvar (Met_Pagamento metPagemento)throws SQLException;
    public void editar (Met_Pagamento metPagemento)throws SQLException;
    public List listar ()throws SQLException;
    public void delete (Met_Pagamento metPagemento)throws SQLException;
    //
    public Met_Pagamento findIdForMetPagamento (Integer id);
    public Met_Pagamento findPixForMetPagamento (Double pix_id);
    public List<Met_Pagamento> findDinheiroForMetPagamento (List<Dinheiro> dinheiro_id);
    public List<Met_Pagamento> findCartaoForMetPagamento (List<Cartao> cartao_id);
}
