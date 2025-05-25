
package implementsDao;

import conection.Conexao;
import dao.Met_PagamentoDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cartao;
import model.Dinheiro;
import model.Met_Pagamento;

public class Met_PagamentoImplements implements Met_PagamentoDao{

    @Override
    public void salvar(Met_Pagamento metPagamento) throws SQLException {
        PreparedStatement prepareMetPagamento;
        PreparedStatement prepareDinheiro;
        PreparedStatement prepareCartao;
            
        try{
            prepareMetPagamento = Conexao.getConnection()
                .prepareStatement(
                "INSERT INTO metPagamento (id, pix) VALUES(?, ?)");
            prepareMetPagamento.setInt(1,metPagamento.getId());
            prepareMetPagamento.setDouble(2,metPagamento.getPix());
            
            prepareDinheiro = Conexao.getConnection()
                .prepareStatement(
                "INSERT INTO metPagamento (id, valorEntregue) VALUES(?, ?)");
            for (Dinheiro dinheiro : metPagamento.getDinheiro_id()) {
                prepareDinheiro.setInt(1, metPagamento.getId());
                prepareDinheiro.setDouble(2, dinheiro.getValorEntrega());
                
                prepareDinheiro.executeUpdate();
            }

            prepareCartao = Conexao.getConnection()
                .prepareStatement(
                   "INSERT INTO metPagamento (id, cvv, numCartao) VALUES(?, ?, ?)");
            for (Cartao cartao : metPagamento.getCartao_id()) {
                prepareCartao.setInt(1, cartao.getId());
                prepareCartao.setInt(2, cartao.getCvv());
                prepareCartao.setBoolean(2, cartao.isTipoPagamento());
                prepareCartao.setString(3, cartao.getNumCartao());
                
                prepareCartao.executeUpdate();
            }
            
        }catch (SQLException ex){
            Logger.getLogger(Met_PagamentoImplements.class.getName()).log(Level.SEVERE, "Erro ao Salvar Metodo Pagamento", ex);
        }     
    }

    @Override
    public void editar(Met_Pagamento metPagamento) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Met_Pagamento metPagamento) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listar() throws SQLException {
    }

}
