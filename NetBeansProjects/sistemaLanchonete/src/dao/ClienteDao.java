
package dao;

import java.util.List;
import model.Cliente;

public interface ClienteDao {
    //
    public void salvar(Cliente cliente);
    public void editar(Cliente cliente);
    public List listar(Cliente cliente);
    public void delete(Cliente cliente);
    //
    public Cliente findIdForCliente (Integer id);
    public Cliente findNomeForCliente (String id);
    public Cliente findTelefoneForCliente (Integer id);
}
