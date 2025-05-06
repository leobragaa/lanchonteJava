
package implementsDao;

import conection.Conexao;
import dao.DeliveryDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Delivery;

public class DeliveryImplements implements DeliveryDao{

    @Override
    public Delivery findIdForDelivery(Integer id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM delivery WHERE id = ?");
            prepareStatement.setInt(1,id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Delivery delivery = new Delivery();
                delivery.setId(resultSet.getInt("id"));
                delivery.setChaveEntrega(resultSet.getInt("chaveEntrega"));
                delivery.setNumero(resultSet.getInt("numero"));
                delivery.setComplemento(resultSet.getString("complemento"));
                delivery.setEndereco_id(resultSet.getString("endereco"));
                return delivery;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por ID", ex);
        }
        return null;        
    }

    @Override
    public Delivery findChaveEntregaForDelivery(Integer chaveEntrega_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM delivery WHERE chaveEntrega = ?");
            prepareStatement.setInt(2,chaveEntrega_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Delivery delivery = new Delivery();
                delivery.setId(resultSet.getInt("id"));
                delivery.setChaveEntrega(resultSet.getInt("chaveEntrega"));
                delivery.setNumero(resultSet.getInt("numero"));
                delivery.setComplemento(resultSet.getString("complemento"));
                delivery.setEndereco_id(resultSet.getString("endereco"));
                return delivery;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por Chave de Entrega", ex);
        }
        return null;           
    }

    @Override
    public Delivery findNumeroForDelivery(Integer numero_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM delivery WHERE numero = ?");
            prepareStatement.setInt(3,numero_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Delivery delivery = new Delivery();
                delivery.setId(resultSet.getInt("id"));
                delivery.setChaveEntrega(resultSet.getInt("chaveEntrega"));
                delivery.setNumero(resultSet.getInt("numero"));
                delivery.setComplemento(resultSet.getString("complemento"));
                delivery.setEndereco_id(resultSet.getString("endereco"));
                return delivery;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por ID", ex);
        }
        return null;           
    }

    @Override
    public Delivery findComplementoForDelivery(String complemento_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM delivery WHERE complemento = ?");
            prepareStatement.setString(4,complemento_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Delivery delivery = new Delivery();
                delivery.setId(resultSet.getInt("id"));
                delivery.setChaveEntrega(resultSet.getInt("chaveEntrega"));
                delivery.setNumero(resultSet.getInt("numero"));
                delivery.setComplemento(resultSet.getString("complemento"));
                delivery.setEndereco_id(resultSet.getString("endereco"));
                return delivery;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por ID", ex);
        }
        return null;           
    }

    @Override
    public Delivery findEnderecoForDelivery(String endereco_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM delivery WHERE endereco = ?");
            prepareStatement.setString(5,endereco_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Delivery delivery = new Delivery();
                delivery.setId(resultSet.getInt("id"));
                delivery.setChaveEntrega(resultSet.getInt("chaveEntrega"));
                delivery.setNumero(resultSet.getInt("numero"));
                delivery.setComplemento(resultSet.getString("complemento"));
                delivery.setEndereco_id(resultSet.getString("endereco"));
                return delivery;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por ID", ex);
        }
        return null;           
    }

    @Override
    public void editar(Delivery delivery) {
        PreparedStatement prepareStatement;
        try {
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "UPDATE carrinho SET chaveEntrega = ?, numero = ?, complemento = ?, endereco = ? WHERE id = ?");
                prepareStatement.setInt(1, delivery.getId());
                prepareStatement.setInt(2, delivery.getChaveEntrega());
                prepareStatement.setInt(3, delivery.getNumero());
                prepareStatement.setString(4, delivery.getComplemento());
                prepareStatement.setInt(5, delivery.getEndereco_id());
        } catch (SQLException ex) {
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao Editar o valor", ex);
        }    
    }

    @Override
    public void delete(Delivery delivery) {
        PreparedStatement prepareStatement;
        try {
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "DELETE FROM delivery (id, chaveEntrega, numero, complemento, endereco) VALUES (?, ?, ?, ?, ?)");
                prepareStatement.setInt(1, delivery.getId());
                prepareStatement.setInt(2, delivery.getChaveEntrega());
                prepareStatement.setInt(3, delivery.getNumero());
                prepareStatement.setString(4, delivery.getComplemento());
                prepareStatement.setInt(5, delivery.getEndereco_id());
        } catch (SQLException ex) {
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao Editar o valor", ex);
        }             
    }

    @Override
    public void salvar(Delivery delivery) throws SQLException {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    " INSERT INTO carrinho (id, chaveEntrega, numero, complemento, endereco) VALUES (?, ?, ?, ?, ?)");
                prepareStatement.setInt(1, delivery.getId());
                prepareStatement.setInt(2, delivery.getChaveEntrega());
                prepareStatement.setInt(3, delivery.getNumero());
                prepareStatement.setString(4, delivery.getComplemento());
                prepareStatement.setInt(5, delivery.getEndereco_id());
                
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao Salvar os dados", ex);            
        }   
    }

    @Override
    public List listar() throws SQLException {
        List<Delivery> carrinhoList = new LinkedList<>();
        PreparedStatement prepareStatement;
        
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM delivery");
            ResultSet resultSet = prepareStatement.getResultSet();
            
            while(resultSet.next()){
                Delivery delivery = new Delivery();
                
                delivery.setId(resultSet.getInt("id"));
                delivery.setChaveEntrega(resultSet.getInt("chaveEntrega"));
                delivery.setNumero(resultSet.getInt("numero"));
                delivery.setComplemento(resultSet.getString("complemento"));
                delivery.setEndereco_id(resultSet.getString("endereco"));
                
                carrinhoList.add(delivery);
            }            
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar", ex);                        
        }
        return carrinhoList; 
    }

}
