
package implementsDao;

import conection.Conexao;
import dao.CartaoDao;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cartao;

public class CartaoImplements implements CartaoDao{

    @Override
    public void salvar(Cartao cartao) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    " INSERT INTO cartao(id, tipoPagamento, numCartao, cvv) VALUES (?, ?, ?, ?)");
            prepareStatement.setInt(1, cartao.getId());
            prepareStatement.setInt(2, cartao.getTipoPagamento());
            prepareStatement.setInt(3, cartao.getNumCartao());
            prepareStatement.setString(4, cartao.getCvv());
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
                    " UPDATE cartao SET id = ?, tipoPagamento = ?, numCartao = ?, cvv = ? WHERE id = ?");
            prepareStatement.setInt(1, cartao.getId());
            prepareStatement.setInt(2, cartao.getTipoPagamento());
            prepareStatement.setInt(3, cartao.getNumCartao());
            prepareStatement.setString(4, cartao.getCvv());
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
                    " DELETE FROM cartao(id, tipoPagamento, numCartao, cvv) VALUES (?, ?, ?, ?)");
            prepareStatement.setInt(1, cartao.getId());
            prepareStatement.setInt(2, cartao.getTipoPagamento());
            prepareStatement.setInt(3, cartao.getNumCartao());
            prepareStatement.setString(4, cartao.getCvv());
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
                cartao.setId(resultSet.setInt("id"));
                cartao.setTipoPagamento(resultSet.setInt("tipoPagamento"));
                cartao.setNumCartao(resultSet.setInt("numCartao"));
                cartao.setCvv(resultSet.setString("cvv"));
                return cartao;
            }
        }catch (SQLException ex) {
            Logger.getLogger(CartaoImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar cartao por ID", ex);
        }
        return null;        
    }

    @Override
    public Cartao findTipoPagamentoForCartao(boolean pagamento_id) {
        try {
            PreparedStatement prepareStatement = Conexao.getConnection()
                .prepareStatement("SELECT * FROM cartao WHERE tipoPagamento = ?");
            prepareStatement.setInt(2, pagamento_id);
            ResultSet resultSet = prepareStatement.getResultSet();

            if (resultSet.next()) {
                Cartao cartao = new Cartao();
                cartao.setId(resultSet.setInt("id"));
                cartao.setTipoPagamento(resultSet.setInt("tipoPagamento"));
                cartao.setNumCartao(resultSet.setInt("numCartao"));
                cartao.setCvv(resultSet.setString("cvv"));
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
            prepareStatement.setInt(3, numCartao_id);
            ResultSet resultSet = prepareStatement.getResultSet();

            if (resultSet.next()) {
                Cartao cartao = new Cartao();
                cartao.setId(resultSet.setInt("id"));
                cartao.setTipoPagamento(resultSet.setInt("tipoPagamento"));
                cartao.setNumCartao(resultSet.setInt("numCartao"));
                cartao.setCvv(resultSet.setString("cvv"));
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
                cartao.setId(resultSet.setInt("id"));
                cartao.setTipoPagamento(resultSet.setInt("tipoPagamento"));
                cartao.setNumCartao(resultSet.setInt("numCartao"));
                cartao.setCvv(resultSet.setString("cvv"));
                return cartao;
            }
        }catch (SQLException ex) {
            Logger.getLogger(CartaoImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar cartao por CVV", ex);
        }
        return null;          
    }

    @Override
    public List listar(Cartao cartao) throws SQLException{
        List<Cartao> cartaoList = new LinkedList<>();
        PreparedStatement prepareStatement;
        
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM cartao");
            ResultSet resultSet = prepareStatement.getResultSet();
            
            while(resultSet.next()){
                Cartao cartao = new Cartao();
                
                cartao.setId(resultSet.setInt("id"));
                cartao.setTipoPagamento(resultSet.setInt("tipoPagamento"));
                cartao.setNumCartao(resultSet.setInt("numCartao"));
                cartao.setCvv(resultSet.setString("cvv"));
                
                cartaoList.add(cartao);
            }            
        }catch(SQLException ex){
            Logger.getLogger(CartaoImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar", ex);                        
        }
        return cartaoList;
    }

}
