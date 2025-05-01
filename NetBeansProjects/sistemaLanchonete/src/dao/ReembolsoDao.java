
package dao;

import model.Pedido;
import model.Reembolso;

public interface ReembolsoDao {
    //
    public void salvar(ReembolsoDao rembolso);
    public void editar(ReembolsoDao rembolso);
    public void delete(ReembolsoDao rembolso);
    //
    public Reembolso findTelefoneForId(Integer id);
    public Reembolso findTelefoneForDd(String motivo);
    public Reembolso findTelefoneForNumero(Pedido pedido_id);
}
