
package dao;

import model.Dinheiro;

public interface DinheiroDao {
    //
    public void salvar(Dinheiro dinheiro);
    public void delete(Dinheiro dinheiro);
    public void editar(Dinheiro dinheiro);
    //
    public Dinheiro findIdForDinheiro(Integer id);
    public Dinheiro findValorEntregaForDinheiro(Double valorEntrega_id);
}
