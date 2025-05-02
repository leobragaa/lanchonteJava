
package dao;

import java.util.List;
import model.Reembolso;

public interface ReembolsoDao {
    //
    public void criarConexao();
    public void salvar(Reembolso rembolso);
    public void editar(Reembolso rembolso);
    public List listar(Reembolso rembolso);
    public void delete(Reembolso rembolso);
    //
    public Reembolso findTelefoneForId(Integer id);
    public Reembolso findTelefoneForDd(String motivo_id);
    public Reembolso findTelefoneForNumero(Integer pedido_id);
}
