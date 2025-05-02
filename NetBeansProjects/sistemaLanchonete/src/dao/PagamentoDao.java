
package dao;

import model.Pagamento;
import model.Pedido;

public interface PagamentoDao {
    //
    public void salvar(Pagamento pagamento);
    public void editar(Pagamento pagamento);
    public void delete(Pagamento pagamento);
    //
    public Pagamento findIdForPagamento(Integer id);
    public Pagamento findMetPagamentoForPagamento(Integer metPagamento_id);
    public Pagamento findPedidoForPagamento(Pedido pedido_id);
    public Pagamento findCupomForPagamento(Integer cupom_id);
    
}
