
package implementsDao;

import conection.Conexao;
import dao.ClienteDao;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;

public class ClienteImplements implements ClienteDao{

    @Override
    public void salvar(Cliente cliente) throws SQLException{
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    " INSERT INTO cliente(id, dd, numero, funcionario, cliente) VALUES (?, ?, ?, ?, ?)");
            prepareStatement.setInt(1, cliente.getId());
            prepareStatement.setString(2, cliente.getNome());
            prepareStatement.setInt(3, cliente.getTelefone_id());

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
                    " UPDATE cliente SET nome = ?, telefone = ? WHERE id = ?");
            prepareStatement.setInt(1, cliente.getId());
            prepareStatement.setString(2, cliente.getNome());
            prepareStatement.setInt(3, cliente.getTelefone_id());

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
                    " DELETE FROM telefone(nome, telefone) VALUES(?, ?)");
            prepareStatement.setInt(1, cliente.getId());
            prepareStatement.setString(2, cliente.getNome());
            prepareStatement.setInt(3, cliente.getTelefone_id());

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
            cliente.getTelefone_id(resultSet.getInt("telefone"));
            return cliente;
        }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar telefone por ID", ex);
        }
        return null; 
    }

    @Override
    public Cliente findNomeForCliente(String id) {
        try {
        PreparedStatement prepareStatement = Conexao.getConnection()
            .prepareStatement("SELECT * FROM cliente WHERE nome = ?");
        prepareStatement.setInt(2, id);
        ResultSet resultSet = prepareStatement.getResultSet();

        if (resultSet.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(resultSet.getInt("id"));
            cliente.setNome(resultSet.getString("nome"));
            cliente.getTelefone_id(resultSet.getInt("telefone"));
            return cliente;
        }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar telefone por ID", ex);
        }
        return null; 
    }

    @Override
    public Cliente findTelefoneForCliente(Integer id) {
        try {
        PreparedStatement prepareStatement = Conexao.getConnection()
            .prepareStatement("SELECT * FROM cliente WHERE telefone = ?");
        prepareStatement.setInt(3, id);
        ResultSet resultSet = prepareStatement.getResultSet();

        if (resultSet.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(resultSet.getInt("id"));
            cliente.setNome(resultSet.getString("nome"));
            cliente.getTelefone_id(resultSet.getInt("telefone"));
            return cliente;
        }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar telefone por ID", ex);
        }
        return null;    
    }

    @Override
    public List listar(Cliente cliente) throws SQLException{
        List<Cliente> clienteList = new LinkedList<>();
        PreparedStatement prepareStatement;
        
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM cliente");
            ResultSet resultSet = prepareStatement.getResultSet();
            
            while(resultSet.next()){
                Cliente cliente = new Cliente();
                
                cliente.setId(resultSet.setId("id"));
                cliente.setNome(resultSet.setDd("nome"));
                cliente.setTelefone_id(resultSet.setNumero("telefone"));
                
                clienteList.add(cliente);
            }            
        }catch(SQLException ex){
            Logger.getLogger(ClienteImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar", ex);                        
        }
        return clienteList;
    }

}
