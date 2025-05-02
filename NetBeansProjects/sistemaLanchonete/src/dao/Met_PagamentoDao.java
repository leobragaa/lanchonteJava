
package dao;

import model.Cartao;
import model.Dinheiro;
import model.Met_Pagamento;

public interface Met_PagamentoDao {
    //
    public void salvar (Met_PagamentoDao metPagemento);
    public void editar (Met_PagamentoDao metPagemento);
    public void delete (Met_PagamentoDao metPagemento);
    //
    public Met_Pagamento findIdForMetPagamento (Integer id);
    public Met_Pagamento findPixForMetPagamento (String pix);
    public Met_Pagamento findDinheiroForMetPagamento (Dinheiro dinheiro_id);
    public Met_Pagamento findCartaoForMetPagamento (Cartao cartao_id);
}
