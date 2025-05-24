
package implementsDao;

import conection.Conexao;
import dao.Status_pedidosDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pedido;
import model.Status_pedidos;

public class Status_pedidosImplements implements Status_pedidosDao{

    @Override
    public void salvar(Status_pedidos statusPedidos) throws SQLException {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                .prepareStatement(
                "INSERT INTO statusPedidos (id, progresso, pedido) VALUES(?, ?, ?");
            prepareStatement.setInt(1,statusPedidos.getId());
            prepareStatement.setString(2,statusPedidos.getProgresso());
            prepareStatement.setObject(3,statusPedidos.getPedido());
        }catch (SQLException ex){
            Logger.getLogger(Status_pedidosImplements.class.getName()).log(Level.SEVERE, "Erro ao Salvar os dados", ex);
        }      
    }

    @Override
    public void editar(Status_pedidos statusPedidos) throws SQLException {
        PreparedStatement prepareStatement;
        try {
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "UPDATE statusPedidos SET progresso = ?, pedido = ? WHERE id = ?");
            prepareStatement.setInt(1,statusPedidos.getId());
            prepareStatement.setString(2,statusPedidos.getProgresso());
            prepareStatement.setObject(3,statusPedidos.getPedido());
        } catch (SQLException ex) {
            Logger.getLogger(Status_pedidosImplements.class.getName()).log(Level.SEVERE, "Erro ao editar o valor", ex);
        }    
    }

    @Override
    public List listar() throws SQLException {
        List<Status_pedidos> statusPedidosList = new LinkedList<>();
        PreparedStatement prepareStatement; 
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM statusPedidos");
            ResultSet resultSet = prepareStatement.getResultSet();
            
            while(resultSet.next()){
                Status_pedidos statusPedidos = new Status_pedidos();
                
                statusPedidos.setId(resultSet.getInt("id"));
                statusPedidos.setProgresso(resultSet.getString("progresso"));
                statusPedidos.setPedido((Pedido) resultSet.getObject("pedido"));
                
                statusPedidosList.add(statusPedidos);
            }
        }catch(SQLException ex){
            Logger.getLogger(Status_pedidosImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar", ex);
        }
        
        return statusPedidosList;    
    }

    @Override
    public void delete(Status_pedidos statusPedidos) throws SQLException {
        PreparedStatement prepareStatement;
        try {
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                            "DELETE FROM statusPedidos(id, progresso, pedido)VALUES(?, ?, ?");
            prepareStatement.setInt(1,statusPedidos.getId());
            prepareStatement.setString(2,statusPedidos.getProgresso());
            prepareStatement.setObject(3,statusPedidos.getPedido());
        } catch (SQLException ex) {
            Logger.getLogger(Status_pedidosImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Status_pedidos findtStatusPedidosForId(Integer id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM statusPedidos WHERE id = ?");
                    prepareStatement.setInt(1,id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Status_pedidos statusPedidos = new Status_pedidos();
                statusPedidos.setId(resultSet.getInt("id"));
                statusPedidos.setProgresso(resultSet.getString("progresso"));
                statusPedidos.setPedido((Pedido) resultSet.getObject("pedido"));
                return statusPedidos;
            }
        }catch(SQLException ex){
            Logger.getLogger(Status_pedidosImplements.class.getName()).log(Level.SEVERE, "Erro ao Encontrar pelo ID", ex);

        }
        
        return null;    
    }

    @Override
    public Status_pedidos findtStatusPedidosForProgresso(String progresso_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM statusPedidos WHERE progresso_id = ?");
                    prepareStatement.setString(2, progresso_id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Status_pedidos statusPedidos = new Status_pedidos();
                statusPedidos.setId(resultSet.getInt("id"));
                statusPedidos.setProgresso(resultSet.getString("progresso"));
                statusPedidos.setPedido((Pedido) resultSet.getObject("pedido"));
                return statusPedidos;
            }
        }catch(SQLException ex){
            Logger.getLogger(Status_pedidosImplements.class.getName()).log(Level.SEVERE, "Erro ao Encontrar pelo Progresso", ex);

        }
        
        return null;     
    }

    @Override
    public Status_pedidos findtStatusPedidosForPedido(Pedido pedido_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM statusPedidos WHERE progresso_id = ?");
                    prepareStatement.setObject(3, pedido_id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Status_pedidos statusPedidos = new Status_pedidos();
                statusPedidos.setId(resultSet.getInt("id"));
                statusPedidos.setProgresso(resultSet.getString("progresso"));
                statusPedidos.setPedido((Pedido) resultSet.getObject("pedido"));
                return statusPedidos;
            }
        }catch(SQLException ex){
            Logger.getLogger(Status_pedidosImplements.class.getName()).log(Level.SEVERE, "Erro ao Encontrar pelo Pedido", ex);

        }
        
        return null;     
    }
    
}
