
package implementsDao;

import conection.Conexao;
import dao.CartaoDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cartao;
import model.Met_Pagamento;

public class CartaoImplements implements CartaoDao{

    @Override
    public void salvar(Cartao cartao) throws SQLException{
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    " INSERT INTO cartao(id, tipoPagamento, numCartao, cvv, metPagamento) VALUES (?, ?, ?, ?, ?)");
            prepareStatement.setInt(1, cartao.getId());
            prepareStatement.setBoolean(2, cartao.isTipoPagamento());
            prepareStatement.setString(3, cartao.getNumCartao());
            prepareStatement.setInt(4, cartao.getCvv());
            prepareStatement.setObject(5, cartao.getMetPagamento_id());
        }catch(SQLException ex){
            Logger.getLogger(CartaoImplements.class.getName()).log(Level.SEVERE, "Erro ao Salvar os dados", ex);            
        }        
    }

    @Override
    public void editar(Cartao cartao) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    " UPDATE cartao SET id = ?, tipoPagamento = ?, numCartao = ?, cvv = ?, metPagamento = ? WHERE id = ?");
            prepareStatement.setInt(1, cartao.getId());
            prepareStatement.setBoolean(2, cartao.isTipoPagamento());
            prepareStatement.setString(3, cartao.getNumCartao());
            prepareStatement.setInt(4, cartao.getCvv());
            prepareStatement.setObject(5, cartao.getMetPagamento_id());
        }catch(SQLException ex){
            Logger.getLogger(CartaoImplements.class.getName()).log(Level.SEVERE, "Erro ao Salvar os dados", ex);            
        }     
    }

    @Override
    public void delete(Cartao cartao) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    " DELETE FROM cartao(id, tipoPagamento, numCartao, cvv, metPagamento) VALUES (?, ?, ?, ?)");
            prepareStatement.setInt(1, cartao.getId());
            prepareStatement.setBoolean(2, cartao.isTipoPagamento());
            prepareStatement.setString(3, cartao.getNumCartao());
            prepareStatement.setInt(4, cartao.getCvv());
            prepareStatement.setObject(5, cartao.getMetPagamento_id());
        }catch(SQLException ex){
            Logger.getLogger(CartaoImplements.class.getName()).log(Level.SEVERE, "Erro ao Salvar os dados", ex);            
        }     
    }

    @Override
    public Cartao findIdForCartao(Integer id) {
        try {
            PreparedStatement prepareStatement = Conexao.getConnection()
                .prepareStatement("SELECT * FROM cartao WHERE id = ?");
            prepareStatement.setInt(1, id);
            ResultSet resultSet = prepareStatement.getResultSet();

            if (resultSet.next()) {
                Cartao cartao = new Cartao();
                cartao.setId(resultSet.getInt("id"));
                cartao.setTipoPagamento(resultSet.getBoolean("tipoPagamento"));
                cartao.setNumCartao(resultSet.getString("numCartao"));
                cartao.setCvv(resultSet.getInt("cvv"));
                cartao.setMetPagamento_id((Met_Pagamento) resultSet.getObject("metPagamento"));
                return cartao;
            }
        }catch (SQLException ex) {
            Logger.getLogger(CartaoImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar cartao por ID", ex);
        }
        return null;        
    }

    @Override
    public Cartao findTipoPagamentoForCartao(boolean tipoPgamento_id) {
        try {
            PreparedStatement prepareStatement = Conexao.getConnection()
                .prepareStatement("SELECT * FROM cartao WHERE tipoPagamento = ?");
            prepareStatement.setBoolean(2, tipoPgamento_id);
            ResultSet resultSet = prepareStatement.getResultSet();

            if (resultSet.next()) {
                Cartao cartao = new Cartao();
                cartao.setId(resultSet.getInt("id"));
                cartao.setTipoPagamento(resultSet.getBoolean("tipoPagamento"));
                cartao.setNumCartao(resultSet.getString("numCartao"));
                cartao.setCvv(resultSet.getInt("cvv"));
                cartao.setMetPagamento_id((Met_Pagamento) resultSet.getObject("metPagamento"));
                return cartao;
            }
        }catch (SQLException ex) {
            Logger.getLogger(CartaoImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar telefone por Tipo de Pagamento", ex);
        }
        return null;              
    }

    @Override
    public Cartao findNumCartaoForCartao(String numCartao_id) {
        try {
            PreparedStatement prepareStatement = Conexao.getConnection()
                .prepareStatement("SELECT * FROM cartao WHERE numCartao = ?");
            prepareStatement.setString(3, numCartao_id);
            ResultSet resultSet = prepareStatement.getResultSet();

            if (resultSet.next()) {
                Cartao cartao = new Cartao();
                cartao.setId(resultSet.getInt("id"));
                cartao.setTipoPagamento(resultSet.getBoolean("tipoPagamento"));
                cartao.setNumCartao(resultSet.getString("numCartao"));
                cartao.setCvv(resultSet.getInt("cvv"));
                cartao.setMetPagamento_id((Met_Pagamento) resultSet.getObject("metPagamento"));
                return cartao;
            }
        }catch (SQLException ex) {
            Logger.getLogger(CartaoImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar cartao por Numero do Cartao", ex);
        }
        return null;          
    }

    @Override
    public Cartao findCvvForCartao(Integer cvv_id) {
        try {
            PreparedStatement prepareStatement = Conexao.getConnection()
                .prepareStatement("SELECT * FROM cartao WHERE cvv = ?");
            prepareStatement.setInt(4, cvv_id);
            ResultSet resultSet = prepareStatement.getResultSet();

            if (resultSet.next()) {
                Cartao cartao = new Cartao();
                cartao.setId(resultSet.getInt("id"));
                cartao.setTipoPagamento(resultSet.getBoolean("tipoPagamento"));
                cartao.setNumCartao(resultSet.getString("numCartao"));
                cartao.setCvv(resultSet.getInt("cvv"));
                cartao.setMetPagamento_id((Met_Pagamento) resultSet.getObject("metPagamento"));
                return cartao;
            }
        }catch (SQLException ex) {
            Logger.getLogger(CartaoImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar cartao por CVV", ex);
        }
        return null;          
    }
    
    @Override
    public Cartao findMetPagamentoForCartao(Met_Pagamento metPagamento_id) {
        try {
            PreparedStatement prepareStatement = Conexao.getConnection()
                .prepareStatement("SELECT * FROM cartao WHERE metPagamento = ?");
            prepareStatement.setObject(5, metPagamento_id);
            ResultSet resultSet = prepareStatement.getResultSet();

            if (resultSet.next()) {
                Cartao cartao = new Cartao();
                cartao.setId(resultSet.getInt("id"));
                cartao.setTipoPagamento(resultSet.getBoolean("tipoPagamento"));
                cartao.setNumCartao(resultSet.getString("numCartao"));
                cartao.setCvv(resultSet.getInt("cvv"));
                cartao.setMetPagamento_id((Met_Pagamento) resultSet.getObject("metPagamento"));
                return cartao;
            }
        }catch (SQLException ex) {
            Logger.getLogger(CartaoImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar cartao por o Metodo de Pagamento.", ex);
        }
        return null;       
    }

    @Override
    public List listar() throws SQLException {
        List<Cartao> cartaoList = new LinkedList<>();
        PreparedStatement prepareStatement;
        
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM cartao");
            ResultSet resultSet = prepareStatement.getResultSet();
            
            while(resultSet.next()){
                Cartao cartao = new Cartao();
                
                cartao.setId(resultSet.getInt("id"));
                cartao.setTipoPagamento(resultSet.getBoolean("tipoPagamento"));
                cartao.setNumCartao(resultSet.getString("numCartao"));
                cartao.setCvv(resultSet.getInt("cvv"));
                cartao.setMetPagamento_id((Met_Pagamento) resultSet.getObject("metPagamento"));
                
                cartaoList.add(cartao);
            }            
        }catch(SQLException ex){
            Logger.getLogger(CartaoImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar", ex);                        
        }
        return cartaoList;
    }

}
