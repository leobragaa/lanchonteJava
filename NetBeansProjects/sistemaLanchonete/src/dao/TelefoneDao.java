
package dao;

import model.Telefone;

public interface TelefoneDao {
    //
    public void salvar(Telefone telefone);
    public void editar(Telefone telefone);
    public void delete(Telefone telefone);
    //
    public Telefone findTelefoneForId(Integer id);
    public Telefone findTelefoneForDd(Integer dd_id);
    public Telefone findTelefoneForNumero(Integer numero_id);
    public Telefone findTelefoneForFuncionario(String funcionario_id);
    public Telefone findTelefoneForCliente(String cliente_id);
}
