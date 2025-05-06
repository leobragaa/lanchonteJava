
package dao;
import java.sql.SQLException;
import java.util.List;
import model.Cartao;

public interface CartaoDao {
    //
    public void salvar(Cartao cartao) throws SQLException;
    public void editar(Cartao cartao);
    public List listar() throws SQLException;
    public void delete(Cartao cartao);
    //
    public Cartao findIdForCartao (Integer id);
    public Cartao findTipoPagamentoForCartao (String pagamento_id);
    public Cartao findNumCartaoForCartao (String numCartao_id);
    public Cartao findCvvForCartao (Integer cvv_id);
}
