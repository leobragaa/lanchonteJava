
package implementsDao;

import conection.Conexao;
import dao.PedidoDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Carrinho;
import model.Cliente;
import model.Entrega;
import model.Pedido;
import model.Reembolso;
import model.Status_pedidos;

public class PedidoImplements implements PedidoDao{

    @Override
    public void salvar(Pedido pedido) throws SQLException {
        PreparedStatement prepareStatement;
        try {
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                            "INSERT INTO pedido(id, hora_pedido, cliente, numero_pedido, data_pedido, statusPedidos, entrega, reembolso, carrinho) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?");
            prepareStatement.setInt(1,pedido.getId());
            prepareStatement.setString(2,pedido.getHora_pedido());
            prepareStatement.setObject(3,pedido.getCliente_id());
            prepareStatement.setInt(4,pedido.getNumero_pedido());
            prepareStatement.setDate(5, (java.sql.Date) pedido.getData_pedido());
            prepareStatement.setObject(6,pedido.getStatus_id());
            prepareStatement.setObject(7,pedido.getEntrega_id());
            prepareStatement.setObject(8,pedido.getReembolso_id());
            prepareStatement.setObject(9,pedido.getCarrinho_id());
        } catch (SQLException ex) {
            Logger.getLogger(PedidoImplements.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @Override
    public void delete(Pedido pedido) throws SQLException {
        PreparedStatement prepareStatement;
        try {
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                            "DELETE FROM pedido(id, hora_pedido, cliente, numero_pedido, data_pedido, statusPedidos, entrega, reembolso, carrinho) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?");
            prepareStatement.setInt(1,pedido.getId());
            prepareStatement.setString(2,pedido.getHora_pedido());
            prepareStatement.setObject(3,pedido.getCliente_id());
            prepareStatement.setInt(4,pedido.getNumero_pedido());
            prepareStatement.setDate(5, (java.sql.Date) pedido.getData_pedido());
            prepareStatement.setObject(6,pedido.getStatus_id());
            prepareStatement.setObject(7,pedido.getEntrega_id());
            prepareStatement.setObject(8,pedido.getReembolso_id());
            prepareStatement.setObject(9,pedido.getCarrinho_id());
        } catch (SQLException ex) {
            Logger.getLogger(PedidoImplements.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @Override
    public List listar() throws SQLException {
        List<Pedido> pedidoList = new LinkedList<>();
        PreparedStatement prepareStatement; 
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM pedido");
            ResultSet resultSet = prepareStatement.getResultSet();
            
            while(resultSet.next()){
                Pedido pedido = new Pedido();
                
                pedido.setId(resultSet.getInt("id"));
                pedido.setHora_pedido(resultSet.getString("hora_pedido"));
                pedido.setCliente_id((Cliente) resultSet.getObject("cliente"));
                pedido.setNumero_pedido(resultSet.getInt("numero_pedido"));
                pedido.setData_pedido(resultSet.getDate("data_pedido"));
                pedido.setStatus_id((Status_pedidos) resultSet.getObject("statusPedidos"));
                pedido.setEntrega_id((Entrega) resultSet.getObject(""));
                pedido.setReembolso_id((List<Reembolso>) resultSet.getObject(""));
                pedido.setCarrinho_id((List<Carrinho>) resultSet.getObject(""));
                
                pedidoList.add(pedido);
            }
        }catch(SQLException ex){
            Logger.getLogger(PedidoImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar Pedido", ex);
        }
        
        return pedidoList;
    }

    @Override
    public void editar(Pedido pedido) throws SQLException {
        PreparedStatement prepareStatement;
        try {
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                            "UPDATE pedido SET hora_pedido = ?, cliente = ?, numero_pedido = ?, data_pedido = ?, statusPedidos = ?, entrega = ?, reembolso = ?, carrinho = ? WHERE id = ?");
            prepareStatement.setInt(1,pedido.getId());
            prepareStatement.setString(2,pedido.getHora_pedido());
            prepareStatement.setObject(3,pedido.getCliente_id());
            prepareStatement.setInt(4,pedido.getNumero_pedido());
            prepareStatement.setDate(5, (java.sql.Date) pedido.getData_pedido());
            prepareStatement.setObject(6,pedido.getStatus_id());
            prepareStatement.setObject(7,pedido.getEntrega_id());
            prepareStatement.setObject(8,pedido.getReembolso_id());
            prepareStatement.setObject(9,pedido.getCarrinho_id());
        } catch (SQLException ex) {
            Logger.getLogger(PedidoImplements.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    @Override
    public Pedido findIdForPedido(Integer id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM pedido WHERE id = ?");
                    prepareStatement.setInt(1, id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Pedido pedido = new Pedido();
                pedido.setId(resultSet.getInt("id"));
                pedido.setHora_pedido(resultSet.getString("hora_pedido"));
                pedido.setCliente_id((Cliente) resultSet.getObject("cliente"));
                pedido.setNumero_pedido(resultSet.getInt("numero_pedido"));
                pedido.setData_pedido(resultSet.getDate("data_pedido"));
                pedido.setStatus_id((Status_pedidos) resultSet.getObject("statusPedidos"));
                pedido.setEntrega_id((Entrega) resultSet.getObject("entrega"));
                pedido.setReembolso_id((List<Reembolso>) resultSet.getObject("reembolso"));
                pedido.setCarrinho_id((List<Carrinho>) resultSet.getObject("carrinho"));
                return pedido;
            }
        }catch(SQLException ex){
            Logger.getLogger(PedidoImplements.class.getName()).log(Level.SEVERE, "Erro ao encontrar ID do Pedido", ex);

        }
        
        return null; 
    }

    @Override
    public Pedido findHoraForPedido(String hora_pedido) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM pedido WHERE hora_pedido = ?");
                    prepareStatement.setString(2, hora_pedido);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Pedido pedido = new Pedido();
                pedido.setId(resultSet.getInt("id"));
                pedido.setHora_pedido(resultSet.getString("hora_pedido"));
                pedido.setCliente_id((Cliente) resultSet.getObject("cliente"));
                pedido.setNumero_pedido(resultSet.getInt("numero_pedido"));
                pedido.setData_pedido(resultSet.getDate("data_pedido"));
                pedido.setStatus_id((Status_pedidos) resultSet.getObject("statusPedidos"));
                pedido.setEntrega_id((Entrega) resultSet.getObject("entrega"));
                pedido.setReembolso_id((List<Reembolso>) resultSet.getObject("reembolso"));
                pedido.setCarrinho_id((List<Carrinho>) resultSet.getObject("carrinho"));
                return pedido;
            }
        }catch(SQLException ex){
            Logger.getLogger(PedidoImplements.class.getName()).log(Level.SEVERE, "Erro ao Encontrar Hora do Pedido", ex);

        }
        
        return null;
    }
    
    @Override
    public Pedido findNumeroaForPedido(Integer numero_pedido) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM pedido WHERE hora_pedido = ?");
                    prepareStatement.setInt(3, numero_pedido);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Pedido pedido = new Pedido();
                pedido.setId(resultSet.getInt("id"));
                pedido.setHora_pedido(resultSet.getString("hora_pedido"));
                pedido.setCliente_id((Cliente) resultSet.getObject("cliente"));
                pedido.setNumero_pedido(resultSet.getInt("numero_pedido"));
                pedido.setData_pedido(resultSet.getDate("data_pedido"));
                pedido.setStatus_id((Status_pedidos) resultSet.getObject("statusPedidos"));
                pedido.setEntrega_id((Entrega) resultSet.getObject("entrega"));
                pedido.setReembolso_id((List<Reembolso>) resultSet.getObject("reembolso"));
                pedido.setCarrinho_id((List<Carrinho>) resultSet.getObject("carrinho"));
                return pedido;
            }
        }catch(SQLException ex){
            Logger.getLogger(PedidoImplements.class.getName()).log(Level.SEVERE, "Erro ao encontrar Numero do Pedido", ex);

        }
        
