
package implementsDao;

import conection.Conexao;
import dao.CupomDao;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cupom;

public class CupomImplements implements CupomDao{

    @Override
    public void salvar(Cupom cupom) throws SQLException{
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    " INSERT INTO cupom (id, valorCupom, codigo, validadeData) VALUES (?, ?, ?, ?, ?)");
            prepareStatement.setInt(1,cupom.getId());
            prepareStatement.setDouble(2, cupom.getValorCupom());
            prepareStatement.setInt(3, cupom.getCodigo());
            prepareStatement.setDate(4, (java.sql.Date) cupom.getValidade());
        }catch(SQLException ex){
            Logger.getLogger(CarrinhoImplements.class.getName()).log(Level.SEVERE, "Erro ao Salvar os dados", ex);            
        }             
    }

    @Override
    public void editar(Cupom cupom) {
        PreparedStatement prepareStatement;
        try {
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "UPDATE cupom SET valorCupom = ?, codigo = ?, validadeData = ? WHERE id = ?");
            prepareStatement.setInt(1,cupom.getId());
            prepareStatement.setDouble(2, cupom.getValorCupom());
            prepareStatement.setInt(3, cupom.getCodigo());
            prepareStatement.setDate(4, (java.sql.Date) cupom.getValidade());
        } catch (SQLException ex) {
            Logger.getLogger(CarrinhoImplements.class.getName()).log(Level.SEVERE, "Erro ao Editar", ex);
        }  
    }

    @Override
    public void delete(Cupom cupom) {
        PreparedStatement prepareStatement;
        try {
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "DELETE FROM cupom (id, valorCupom, codigo, validadeData) VALUES (?, ?, ?, ?)");
            prepareStatement.setInt(1,cupom.getId());
            prepareStatement.setDouble(2, cupom.getValorCupom());
            prepareStatement.setInt(3, cupom.getCodigo());
            prepareStatement.setDate(4, (java.sql.Date) cupom.getValidade());
        } catch (SQLException ex) {
            Logger.getLogger(CarrinhoImplements.class.getName()).log(Level.SEVERE, "Erro ao Deletar", ex);
        }    
    }

    @Override
    public Cupom findIdForCupom(Integer id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM cupom WHERE id = ?");
            prepareStatement.setInt(1,id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Cupom cupom = new Cupom();
                cupom.setId(resultSet.getInt("id"));
                cupom.setValorCupom(resultSet.getDouble("valorCupom"));
                cupom.setCodigo(resultSet.getInt("codigo"));
                cupom.setValidade(resultSet.getDate("validadeData"));
                return cupom;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(BairroImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por ID", ex);
        }
        return null;
    }

    @Override
    public Cupom findValorForCupom(Integer valor_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM cupom WHERE valorCupom = ?");
            prepareStatement.setInt(2,valor_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Cupom cupom = new Cupom();
                cupom.setId(resultSet.getInt("id"));
                cupom.setValorCupom(resultSet.getDouble("valorCupom"));
                cupom.setCodigo(resultSet.getInt("codigo"));
                cupom.setValidade(resultSet.getDate("validadeData"));
                return cupom;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(BairroImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por Valor", ex);
        }
        return null;
    }

    @Override
    public Cupom findCodForCupom(Integer cod_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM cupom WHERE codigo = ?");
            prepareStatement.setInt(3,cod_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Cupom cupom = new Cupom();
                cupom.setId(resultSet.getInt("id"));
                cupom.setValorCupom(resultSet.getDouble("valorCupom"));
                cupom.setCodigo(resultSet.getInt("codigo"));
                cupom.setValidade(resultSet.getDate("validadeData"));
                return cupom;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(BairroImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por Codigo", ex);
        }
        return null;
    }

    @Override
    public Cupom findValidadeForCupom(Date validade_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM cupom WHERE validadeData = ?");
            prepareStatement.setDate(4, (java.sql.Date) validade_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Cupom cupom = new Cupom();
                cupom.setId(resultSet.getInt("id"));
                cupom.setValorCupom(resultSet.getDouble("valorCupom"));
                cupom.setCodigo(resultSet.getInt("codigo"));
                cupom.setValidade(resultSet.getDate("validadeData"));
                return cupom;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(BairroImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por Validade", ex);
        }
        return null;
    }

    @Override
    public List listar() throws SQLException{
        
        List<Cupom> cupomList = new LinkedList<>();
        PreparedStatement prepareStatement;
        
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM cupom");
            ResultSet resultSet = prepareStatement.getResultSet();
            
            while(resultSet.next()){
                Cupom cupom = new Cupom();
                
                cupom.setId(resultSet.getInt("id"));
                cupom.setValorCupom(resultSet.getDouble("valorCupom"));
                cupom.setCodigo(resultSet.getInt("codigo"));
                cupom.setValidade(resultSet.getDate("validadeData"));
                
                cupomList.add(cupom);
            }            
        }catch(SQLException ex){
            Logger.getLogger(CarrinhoImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar", ex);                        
        }
        return cupomList;     
        
    }

}
