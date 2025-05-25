
package implementsDao;

import conection.Conexao;
import dao.PagamentoDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cupom;
import model.Met_Pagamento;
import model.Pagamento;
import model.Pedido;

public class PagamentoImplements implements PagamentoDao{

    @Override
    public void salvar(Pagamento pagamento) throws SQLException {
           PreparedStatement preparePagamento;
            
        try{
            preparePagamento = Conexao.getConnection()
                .prepareStatement(
                "INSERT INTO pagamento (id, metPagamento, pedido, cupom) VALUES(?, ?, ?, ?)");
            preparePagamento.setInt(1,pagamento.getId());
            preparePagamento.setInt(2,pagamento.getMetPagamento_id().getId());
            preparePagamento.setInt(3,pagamento.getPedido_id().getId());
            preparePagamento.setInt(4,pagamento.getCupom_id().getId());
            preparePagamento.executeUpdate();
            
        }catch (SQLException ex){
            Logger.getLogger(PagamentoImplements.class.getName()).log(Level.SEVERE, "Erro ao Salvar Pagamento", ex);
        }             
    }

    @Override
    public void editar(Pagamento pagamento) throws SQLException {
           PreparedStatement preparePagamento;
            
        try{
            preparePagamento = Conexao.getConnection()
                .prepareStatement(
                "UPDATE pagamento SET metPagamento = ?, pedido = ?, cupom = ? WHERE id = ?");
            preparePagamento.setInt(1,pagamento.getId());
            preparePagamento.setInt(2,pagamento.getMetPagamento_id().getId());
            preparePagamento.setInt(3,pagamento.getPedido_id().getId());
            preparePagamento.setInt(4,pagamento.getCupom_id().getId());
            preparePagamento.executeUpdate();
            
        }catch (SQLException ex){
            Logger.getLogger(PagamentoImplements.class.getName()).log(Level.SEVERE, "Erro ao Editar Pagamento", ex);
        }         
    }

    @Override
    public void delete(Pagamento pagamento) throws SQLException {
           PreparedStatement preparePagamento;
            
        try{
            preparePagamento = Conexao.getConnection()
                .prepareStatement(
                "DELETE FROM pagamento (id, metPagamento, pedido, cupom) VALUES(?, ?, ?, ?)");
            preparePagamento.setInt(1,pagamento.getId());
            preparePagamento.setInt(2,pagamento.getMetPagamento_id().getId());
            preparePagamento.setInt(3,pagamento.getPedido_id().getId());
            preparePagamento.setInt(4,pagamento.getCupom_id().getId());
            
            preparePagamento.executeUpdate();
            
        }catch (SQLException ex){
            Logger.getLogger(PagamentoImplements.class.getName()).log(Level.SEVERE, "Erro ao Deletar Pagamento", ex);
        }         
    }
    
    @Override
    public List listar() throws SQLException {
        List<Pagamento> pagamentoList = new LinkedList<>();
        PreparedStatement prepareStatement; 
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM pagamento");
            ResultSet resultSet = prepareStatement.executeQuery();
            
            while(resultSet.next()){
                Pagamento pagamento = new Pagamento();

                pagamento.setId(resultSet.getInt("id"));
                
                Met_Pagamento metPagamento = new Met_Pagamento();
                metPagamento.setId(resultSet.getInt("metPagamento"));
                pagamento.setMetPagamento_id(metPagamento);
                
                Pedido pedido = new Pedido();
                pedido.setId(resultSet.getInt("pedido"));
                pagamento.setPedido_id(pedido);
                
                Cupom cupom = new Cupom();
                cupom.setId(resultSet.getInt("cupom"));
                pagamento.setCupom_id(cupom);
                
                pagamentoList.add(pagamento);
            }
        }catch(SQLException ex){
            Logger.getLogger(PagamentoImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar Pagamento", ex);
        }
        
        return pagamentoList;   
    }


}
