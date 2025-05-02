
package implementsDao;

import dao.PagamentoDao;
import model.Pagamento;
import model.Pedido;

public class PagamentoImplements implements PagamentoDao{

    @Override
    public void salvar(Pagamento pagamento) {
    }

    @Override
    public void editar(Pagamento pagamento) {
    }

    @Override
    public void delete(Pagamento pagamento) {
    }

    @Override
    public Pagamento findIdForPagamento(Integer id) {
        return null;
    }

    @Override
    public Pagamento findMetPagamentoForPagamento(Integer metPagamento_id) {
        return null;
    }

    @Override
    public Pagamento findPedidoForPagamento(Pedido pedido_id) {
        return null;
    }

    @Override
    public Pagamento findCupomForPagamento(Integer cupom_id) {
        return null;
    }

}
