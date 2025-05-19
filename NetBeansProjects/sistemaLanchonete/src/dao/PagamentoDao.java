
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Cupom;
import model.Met_Pagamento;
import model.Pagamento;
import model.Pedido;

public interface PagamentoDao {
    //
    public void salvar(Pagamento pagamento)throws SQLException;
    public void editar(Pagamento pagamento)throws SQLException;
    public List listar()throws SQLException;
    public void delete(Pagamento pagamento)throws SQLException;
    //
    public Pagamento findIdForPagamento(Integer id);
    public Pagamento findMetPagamentoForPagamento(Met_Pagamento metPagamento_id);
    public Pagamento findPedidoForPagamento(Pedido pedido_id);
    public Pagamento findCupomForPagamento(Cupom cupom_id);
    
}
