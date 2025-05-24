
package implementsDao;

import conection.Conexao;
import dao.Taxa_EntregaDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Bairro;
import model.Endereco;
import model.Taxa_Entrega;

public class Taxa_EntregaImplements implements Taxa_EntregaDao{

    @Override
    public void salvar(Taxa_Entrega taxaDaEntrega) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                .prepareStatement(
                "INSERT INTO texaDaEntrega(id, taxaEntrega, endereco)VALUES(?, ?, ?");
            prepareStatement.setInt(1,taxaDaEntrega.getId());
            prepareStatement.setDouble(2,taxaDaEntrega.getTaxaEntrega());
            prepareStatement.setObject(3,taxaDaEntrega.getEndereco_id());
        }catch (SQLException ex){
            Logger.getLogger(Taxa_EntregaImplements.class.getName()).log(Level.SEVERE, "Erro ao Salvar os dados", ex);
        }           
    }

    @Override
    public void editar(Taxa_Entrega taxaDaEntrega) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                .prepareStatement(
                "UPDATE texaDaEntrega SET taxaEntrega = ?, endereco = ? WHERE id = ?");
            prepareStatement.setInt(1,taxaDaEntrega.getId());
            prepareStatement.setDouble(2,taxaDaEntrega.getTaxaEntrega());
            prepareStatement.setObject(3,taxaDaEntrega.getEndereco_id());
        }catch (SQLException ex){
            Logger.getLogger(Taxa_EntregaImplements.class.getName()).log(Level.SEVERE, "Erro ao Editar os dados", ex);
        }      
    }

    @Override
    public void delete(Taxa_Entrega taxaDaEntrega) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                .prepareStatement(
                "DELETE FROM texaDaEntrega (id, taxaEntrega, endereco) VALUES(?, ?, ?)");
            prepareStatement.setInt(1,taxaDaEntrega.getId());
            prepareStatement.setDouble(2,taxaDaEntrega.getTaxaEntrega());
            prepareStatement.setObject(3,taxaDaEntrega.getEndereco_id());
        }catch (SQLException ex){
            Logger.getLogger(Taxa_EntregaImplements.class.getName()).log(Level.SEVERE, "Erro ao Deletar os dados", ex);
        }        
    }

    @Override
    public Taxa_Entrega findtTaxaEntregaForId(Integer id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM taxaDaEntrega WHERE id = ?");
                    prepareStatement.setInt(1,id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Taxa_Entrega taxaDaEntrega = new Taxa_Entrega();
                taxaDaEntrega.setId(resultSet.getInt("id"));
                taxaDaEntrega.setTaxaEntrega(resultSet.getDouble("taxaEntrega"));
                taxaDaEntrega.setEndereco_id((Endereco) resultSet.getObject("endereco"));
                return taxaDaEntrega;
            }
        }catch(SQLException ex){
            Logger.getLogger(Taxa_EntregaImplements.class.getName()).log(Level.SEVERE, "Erro ao Encontrar  ID", ex);

        }
        
        return null;
    }

    @Override
    public List listar() throws SQLException {
        List<Taxa_Entrega> taxaDaEntregaList = new LinkedList<>();
        PreparedStatement prepareStatement; 
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM taxaDaEntrega");
            ResultSet resultSet = prepareStatement.getResultSet();
            
            while(resultSet.next()){
                Taxa_Entrega taxaDaEntrega = new Taxa_Entrega();
                
                taxaDaEntrega.setId(resultSet.getInt("id"));
                taxaDaEntrega.setTaxaEntrega(resultSet.getDouble("taxaEntrega"));
                taxaDaEntrega.setEndereco_id((Endereco) resultSet.getObject("endereco"));
                
                taxaDaEntregaList.add(taxaDaEntrega);
            }
        }catch(SQLException ex){
            Logger.getLogger(Taxa_EntregaImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar", ex);
        }
        
        return taxaDaEntregaList;    
    }

    @Override
    public Taxa_Entrega findtTaxaEntregaForTaxa(Double taxaEntrega_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM taxaDaEntrega WHERE taxaEntrega = ?");
                    prepareStatement.setDouble(2,taxaEntrega_id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Taxa_Entrega taxaDaEntrega = new Taxa_Entrega();
                taxaDaEntrega.setId(resultSet.getInt("id"));
                taxaDaEntrega.setTaxaEntrega(resultSet.getDouble("taxaEntrega"));
                taxaDaEntrega.setEndereco_id((Endereco) resultSet.getObject("endereco"));
                return taxaDaEntrega;
            }
        }catch(SQLException ex){
            Logger.getLogger(Taxa_EntregaImplements.class.getName()).log(Level.SEVERE, "Erro ao Encontrar Taxa Entrega", ex);

        }
        
        return null;
    }

    @Override
    public Taxa_Entrega findtTaxaEntregaForEndereco(Endereco endereco_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM endereco WHERE id = ?");
                    prepareStatement.setObject(3,endereco_id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Taxa_Entrega taxaDaEntrega = new Taxa_Entrega();
                taxaDaEntrega.setId(resultSet.getInt("id"));
                taxaDaEntrega.setTaxaEntrega(resultSet.getDouble("taxaEntrega"));
                taxaDaEntrega.setEndereco_id((Endereco) resultSet.getObject("endereco"));
                return taxaDaEntrega;
            }
        }catch(SQLException ex){
            Logger.getLogger(Taxa_EntregaImplements.class.getName()).log(Level.SEVERE, "Erro ao Encontrar Endereco", ex);

        }
        
        return null;
    }

}
