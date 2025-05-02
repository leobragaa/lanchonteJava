
package dao;

import model.Cupom;
import model.Met_Pagamento;
import model.Pagamento;
import model.Pedido;

public interface PagamentoDao {
    //
    public void salvar(PagamentoDao pagamento);
    public void editar(PagamentoDao pagamento);
    public void delete(PagamentoDao pagamento);
    //
    public Pagamento findIdForPagamento(Integer id);
    public Pagamento findCupomForPagamento(Met_Pagamento metPagamento_id);
    public Pagamento findPedidoForPagamento(Pedido pedido_id);
    public Pagamento findIdForPagamento(Cupom cupom_id);
    
}
