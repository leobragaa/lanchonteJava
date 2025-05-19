
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Dinheiro;
import model.Met_Pagamento;

public interface DinheiroDao {
    //
    public void salvar(Dinheiro dinheiro) throws SQLException;
    public void delete(Dinheiro dinheiro)throws SQLException;
    public List listar() throws SQLException;
    public void editar(Dinheiro dinheiro)throws SQLException;
    //
    public Dinheiro findIdForDinheiro(Integer id);
    public Dinheiro findValorEntregaForDinheiro(Double valorEntrega_id);
    public Dinheiro findMetPagamentoForDinheiro(Met_Pagamento metPagamento_id);
}