        return null;    
    }

    @Override
    public Pedido findClienteForPedido(Cliente cliente_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM pedido WHERE cliente = ?");
                    prepareStatement.setObject(4, cliente_id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Pedido pedido = new Pedido();
                pedido.setId(resultSet.getInt("id"));
                pedido.setHora_pedido(resultSet.getString("hora_pedido"));
                pedido.setCliente_id((Cliente) resultSet.getObject("cliente"));
                pedido.setNumero_pedido(resultSet.getInt("numero_pedido"));
                pedido.setData_pedido(resultSet.getDate("data_pedido"));
                pedido.setStatus_id((Status_pedidos) resultSet.getObject("statusPedidos"));
                pedido.setEntrega_id((Entrega) resultSet.getObject("entrega"));
                pedido.setReembolso_id((List<Reembolso>) resultSet.getObject("reembolso"));
                pedido.setCarrinho_id((List<Carrinho>) resultSet.getObject("carrinho"));
                return pedido;
            }
        }catch(SQLException ex){
            Logger.getLogger(PedidoImplements.class.getName()).log(Level.SEVERE, "Erro ao encontrar Cliente do Pedido", ex);

        }
        
        return null;   
    }

    @Override
    public Pedido findStatusForPedido(Status_pedidos status_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM pedido WHERE statusPedidos = ?");
                    prepareStatement.setObject(5, status_id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Pedido pedido = new Pedido();
                pedido.setId(resultSet.getInt("id"));
                pedido.setHora_pedido(resultSet.getString("hora_pedido"));
                pedido.setCliente_id((Cliente) resultSet.getObject("cliente"));
                pedido.setNumero_pedido(resultSet.getInt("numero_pedido"));
                pedido.setData_pedido(resultSet.getDate("data_pedido"));
                pedido.setStatus_id((Status_pedidos) resultSet.getObject("statusPedidos"));
                pedido.setEntrega_id((Entrega) resultSet.getObject("entrega"));
                pedido.setReembolso_id((List<Reembolso>) resultSet.getObject("reembolso"));
                pedido.setCarrinho_id((List<Carrinho>) resultSet.getObject("carrinho"));
                return pedido;
            }
        }catch(SQLException ex){
            Logger.getLogger(PedidoImplements.class.getName()).log(Level.SEVERE, "Erro ao encontrar Status do Pedido", ex);

        }
        
        return null;   
    }

    @Override
    public Pedido findDataForPedido(Date data_pedido) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM pedido WHERE data_pedido = ?");
                    prepareStatement.setDate(6, (java.sql.Date) data_pedido);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Pedido pedido = new Pedido();
                pedido.setId(resultSet.getInt("id"));
                pedido.setHora_pedido(resultSet.getString("hora_pedido"));
                pedido.setCliente_id((Cliente) resultSet.getObject("cliente"));
                pedido.setNumero_pedido(resultSet.getInt("numero_pedido"));
                pedido.setData_pedido(resultSet.getDate("data_pedido"));
                pedido.setStatus_id((Status_pedidos) resultSet.getObject("statusPedidos"));
                pedido.setEntrega_id((Entrega) resultSet.getObject("entrega"));
                pedido.setReembolso_id((List<Reembolso>) resultSet.getObject("reembolso"));
                pedido.setCarrinho_id((List<Carrinho>) resultSet.getObject("carrinho"));
                return pedido;
            }
        }catch(SQLException ex){
            Logger.getLogger(PedidoImplements.class.getName()).log(Level.SEVERE, "Erro ao encontrar Data do Pedido", ex);

        }
        
        return null; 
    }

    @Override
    public Pedido findEntregaForPedido(Entrega entrega_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM pedido WHERE entrega = ?");
                    prepareStatement.setObject(7, entrega_id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Pedido pedido = new Pedido();
                pedido.setId(resultSet.getInt("id"));
                pedido.setHora_pedido(resultSet.getString("hora_pedido"));
                pedido.setCliente_id((Cliente) resultSet.getObject("cliente"));
                pedido.setNumero_pedido(resultSet.getInt("numero_pedido"));
                pedido.setData_pedido(resultSet.getDate("data_pedido"));
                pedido.setStatus_id((Status_pedidos) resultSet.getObject("statusPedidos"));
                pedido.setEntrega_id((Entrega) resultSet.getObject("entrega"));
                pedido.setReembolso_id((List<Reembolso>) resultSet.getObject("reembolso"));
                pedido.setCarrinho_id((List<Carrinho>) resultSet.getObject("carrinho"));
                return pedido;
            }
        }catch(SQLException ex){
            Logger.getLogger(PedidoImplements.class.getName()).log(Level.SEVERE, "Erro ao encontrar Entrega do Pedido", ex);

        }
        
        return null; 
    }

    @Override
    public Pedido findReembolsoForPedido(List<Reembolso> reembolso_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM pedido WHERE reembolso = ?");
                    prepareStatement.setObject(8, reembolso_id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Pedido pedido = new Pedido();
                pedido.setId(resultSet.getInt("id"));
                pedido.setHora_pedido(resultSet.getString("hora_pedido"));
                pedido.setCliente_id((Cliente) resultSet.getObject("cliente"));
                pedido.setNumero_pedido(resultSet.getInt("numero_pedido"));
                pedido.setData_pedido(resultSet.getDate("data_pedido"));
                pedido.setStatus_id((Status_pedidos) resultSet.getObject("statusPedidos"));
                pedido.setEntrega_id((Entrega) resultSet.getObject("entrega"));
                pedido.setReembolso_id((List<Reembolso>) resultSet.getObject("reembolso"));
                pedido.setCarrinho_id((List<Carrinho>) resultSet.getObject("carrinho"));
                return pedido;
            }
        }catch(SQLException ex){
            Logger.getLogger(PedidoImplements.class.getName()).log(Level.SEVERE, "Erro ao encontrar Reembolso do Pedido", ex);

        }
        
        return null; 
    }

    @Override
    public Pedido findCarrinhoForPedido(List<Carrinho> carrinho_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM pedido WHERE carinho = ?");
                    prepareStatement.setObject(9, carrinho_id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Pedido pedido = new Pedido();
                pedido.setId(resultSet.getInt("id"));
                pedido.setHora_pedido(resultSet.getString("hora_pedido"));
                pedido.setCliente_id((Cliente) resultSet.getObject("cliente"));
                pedido.setNumero_pedido(resultSet.getInt("numero_pedido"));
                pedido.setData_pedido(resultSet.getDate("data_pedido"));
                pedido.setStatus_id((Status_pedidos) resultSet.getObject("statusPedidos"));
                pedido.setEntrega_id((Entrega) resultSet.getObject("entrega"));
                pedido.setReembolso_id((List<Reembolso>) resultSet.getObject("reembolso"));
                pedido.setCarrinho_id((List<Carrinho>) resultSet.getObject("carrinho"));
                return pedido;
            }
        }catch(SQLException ex){
            Logger.getLogger(PedidoImplements.class.getName()).log(Level.SEVERE, "Erro ao encontrar Carrinho do Pedido", ex);

        }
        
        return null; 
    }
}
