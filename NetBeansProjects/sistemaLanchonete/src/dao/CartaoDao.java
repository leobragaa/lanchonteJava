
package dao;

import java.util.List;
import model.Cartao;

public interface CartaoDao {
    //
    public void salvar(Cartao cartao);
    public void editar(Cartao cartao);
    public List listar(Cartao cartao);
    public void delete(Cartao cartao);
    //
    public Cartao findIdForCartao (Integer id);
    public Cartao findTipoPagamentoForCartao (boolean pagamento_id);
    public Cartao findNumCartaoForCartao (String numCartao_id);
    public Cartao findCvvForCartao (Integer cvv_id);
}
