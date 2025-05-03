
package implementsDao;

import conection.Conexao;
import dao.BairroDao;
import java.sql.SQLException;
import java.util.List;
import model.Bairro;
import java.sql.PreparedStatement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BairroImplements implements BairroDao{

    @Override
    public void salvar(Bairro bairroData) throws SQLException {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                .prepareStatement(
                "INSERT INTO bairro(id, nome)VALUES(?,?");
            prepareStatement.setInt(1,bairroData.getId());
            prepareStatement.setString(2,bairroData.getnome());
        }catch (SQLException ex){
            Logger.getLogger(BairroImplements.class.getName()).log(Level.SEVERE, "Erro ao Salvar os dados", ex);
        }    
    }

    @Override
    public void editar(Bairro bairroData) {
        PreparedStatement prepareStatement;
        try {
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "UPDATE bairro SET nome = ? WHERE id = ?");
            prepareStatement.setInt(1,bairroData.getId());
            prepareStatement.setString(2,bairroData.getnome());
        } catch (SQLException ex) {
            Logger.getLogger(BairroImplements.class.getName()).log(Level.SEVERE, "Erro ao editar o valor", ex);
        }
    }

    @Override
    public List listar(Bairro bairroData) throws SQLException{
        List<Bairro> bairrosList = new LinkedList<>();
        PreparedStatement preparedStatement; 
        try{
            preparedStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM bairro");
            ResultSet resultSet = preparedStatement.getResultSet();
            
            while(resultSet.next()){
                Bairro bairro = new Bairro();
                
                bairro(resultSet.setId("id"));
                bairro(resultSet.setnome("nome"));
                
                bairrosList.add(bairro);
            }
        }catch(SQLException ex){
            Logger.getLogger(BairroImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar", ex);
        }
        
        return bairrosList;
    }

    @Override
    public void delete(Bairro bairroData) {
        PreparedStatement prepareStatement;
        try {
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                            "DELETE FROM bairro(id, nome)VALUES(?,?");
            prepareStatement.setInt(1,bairroData.getId());
            prepareStatement.setString(2,bairroData.getnome());
        } catch (SQLException ex) {
            Logger.getLogger(BairroImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Bairro findIdForBairro(Integer id) { 
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM bairro WHERE id = ?");
                    prepareStatement.setInt(1,id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Bairro bairro = new Bairro();
                bairro.setId(resultSet.getInt("id"));
                bairro.setnome(resultSet.getString("nome"));
                return bairro;
            }
        }catch(SQLException ex){
            Logger.getLogger(BairroImplements.class.getName()).log(Level.SEVERE, "Erro ao Encontrar id do Bairro", ex);

        }
        
        return null;
    }

    @Override
    public Bairro findNomeForBairro(String nome_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM bairro WHERE nome = ?");
            prepareStatement.setString(2,nome_id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Bairro bairro = new Bairro;
                bairro.setId(resultSet.getInt("id"));
                bairro.setnome(resultSet.getString("nome"));
                return bairro;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(BairroImplements.class.getName()).log(Level.SEVERE, "Erro ao Encontrar Nome do Bairro", ex);
        }
        return null;
    }

}
