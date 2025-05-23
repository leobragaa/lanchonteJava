
package implementsDao;

import conection.Conexao;
import dao.ProdutoDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Carrinho;
import model.Produto;

public class ProdutoImplements implements ProdutoDao{

    @Override
    public void salvar(Produto produto) throws SQLException {
        PreparedStatement prepareStatement;
        try {
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "INSERT INTO produto (id, nome, carrinho) VALUES (?, ?, ?)");
            prepareStatement.setInt(1,produto.getId());
            prepareStatement.setString(2,produto.getNome());
            prepareStatement.setObject(3,produto.getCarrinho());
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoImplements.class.getName()).log(Level.SEVERE, "Erro ao Inserir Produto", ex);
        }     
    }

    @Override
    public void delete(Produto produto) throws SQLException {
        PreparedStatement prepareStatement;
        try {
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "DELETE FROM produto (id, nome, carrinho) VALUES (?, ?, ?)");
            prepareStatement.setInt(1,produto.getId());
            prepareStatement.setString(2,produto.getNome());
            prepareStatement.setObject(3,produto.getCarrinho());
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoImplements.class.getName()).log(Level.SEVERE, "Erro ao Deletar Produto", ex);
        }
    }
    
    @Override
    public void editar(Produto produto) throws SQLException {
        PreparedStatement prepareStatement;
        try {
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "UPDATE bairro SET nome = ?, carrinho = ? WHERE id = ?");
            prepareStatement.setInt(1,produto.getId());
            prepareStatement.setString(2,produto.getNome());
            prepareStatement.setString(3,produto.getNome());
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoImplements.class.getName()).log(Level.SEVERE, "Erro ao Editar Produto", ex);
        }
    }

    @Override
    public List listar() throws SQLException {
        List<Produto> produtoList = new LinkedList<>();
        PreparedStatement prepareStatement; 
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM bairro");
            ResultSet resultSet = prepareStatement.getResultSet();
            
            while(resultSet.next()){
                Produto produto = new Produto();
                
                produto.setId(resultSet.getInt("id"));
                produto.setNome(resultSet.getString("nome"));
                produto.setCarrinho((List<Carrinho>) resultSet.getObject("carrinho"));
                
                produtoList.add(produto);
            }
        }catch(SQLException ex){
            Logger.getLogger(ProdutoImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar Produto", ex);
        }
        
        return produtoList;
    }


    @Override
    public Produto findProdutoForId(Integer id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM produto WHERE id = ?");
                    prepareStatement.setInt(1, id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Produto produto = new Produto();
                produto.setId(resultSet.getInt("id"));
                produto.setNome(resultSet.getString("nome"));
                produto.setCarrinho((List<Carrinho>) resultSet.getObject("carrinho"));
                return produto;
            }
        }catch(SQLException ex){
            Logger.getLogger(ProdutoImplements.class.getName()).log(Level.SEVERE, "Erro ao Encontrar ID do Produto", ex);

        }
        
        return null;
    }

    @Override
    public Produto findProdutoForNome(String nome_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM produto WHERE nome = ?");
                    prepareStatement.setString(2, nome_id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Produto produto = new Produto();
                produto.setId(resultSet.getInt("id"));
                produto.setNome(resultSet.getString("nome"));
                produto.setCarrinho((List<Carrinho>) resultSet.getObject("carrinho"));
                return produto;
            }
        }catch(SQLException ex){
            Logger.getLogger(ProdutoImplements.class.getName()).log(Level.SEVERE, "Erro ao Encontrar Nome do Produto", ex);

        }
        
        return null;
    }

    @Override
    public Produto findProdutoForCarrinho(List<Carrinho> carrinho_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM produto WHERE carrinho = ?");
                    prepareStatement.setObject(3, carrinho_id);
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Produto produto = new Produto();
                produto.setId(resultSet.getInt("id"));
                produto.setNome(resultSet.getString("nome"));
                produto.setCarrinho((List<Carrinho>) resultSet.getObject("carrinho"));
                return produto;
            }
        }catch(SQLException ex){
            Logger.getLogger(ProdutoImplements.class.getName()).log(Level.SEVERE, "Erro ao Encontrar Carrinho de Produto", ex);

        }
        
        return null;
    }

}
