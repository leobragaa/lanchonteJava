
package dao;

import java.util.List;
import java.sql.SQLException;
import model.Cliente;

public interface ClienteDao {
    //
    public void salvar(Cliente cliente) throws SQLException;
    public void editar(Cliente cliente);
    public List listar() throws SQLException;
    public void delete(Cliente cliente);
    //
    public Cliente findIdForCliente (Integer id);
    public Cliente findNomeForCliente (String nome_id);
    public Cliente findTelefoneForCliente (String telefone_id);
}
