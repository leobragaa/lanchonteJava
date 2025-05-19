
package dao;

import java.util.List;
import java.sql.SQLException;
import model.Cliente;
import model.Pedido;
import model.Telefone;

public interface ClienteDao {
    //
    public void salvar(Cliente cliente) throws SQLException;
    public void editar(Cliente cliente) throws SQLException;
    public List listar() throws SQLException;
    public void delete(Cliente cliente) throws SQLException;
    //
    public Cliente findIdForCliente (Integer id);
    public Cliente findNomeForCliente (String nome_id);
    public List<Cliente> findTelefoneForCliente (List<Telefone> telefone_id);
    public List<Cliente> findPedidoForCliente (List<Pedido> pedido_id);
}
