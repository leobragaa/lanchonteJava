
package implementsDao;

import conection.Conexao;
import dao.ClienteDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;
import model.Pedido;
import model.Telefone;

public class ClienteImplements implements ClienteDao{

    @Override
    public void salvar(Cliente cliente) throws SQLException{
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    " INSERT INTO cliente(id, nome, telefone, pedido) VALUES (?, ?, ?)");
            prepareStatement.setInt(1, cliente.getId());
            prepareStatement.setString(2, cliente.getNome());
            prepareStatement.setObject(3, cliente.getTelefone_id());
            prepareStatement.setObject(4, cliente.getPedido_id());

        }catch(SQLException ex){
            Logger.getLogger(ClienteImplements.class.getName()).log(Level.SEVERE, "Erro ao Salvar os dados", ex);            
        }    
    }

    @Override
    public void editar(Cliente cliente) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    " UPDATE cliente SET nome = ?, telefone = ?, pedido = ? WHERE id = ?");
            prepareStatement.setInt(1, cliente.getId());
            prepareStatement.setString(2, cliente.getNome());
            prepareStatement.setObject(3, cliente.getTelefone_id());
            prepareStatement.setObject(4, cliente.getPedido_id());

        }catch(SQLException ex){
            Logger.getLogger(ClienteImplements.class.getName()).log(Level.SEVERE, "Erro ao Editar", ex);            
        }        
    }

    @Override
    public void delete(Cliente cliente) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    " DELETE FROM telefone(nome, telefone, pedido) VALUES(?, ?, ?)");
            prepareStatement.setInt(1, cliente.getId());
            prepareStatement.setString(2, cliente.getNome());
            prepareStatement.setObject(3, cliente.getTelefone_id());
            prepareStatement.setObject(4, cliente.getPedido_id());

        }catch(SQLException ex){
            Logger.getLogger(ClienteImplements.class.getName()).log(Level.SEVERE, "Erro ao Deletar", ex);            
        }        
    }

    @Override
    public Cliente findIdForCliente(Integer id) {
        try {
        PreparedStatement prepareStatement = Conexao.getConnection()
            .prepareStatement("SELECT * FROM cliente WHERE id = ?");
        prepareStatement.setInt(1, id);
        ResultSet resultSet = prepareStatement.getResultSet();

        if (resultSet.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(resultSet.getInt("id"));
            cliente.setNome(resultSet.getString("nome"));
            cliente.setTelefone_id((List<Telefone>) resultSet.getObject("telefone"));
            cliente.setPedido_id((List<Pedido>) resultSet.getObject("pedido"));
            return cliente;
        }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar telefone por ID", ex);
        }
        return null; 
    }

    @Override
    public Cliente findNomeForCliente(String nome_id) {
        try {
        PreparedStatement prepareStatement = Conexao.getConnection()
            .prepareStatement("SELECT * FROM cliente WHERE nome = ?");
        prepareStatement.setString(2, nome_id);
        ResultSet resultSet = prepareStatement.getResultSet();

        if (resultSet.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(resultSet.getInt("id"));
            cliente.setNome(resultSet.getString("nome"));
            cliente.setTelefone_id((List<Telefone>) resultSet.getObject("telefone"));
            cliente.setPedido_id((List<Pedido>) resultSet.getObject("pedido"));

            return cliente;
        }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar telefone por ID", ex);
        }
        return null; 
    }

    @Override
    public Cliente findTelefoneForCliente(List<Telefone> telefone_id) {
        try {
        PreparedStatement prepareStatement = Conexao.getConnection()
            .prepareStatement("SELECT * FROM cliente WHERE telefone = ?");
        prepareStatement.setObject(3, telefone_id);
        ResultSet resultSet = prepareStatement.getResultSet();

        if (resultSet.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(resultSet.getInt("id"));
            cliente.setNome(resultSet.getString("nome"));
            cliente.setTelefone_id((List<Telefone>) resultSet.getObject("telefone"));
            cliente.setPedido_id((List<Pedido>) resultSet.getObject("pedido"));

            return cliente;
        }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar telefone por ID", ex);
        }
        return null;    
    }

    @Override
    public List listar() throws SQLException{
        List<Cliente> clienteList = new LinkedList<>();
        PreparedStatement prepareStatement;
        
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM cliente");
            ResultSet resultSet = prepareStatement.getResultSet();
            
            while(resultSet.next()){
                Cliente cliente = new Cliente();
                
                cliente.setId(resultSet.getInt("id"));
                cliente.setNome(resultSet.getString("nome"));
                cliente.setTelefone_id((List<Telefone>) resultSet.getObject("telefone"));
                cliente.setPedido_id((List<Pedido>) resultSet.getObject("pedido"));
                
                clienteList.add(cliente);
            }            
        }catch(SQLException ex){
            Logger.getLogger(ClienteImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar", ex);                        
        }
        return clienteList;
    }

    @Override
    public Cliente findPedidoForCliente(List<Pedido> pedido_id) {
        try {
        PreparedStatement prepareStatement = Conexao.getConnection()
            .prepareStatement("SELECT * FROM cliente WHERE pedido = ?");
        prepareStatement.setObject(4, pedido_id);
        ResultSet resultSet = prepareStatement.getResultSet();

        if (resultSet.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(resultSet.getInt("id"));
            cliente.setNome(resultSet.getString("nome"));
            cliente.setTelefone_id((List<Telefone>) resultSet.getObject("telefone"));
            cliente.setPedido_id((List<Pedido>) resultSet.getObject("pedido"));

            return cliente;
        }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar pedido por ID", ex);
        }
        return null;           
    }

}
