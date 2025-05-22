
package implementsDao;

import conection.Conexao;
import dao.CarrinhoDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Carrinho;
import model.Ingrediente_Escolha;
import model.Produto;


public class CarrinhoImplements implements CarrinhoDao{

    @Override
    public void salvar(Carrinho carrinho) throws SQLException {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    " INSERT INTO carrinho (id, produto, ingredienteEscolha, quantidade) VALUES (?, ?, ?, ?)");
            prepareStatement.setInt(1,carrinho.getId());
            prepareStatement.setObject(2,carrinho.getProduto_id());
            prepareStatement.setObject(3,carrinho.getIngredienteEscolha_id());
            prepareStatement.setInt(4,carrinho.getQuantidade());
        }catch(SQLException ex){
            Logger.getLogger(CarrinhoImplements.class.getName()).log(Level.SEVERE, "Erro ao Salvar os dados", ex);            
        }        
    }

    @Override
    public void editar(Carrinho carrinho) {
        PreparedStatement prepareStatement;
        try {
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "UPDATE carrinho SET produto = ?, ingredienteEscolha = ?, quantidade = ? WHERE id = ?");
            prepareStatement.setInt(1,carrinho.getId());
            prepareStatement.setObject(2,carrinho.getProduto_id());
            prepareStatement.setObject(3,carrinho.getIngredienteEscolha_id());
            prepareStatement.setInt(4,carrinho.getQuantidade());
        } catch (SQLException ex) {
            Logger.getLogger(CarrinhoImplements.class.getName()).log(Level.SEVERE, "Erro ao Editar o valor", ex);
        }        
    }

    @Override
    public void delete(Carrinho carrinho) {
        PreparedStatement prepareStatement;
        try {
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "DELETE FROM carrinho (id, produto, ingredienteEscolha, quantidade) VALUES (?, ?, ?, ?)");
            prepareStatement.setInt(1,carrinho.getId());
            prepareStatement.setObject(2,carrinho.getProduto_id());
            prepareStatement.setObject(3,carrinho.getIngredienteEscolha_id());
            prepareStatement.setInt(4,carrinho.getQuantidade());
        } catch (SQLException ex) {
            Logger.getLogger(CarrinhoImplements.class.getName()).log(Level.SEVERE, "Erro ao Deletar o valor", ex);
        }             
    }

    @Override
    public Carrinho findIdForCarrinho(Integer id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM carrinho WHERE id = ?");
            prepareStatement.setInt(1,id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Carrinho carrinho = new Carrinho();
                carrinho.setId(resultSet.getInt("id"));
                carrinho.setProduto_id((Produto) resultSet.getObject("produto"));
                carrinho.setIngredienteEscolha_id((Ingrediente_Escolha) resultSet.getObject("ingredienteEscolha"));
                carrinho.setQuantidade(resultSet.getInt("quantidade"));
                return carrinho;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(CarrinhoImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por ID", ex);
        }
        return null;
    }

    @Override
    public Carrinho findProdutoForCarrinho(Produto produto_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM carrinho WHERE produto = ?");
            prepareStatement.setObject(2,produto_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Carrinho carrinho = new Carrinho();
                carrinho.setId(resultSet.getInt("id"));
                carrinho.setProduto_id((Produto) resultSet.getObject("produto"));
                carrinho.setIngredienteEscolha_id((Ingrediente_Escolha) resultSet.getObject("ingredienteEscolha"));
                carrinho.setQuantidade(resultSet.getInt("quantidade"));
                return carrinho;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(CarrinhoImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por Produto", ex);
        }
        return null;        
    }


    @Override
    public Carrinho findEscolhaForCarrinho(Ingrediente_Escolha ingredienteEscolha_id) {

        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM carrinho WHERE ingredienteEscolha = ?");
            prepareStatement.setObject(3,ingredienteEscolha_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Carrinho carrinho = new Carrinho();
                carrinho.setId(resultSet.getInt("id"));
                carrinho.setProduto_id((Produto) resultSet.getObject("produto"));
                carrinho.setIngredienteEscolha_id((Ingrediente_Escolha) resultSet.getObject("ingredienteEscolha"));
                carrinho.setQuantidade(resultSet.getInt("quantidade"));
                return carrinho;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(CarrinhoImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por Ingrediente Escolha", ex);
        }
        return null; 
    }
    @Override
    public Carrinho findQuantidadeForCarrinho(Integer qtnd_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM carrinho WHERE quantidade = ?");
            prepareStatement.setInt(4,qtnd_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Carrinho carrinho = new Carrinho();
                carrinho.setId(resultSet.getInt("id"));
                carrinho.setProduto_id((Produto) resultSet.getObject("produto"));
                carrinho.setIngredienteEscolha_id((Ingrediente_Escolha) resultSet.getObject("ingredienteEscolha"));
                carrinho.setQuantidade(resultSet.getInt("quantidade"));
                return carrinho;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(CarrinhoImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por Quantidade", ex);
        }
        return null;
    }

    @Override
    public List listar() throws SQLException{
        List<Carrinho> carrinhoList = new LinkedList<>();
        PreparedStatement prepareStatement;
        
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM carrinho");
            ResultSet resultSet = prepareStatement.getResultSet();
            
            while(resultSet.next()){
                Carrinho carrinho = new Carrinho();
                
                carrinho.setId(resultSet.getInt("id"));
                carrinho.setProduto_id((Produto) resultSet.getObject("produto"));
                carrinho.setIngredienteEscolha_id((Ingrediente_Escolha) resultSet.getObject("ingredienteEscolha"));
                carrinho.setQuantidade(resultSet.getInt("quantidade"));
                
                carrinhoList.add(carrinho);
            }            
        }catch(SQLException ex){
            Logger.getLogger(CarrinhoImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar", ex);                        
        }
        return carrinhoList;       
    }
    

}
