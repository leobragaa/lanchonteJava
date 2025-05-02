
package dao;

import model.Cliente;
import model.Telefone;

public interface ClienteDao {
    //
    public void salvar(ClienteDao cliente);
    public void editar(ClienteDao cliente);
    public void delete(ClienteDao cliente);
    //
    public Cliente findIdForCliente (Integer id);
    public Cliente findNomeForCliente (String nome);
    public Cliente findTelefoneForCliente (Telefone telefone_id);
}
