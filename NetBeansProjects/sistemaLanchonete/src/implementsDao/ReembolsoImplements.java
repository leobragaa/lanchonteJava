
package implementsDao;

import dao.ReembolsoDao;
import model.Reembolso;

public class ReembolsoImplements implements ReembolsoDao{
    @Override
    public void salvar(Reembolso rembolso) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editar(Reembolso rembolso) {
    }

    @Override
    public void delete(Reembolso rembolso) {
    }

    @Override
    public Reembolso findTelefoneForId(Integer id) {
        return null;
    }

    @Override
    public Reembolso findTelefoneForDd(String motivo_id) {
        return null;
    }

    @Override
    public Reembolso findTelefoneForNumero(Integer pedido_id) {
        return null;
    }
    
    //
    @Override
    public void criarConexao() {
    }

}
