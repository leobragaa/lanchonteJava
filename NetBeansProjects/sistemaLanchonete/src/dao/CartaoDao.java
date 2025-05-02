
package dao;

import model.Cartao;

public interface CartaoDao {
    //
    public void salvar(CartaoDao cartao);
    public void editar(CartaoDao cartao);
    public void delete(CartaoDao cartao);
    //
    public Cartao findIdForCartao (Integer id);
    public Cartao findTipoPagamentoForCartao (boolean tipoPagamento);
    public Cartao findNumCartaoForCartao (String numCartao);
    public Cartao findCvvForCartao (Integer cvv);
}
