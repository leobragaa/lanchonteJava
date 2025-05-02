
package implementsDao;

import dao.TelefoneDao;
import model.Telefone;

public class TelefoneImplements implements TelefoneDao{

    @Override
    public void salvar(Telefone telefone) {
    }

    @Override
    public void editar(Telefone telefone) {
    }

    @Override
    public void delete(Telefone telefone) {
    }

    @Override
    public Telefone findTelefoneForId(Integer id) {
        return null;
    }

    @Override
    public Telefone findTelefoneForDd(Integer dd_id) {
        return null;
    }

    @Override
    public Telefone findTelefoneForNumero(Integer numero_id) {
        return null;
    }

    @Override
    public Telefone findTelefoneForFuncionario(String funcionario_id) {
        return null;
    }

    @Override
    public Telefone findTelefoneForCliente(String cliente_id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
