
package dao;

import java.util.List;
import model.Met_Pagamento;

public interface Met_PagamentoDao {
    //
    public void criarConexao();
    public void salvar (Met_Pagamento metPagemento);
    public void editar (Met_Pagamento metPagemento);
    public List listar (Met_Pagamento metPagemento);
    public void delete (Met_Pagamento metPagemento);
    //
    public Met_Pagamento findIdForMetPagamento (Integer id);
    public Met_Pagamento findPixForMetPagamento (String pix_id);
    public Met_Pagamento findDinheiroForMetPagamento (Integer dinheiro_id);
    public Met_Pagamento findCartaoForMetPagamento (Integer cartao_id);
}
