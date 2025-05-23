
package implementsDao;

import conection.Conexao;
import dao.ReembolsoDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pedido;
import model.Reembolso;

public class ReembolsoImplements implements ReembolsoDao{

    @Override
    public void salvar(Reembolso rembolso) throws SQLException {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                .prepareStatement(
                "INSERT INTO bairro(id, motivo, pedido)VALUES(?, ?, ?");
            prepareStatement.setInt(1,rembolso.getId());
            prepareStatement.setString(2,rembolso.getMotivo());
            prepareStatement.setObject(3,rembolso.getPedido_id());
        }catch (SQLException ex){
            Logger.getLogger(ReembolsoImplements.class.getName()).log(Level.SEVERE, "Erro ao Salvar os dados em Reembolso", ex);
        }           
    }

    @Override
    public void editar(Reembolso rembolso) throws SQLException {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                .prepareStatement(
                "UPDATE rembolso SET motivo = ?, pedido = ? WHERE id = ?");
            prepareStatement.setInt(1,rembolso.getId());
            prepareStatement.setString(2,rembolso.getMotivo());
            prepareStatement.setObject(3,rembolso.getPedido_id());
        }catch (SQLException ex){
            Logger.getLogger(ReembolsoImplements.class.getName()).log(Level.SEVERE, "Erro ao Editar dados em Reembolso", ex);
        }         
    }

    @Override
    public List listar() throws SQLException {
        List<Reembolso> rembolsoList = new LinkedList<>();
        PreparedStatement prepareStatement; 
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM rembolso");
            ResultSet resultSet = prepareStatement.getResultSet();
            
            while(resultSet.next()){
                Reembolso rembolso = new Reembolso();
                
                rembolso.setId(resultSet.getInt("id"));
                rembolso.setMotivo(resultSet.getString("motivo"));
                rembolso.setPedido_id((Pedido) resultSet.getObject("pedido"));
                
                rembolsoList.add(rembolso);
            }
        }catch(SQLException ex){
            Logger.getLogger(ReembolsoImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar", ex);
        }
        
        return rembolsoList;
    }

    @Override
    public void delete(Reembolso rembolso) throws SQLException {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                .prepareStatement(
                "DELETE FROM rembolso (id, motivo, pedido) VALUES (?, ?, ?)");
            prepareStatement.setInt(1,rembolso.getId());
            prepareStatement.setString(2,rembolso.getMotivo());
            prepareStatement.setObject(3,rembolso.getPedido_id());
        }catch (SQLException ex){
            Logger.getLogger(ReembolsoImplements.class.getName()).log(Level.SEVERE, "Erro ao Deletar dados em Reembolso", ex);
        }  
    }

    @Override
    public Reembolso findReembolsoForId(Integer id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM reembolso WHERE id = ?");
                    prepareStatement.setInt(1, id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Reembolso reembolso = new Reembolso();
                reembolso.setId(resultSet.getInt("id"));
                reembolso.setMotivo(resultSet.getString("motivo"));
                reembolso.setPedido_id((Pedido) resultSet.getObject("pedido"));
                
                return reembolso;
            }
        }catch(SQLException ex){
            Logger.getLogger(ReembolsoImplements.class.getName()).log(Level.SEVERE, "Erro ao Encontrar ID em Reembolso", ex);

        }
        
        return null;
    }

    @Override
    public Reembolso findReembolsoForMotivo(String motivo_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM reembolso WHERE motivo = ?");
                    prepareStatement.setString(2, motivo_id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Reembolso reembolso = new Reembolso();
                reembolso.setId(resultSet.getInt("id"));
                reembolso.setMotivo(resultSet.getString("motivo"));
                reembolso.setPedido_id((Pedido) resultSet.getObject("pedido"));
                
                return reembolso;
            }
        }catch(SQLException ex){
            Logger.getLogger(ReembolsoImplements.class.getName()).log(Level.SEVERE, "Erro ao Encontrar Motivo em Reembolso", ex);

        }
        
        return null;
    }

    @Override
    public Reembolso findReembolsoForPedido(Pedido pedido_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM reembolso WHERE pedido = ?");
                    prepareStatement.setObject(3, pedido_id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Reembolso reembolso = new Reembolso();
                reembolso.setId(resultSet.getInt("id"));
                reembolso.setMotivo(resultSet.getString("motivo"));
                reembolso.setPedido_id((Pedido) resultSet.getObject("pedido"));
                
                return reembolso;
            }
        }catch(SQLException ex){
            Logger.getLogger(ReembolsoImplements.class.getName()).log(Level.SEVERE, "Erro ao Encontrar Pedido em Reembolso", ex);

        }
        
        return null;
    }

}
