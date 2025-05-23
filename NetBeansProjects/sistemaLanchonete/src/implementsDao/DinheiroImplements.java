
package implementsDao;

import conection.Conexao;
import dao.DinheiroDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Dinheiro;
import model.Met_Pagamento;

public class DinheiroImplements implements DinheiroDao{

    @Override
    public void salvar(Dinheiro dinheiro) throws SQLException {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    " INSERT INTO dinheiro (id, valorEntrega, metPagamento) VALUES (?, ?, ?)");
                prepareStatement.setDouble(1, dinheiro.getId());
                prepareStatement.setObject(2, dinheiro.getValorEntrega());
                prepareStatement.setObject(3, dinheiro.getMetPagamento_id());
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao Salvar os dados", ex);            
        }   
    }

    @Override
    public void delete(Dinheiro dinheiro) throws SQLException {
        PreparedStatement prepareStatement;
        try {
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "DELETE FROM dinheiro (id, valorEntrega, metPagamento) VALUES (?, ?, ?)");
                prepareStatement.setDouble(1, dinheiro.getId());
                prepareStatement.setObject(2, dinheiro.getValorEntrega());
                prepareStatement.setObject(3, dinheiro.getMetPagamento_id());

        } catch (SQLException ex) {
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao Deletar", ex);
        }          
    }

    @Override
    public void editar(Dinheiro dinheiro) throws SQLException {
        PreparedStatement prepareStatement;
        try {
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "UPDATE dinheiro SET valorEntrega = ?, metPagamento = ? WHERE id = ?");
                prepareStatement.setDouble(1, dinheiro.getId());
                prepareStatement.setObject(2, dinheiro.getValorEntrega());
                prepareStatement.setObject(3, dinheiro.getMetPagamento_id());

        } catch (SQLException ex) {
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao Editar", ex);
        }            
    }
    
    @Override
    public List listar() throws SQLException {
        List<Dinheiro> dinheiroList = new LinkedList<>();
        PreparedStatement prepareStatement;
        
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM dinheiro");
            ResultSet resultSet = prepareStatement.getResultSet();
            
            while(resultSet.next()){
                Dinheiro dinheiro = new Dinheiro();
                
                dinheiro.setId(resultSet.getInt("id"));
                dinheiro.setMetPagamento_id((Met_Pagamento) resultSet.getObject("metPagamento"));
                dinheiro.setValorEntrega(resultSet.getDouble("valorEntrega"));
                
                dinheiroList.add(dinheiro);
            }            
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar", ex);                        
        }
        return dinheiroList;          
    }


    @Override
    public Dinheiro findIdForDinheiro(Integer id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM dinheiro WHERE id = ?");
            prepareStatement.setObject(1,id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Dinheiro dinheiro = new Dinheiro();
                dinheiro.setId(resultSet.getInt("id"));
                dinheiro.setMetPagamento_id((Met_Pagamento) resultSet.getObject("valorEntrega"));
                dinheiro.setValorEntrega((Double) resultSet.getObject("metPagamento"));

                return dinheiro;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por ID", ex);
        }
        return null;         
    }

    @Override
    public Dinheiro findValorEntregaForDinheiro(Double valorEntrega_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM dinheiro WHERE valorEntrega = ?");
            prepareStatement.setObject(2,valorEntrega_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Dinheiro dinheiro = new Dinheiro();
                dinheiro.setId(resultSet.getInt("id"));
                dinheiro.setMetPagamento_id((Met_Pagamento) resultSet.getObject("valorEntrega"));
                dinheiro.setValorEntrega((Double) resultSet.getObject("metPagamento"));

                return dinheiro;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por Valor da Entrega", ex);
        }
        return null;      
    }

    @Override
    public Dinheiro findMetPagamentoForDinheiro(Met_Pagamento metPagamento_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM dinheiro WHERE metPagamento = ?");
            prepareStatement.setObject(3,metPagamento_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Dinheiro dinheiro = new Dinheiro();
                dinheiro.setId(resultSet.getInt("id"));
                dinheiro.setMetPagamento_id((Met_Pagamento) resultSet.getObject("valorEntrega"));
                dinheiro.setValorEntrega((Double) resultSet.getObject("metPagamento"));

                return dinheiro;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DeliveryImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por Metodo de Pagamento", ex);
        }
        return null;       
    }

}
