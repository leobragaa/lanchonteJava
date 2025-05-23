
package implementsDao;

import conection.Conexao;
import dao.EnderecoDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Bairro;
import model.Delivery;
import model.Endereco;
import model.Taxa_Entrega;

public class EnderecoImplements implements EnderecoDao{

    @Override
    public void salvar(Endereco endereco) throws SQLException {
        PreparedStatement prepareStatement;
        try{
        prepareStatement = Conexao.getConnection().
                prepareStatement(
                "INSERT INTO endereco (id, rua, cep, bairro, distancia, delivery, taxaEntrega) VALUES (?, ?, ?, ?, ?, ?, ?)");
                prepareStatement.setInt(1, endereco.getId());
                prepareStatement.setString(2, endereco.getRua());
                prepareStatement.setString(3, endereco.getCep());
                prepareStatement.setObject(4, endereco.getBairro_id());
                prepareStatement.setDouble(5, endereco.getDistancia_id());
                prepareStatement.setObject(6, endereco.getDelivery_id());
                prepareStatement.setObject(7, endereco.getTaxaEntrega_id());
        }catch(SQLException ex){
            Logger.getLogger(EnderecoImplements.class.getName()).log (Level.SEVERE , "Erro ao Salvar", ex);
        }
    }

    @Override
    public void editar(Endereco endereco) throws SQLException {
        PreparedStatement prepareStatement;
        try{
        prepareStatement = Conexao.getConnection().
                prepareStatement(
                "UPDATE endereco SET rua = ?, cep = ?, bairro = ?, distancia = ?, delivery = ?, taxaEntrega = ? WHERE id = ?");
                prepareStatement.setInt(1, endereco.getId());
                prepareStatement.setString(2, endereco.getRua());
                prepareStatement.setString(3, endereco.getCep());
                prepareStatement.setObject(4, endereco.getBairro_id());
                prepareStatement.setDouble(5, endereco.getDistancia_id());
                prepareStatement.setObject(6, endereco.getDelivery_id());
                prepareStatement.setObject(7, endereco.getTaxaEntrega_id());
        }catch(SQLException ex){
            Logger.getLogger(EnderecoImplements.class.getName()).log (Level.SEVERE , "Erro ao Editar", ex);
        }    
    }

