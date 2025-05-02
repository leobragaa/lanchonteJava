
package implementsDao;

import dao.Met_PagamentoDao;
import model.Met_Pagamento;

public class Met_PagamentoImplements implements Met_PagamentoDao{

    @Override
    public void criarConexao() {
    }

    @Override
    public void salvar(Met_Pagamento metPagemento) {
    }

    @Override
    public void editar(Met_Pagamento metPagemento) {
    }

    @Override
    public void delete(Met_Pagamento metPagemento) {
    }

    @Override
    public Met_Pagamento findIdForMetPagamento(Integer id) {
        return null;
    }

    @Override
    public Met_Pagamento findPixForMetPagamento(String pix_id) {
        return null;
    }

    @Override
    public Met_Pagamento findDinheiroForMetPagamento(Integer dinheiro_id) {
        return null;
    }

    @Override
    public Met_Pagamento findCartaoForMetPagamento(Integer cartao_id) {
        return null;
    }

}
