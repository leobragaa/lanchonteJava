
package dao;

import model.Cliente;
import model.Funcionario;
import model.Telefone;

public interface TelefoneDao {
    //
    public void salvar(TelefoneDao telefone);
    public void editar(TelefoneDao telefone);
    public void delete(TelefoneDao telefone);
    //
    public Telefone findTelefoneForId(Integer id);
    public Telefone findTelefoneForDd(Integer dd);
    public Telefone findTelefoneForNumero(Integer numero);
    public Telefone findTelefoneForFuncionario(Funcionario funcionario_id);
    public Telefone findTelefoneForNumero(Cliente cliente_id);
}
