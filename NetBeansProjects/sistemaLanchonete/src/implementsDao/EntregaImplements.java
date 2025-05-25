
package implementsDao;

import conection.Conexao;
import dao.EntregaDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;
import model.Delivery;
import model.Entrega;
import model.Pedido;
import model.Status_pedidos;


public class EntregaImplements implements EntregaDao{

    @Override
    public void salvar(Entrega entrega) throws SQLException {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                .prepareStatement(
                "INSERT INTO entrega (tipoEntrega, cliente, delivery, pedido, statusPedidos) VALUES(?, ?, ?, ?, ?");
            prepareStatement.setInt(1,entrega.getTipoEntrega_id());
            prepareStatement.setInt(2,entrega.getCliente_id().getId());
            prepareStatement.setInt(3,entrega.getDeleviry_id().getId());
            prepareStatement.setInt(4,entrega.getPedido_id().getId());
            prepareStatement.setInt(5,entrega.getStatus_pedidos_id().getId());
        }catch (SQLException ex){
            Logger.getLogger(EntregaImplements.class.getName()).log(Level.SEVERE, "Erro ao Salvar Entrega", ex);
        }      
    }

    @Override
    public void editar(Entrega entrega) throws SQLException {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                .prepareStatement(
                "UPDATE entrega SET tipoEntrega, cliente, delivery, pedido, statusPedidos WHERE id = ?");
            prepareStatement.setInt(1,entrega.getTipoEntrega_id());
            prepareStatement.setInt(2,entrega.getCliente_id().getId());
            prepareStatement.setInt(3,entrega.getDeleviry_id().getId());
            prepareStatement.setInt(4,entrega.getPedido_id().getId());
            prepareStatement.setInt(5,entrega.getStatus_pedidos_id().getId());
        }catch (SQLException ex){
            Logger.getLogger(EntregaImplements.class.getName()).log(Level.SEVERE, "Erro ao Salvar Entrega", ex);
        }        
    }

    @Override
    public List listar() throws SQLException {
       List<Entrega> entregaList = new LinkedList<>();
        PreparedStatement prepareStatement; 
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM entrega");
            ResultSet resultSet = prepareStatement.executeQuery();
            
            while(resultSet.next()){
                Entrega entrega = new Entrega();

                entrega.setId(resultSet.getInt("id"));
                entrega.setTipoEntrega_id(resultSet.getInt("tipoEntrega"));

                Cliente cliente = new Cliente();
                cliente.setId(resultSet.getInt("cliente"));
                entrega.setCliente_id(cliente);

                Delivery delivery = new Delivery();
                delivery.setId(resultSet.getInt("delivery"));
                entrega.setDeleviry_id(delivery);

                Pedido pedido = new Pedido();
                pedido.setId(resultSet.getInt("pedido"));
                entrega.setPedido_id(pedido);

                Status_pedidos status = new Status_pedidos();
                status.setId(resultSet.getInt("statusPedidos"));
                entrega.setStatus_pedidos_id(status);
                
                entregaList.add(entrega);
            }
        }catch(SQLException ex){
            Logger.getLogger(EntregaImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar Entrega", ex);
        }
        
        return entregaList;   
    }

    @Override
    public void delete(Entrega entrega) throws SQLException {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                .prepareStatement(
                "DELETE FROM entrega(tipoEntrega, cliente, delivery, pedido, statusPedidos) VALUES (?, ?, ?, ?, ?, ?");
            prepareStatement.setInt(1,entrega.getTipoEntrega_id());
            prepareStatement.setInt(2,entrega.getCliente_id().getId());
            prepareStatement.setInt(3,entrega.getDeleviry_id().getId());
            prepareStatement.setInt(4,entrega.getPedido_id().getId());
            prepareStatement.setInt(5,entrega.getStatus_pedidos_id().getId());
        }catch (SQLException ex){
            Logger.getLogger(EntregaImplements.class.getName()).log(Level.SEVERE, "Erro ao Deletar Entrega", ex);
        }    
    }


}