    @Override
    public List listar() throws SQLException {
        List<Endereco> enderecoList = new LinkedList<>();
        PreparedStatement prepareStatement;
        
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM endereco");
            ResultSet resultSet = prepareStatement.getResultSet();
            
            while(resultSet.next()){
                Endereco endereco = new Endereco();
                
                endereco.setId(resultSet.getInt("id"));
                endereco.setRua(resultSet.getString("rua"));
                endereco.setCep(resultSet.getString("cep"));
                endereco.setBairro_id((Bairro) resultSet.getObject("bairro"));
                endereco.setDistancia_id(resultSet.getDouble("distancia"));
                endereco.setDelivery_id((Delivery) resultSet.getObject("delivery"));
                endereco.setTaxaEntrega_id((Taxa_Entrega) resultSet.getObject("taxaEntrega"));
                
                enderecoList.add(endereco);
            }            
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar", ex);                        
        }
        return enderecoList;    
    }

    @Override
    public void delete(Endereco endereco) throws SQLException {
        PreparedStatement prepareStatement;
        try{
        prepareStatement = Conexao.getConnection().
                prepareStatement(
                "DELETE FROM endereco (id, rua, cep, bairro, distancia, delivery, taxaEntrega) VALUES (?, ?, ?, ?, ?, ?, ?)");
                prepareStatement.setInt(1, endereco.getId());
                prepareStatement.setString(2, endereco.getRua());
                prepareStatement.setString(3, endereco.getCep());
                prepareStatement.setObject(4, endereco.getBairro_id());
                prepareStatement.setDouble(5, endereco.getDistancia_id());
                prepareStatement.setObject(6, endereco.getDelivery_id());
                prepareStatement.setObject(7, endereco.getTaxaEntrega_id());
        }catch(SQLException ex){
            Logger.getLogger(EnderecoImplements.class.getName()).log (Level.SEVERE , "Erro ao Deletar", ex);
        }
    }

    @Override
    public Endereco findIdForEndereco(Integer id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM endereco WHERE id = ?");
            prepareStatement.setObject(1,id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Endereco endereco = new Endereco();
                
                endereco.setId(resultSet.getInt("id"));
                endereco.setRua(resultSet.getString("rua"));
                endereco.setCep(resultSet.getString("cep"));
                endereco.setBairro_id((Bairro) resultSet.getObject("bairro"));
                endereco.setDistancia_id(resultSet.getDouble("distancia"));
                endereco.setDelivery_id((Delivery) resultSet.getObject("delivery"));
                endereco.setTaxaEntrega_id((Taxa_Entrega) resultSet.getObject("taxaEntrega"));

                return endereco;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por ID", ex);
        }
        return null;           
    }

    @Override
    public Endereco findRuaForEndereco(String rua_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM endereco WHERE rua = ?");
            prepareStatement.setObject(2,rua_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Endereco endereco = new Endereco();
                
                endereco.setId(resultSet.getInt("id"));
                endereco.setRua(resultSet.getString("rua"));
                endereco.setCep(resultSet.getString("cep"));
                endereco.setBairro_id((Bairro) resultSet.getObject("bairro"));
                endereco.setDistancia_id(resultSet.getDouble("distancia"));
                endereco.setDelivery_id((Delivery) resultSet.getObject("delivery"));
                endereco.setTaxaEntrega_id((Taxa_Entrega) resultSet.getObject("taxaEntrega"));

                return endereco;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar pela Rua", ex);
        }
        return null;       
    }

    @Override
    public Endereco findCepForEndereco(String cep_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM endereco WHERE cep = ?");
            prepareStatement.setObject(3,cep_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Endereco endereco = new Endereco();
                
                endereco.setId(resultSet.getInt("id"));
                endereco.setRua(resultSet.getString("rua"));
                endereco.setCep(resultSet.getString("cep"));
                endereco.setBairro_id((Bairro) resultSet.getObject("bairro"));
                endereco.setDistancia_id(resultSet.getDouble("distancia"));
                endereco.setDelivery_id((Delivery) resultSet.getObject("delivery"));
                endereco.setTaxaEntrega_id((Taxa_Entrega) resultSet.getObject("taxaEntrega"));

                return endereco;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar pelo Cep", ex);
        }
        return null;     
    }

    @Override
    public Endereco findBairroForEndereco(Bairro bairro_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM endereco WHERE bairro = ?");
            prepareStatement.setObject(4,bairro_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Endereco endereco = new Endereco();
                
                endereco.setId(resultSet.getInt("id"));
                endereco.setRua(resultSet.getString("rua"));
                endereco.setCep(resultSet.getString("cep"));
                endereco.setBairro_id((Bairro) resultSet.getObject("bairro"));
                endereco.setDistancia_id(resultSet.getDouble("distancia"));
                endereco.setDelivery_id((Delivery) resultSet.getObject("delivery"));
                endereco.setTaxaEntrega_id((Taxa_Entrega) resultSet.getObject("taxaEntrega"));

                return endereco;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar pelo Bairro", ex);
        }
        return null;      
    }

    @Override
    public Endereco findDistanciaForEndereco(Double distancia_id) {
               PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM endereco WHERE distancia = ?");
            prepareStatement.setObject(5,distancia_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Endereco endereco = new Endereco();
                
                endereco.setId(resultSet.getInt("id"));
                endereco.setRua(resultSet.getString("rua"));
                endereco.setCep(resultSet.getString("cep"));
                endereco.setBairro_id((Bairro) resultSet.getObject("bairro"));
                endereco.setDistancia_id(resultSet.getDouble("distancia"));
                endereco.setDelivery_id((Delivery) resultSet.getObject("delivery"));
                endereco.setTaxaEntrega_id((Taxa_Entrega) resultSet.getObject("taxaEntrega"));

                return endereco;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar pela Distancia", ex);
        }
        return null;      
    }

    @Override
    public Endereco findDeliveryForEndereco(Delivery delivery_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM endereco WHERE delivery = ?");
            prepareStatement.setObject(6,delivery_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Endereco endereco = new Endereco();
                
                endereco.setId(resultSet.getInt("id"));
                endereco.setRua(resultSet.getString("rua"));
                endereco.setCep(resultSet.getString("cep"));
                endereco.setBairro_id((Bairro) resultSet.getObject("bairro"));
                endereco.setDistancia_id(resultSet.getDouble("distancia"));
                endereco.setDelivery_id((Delivery) resultSet.getObject("delivery"));
                endereco.setTaxaEntrega_id((Taxa_Entrega) resultSet.getObject("taxaEntrega"));

                return endereco;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar pelo Delivery", ex);
        }
        return null;     
    }

    @Override
    public Endereco findTaxaEntregaForEndereco(Taxa_Entrega taxaEntrega_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM endereco WHERE taxaEntrega = ?");
            prepareStatement.setObject(7,taxaEntrega_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Endereco endereco = new Endereco();
                
                endereco.setId(resultSet.getInt("id"));
                endereco.setRua(resultSet.getString("rua"));
                endereco.setCep(resultSet.getString("cep"));
                endereco.setBairro_id((Bairro) resultSet.getObject("bairro"));
                endereco.setDistancia_id(resultSet.getDouble("distancia"));
                endereco.setDelivery_id((Delivery) resultSet.getObject("delivery"));
                endereco.setTaxaEntrega_id((Taxa_Entrega) resultSet.getObject("taxaEntrega"));

                return endereco;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar pela Taxa Entrega", ex);
        }
        return null;     
    }


}
