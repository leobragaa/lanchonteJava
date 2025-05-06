
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Telefone;

public interface TelefoneDao {
    //
    public void salvar(Telefone telefone) throws SQLException;
    public void editar(Telefone telefone);
    public List listar() throws SQLException;
    public void delete(Telefone telefone) throws SQLException;
    //
    public Telefone findTelefoneForId(Integer id);
    public Telefone findTelefoneForDd(Integer dd_id);
    public Telefone findTelefoneForNumero(Integer numero_id);
    public Telefone findTelefoneForFuncionario(String funcionario_id);
    public Telefone findTelefoneForCliente(String cliente_id);
}
