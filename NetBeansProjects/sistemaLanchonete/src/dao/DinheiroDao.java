
package dao;

import model.Dinheiro;

public interface DinheiroDao {
    //
    public void salvar(DinheiroDao dinheiro);
    public void delete(DinheiroDao dinheiro);
    public void editar(DinheiroDao dinheiro);
    //
    public Dinheiro findIdForDinheiro(Integer id);
    public Dinheiro findValorEntregaForDinheiro(Double valorEntregado);
}
