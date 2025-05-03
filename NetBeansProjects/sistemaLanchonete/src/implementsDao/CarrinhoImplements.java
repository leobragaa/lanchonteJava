
package implementsDao;

import conection.Conexao;
import dao.CarrinhoDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Carrinho;


public class CarrinhoImplements implements CarrinhoDao{

    @Override
    public void salvar(Carrinho carrinho) throws SQLException {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    " INSERT INTO carrinho (id, produto, ingredienteEscolha, quantidade) VALUES (?, ?, ?, ?, ?)");
            prepareStatement.setInt(1,carrinho.getId());
            prepareStatement.setString(2, carrinho.getProduto_id());
            prepareStatement.setInt(3, carrinho.getIngredienteEscolha());
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
            prepareStatement.setString(2,carrinho.getProduto_id());
            prepareStatement.setInt(3,carrinho.getIngredienteEscolha());
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
                    "UPDATE carrinho SET (id, produto, ingredienteEscolha, quantidade) VALUES (?, ?, ?, ?, ?)");
            prepareStatement.setInt(1,carrinho.getId());
            prepareStatement.setString(2,carrinho.getProduto_id());
            prepareStatement.setInt(3,carrinho.getIngredienteEscolha());
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
                carrinho.setProduto_id(resultSet.getString("produto"));
                carrinho.setIngredienteEscolha(resultSet.getInt("ingredienteEscolha"));
                carrinho.setQuantidade(resultSet.getInt("quantidade"));
                return carrinho;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(CarrinhoImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por ID", ex);
        }
        return null;
    }

    @Override
    public Carrinho findProdutoForCarrinho(String produto_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM carrinho WHERE produto = ?");
            prepareStatement.setString(2,produto_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Carrinho carrinho = new Carrinho();
                carrinho.setId(resultSet.getInt("id"));
                carrinho.setProduto_id(resultSet.getString("produto"));
                carrinho.setIngredienteEscolha(resultSet.getInt("ingredienteEscolha"));
                carrinho.setQuantidade(resultSet.getInt("quantidade"));
                return carrinho;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(CarrinhoImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por Produto", ex);
        }
        return null;        
    }

    @Override
    public Carrinho findEscolhaForCarrinho(Integer carrinho_id) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement("SELECT * FROM carrinho WHERE ingredienteEscolha = ?");
            prepareStatement.setInt(3,carrinho_id);
            
            ResultSet resultSet = prepareStatement.getResultSet();
            
            if(resultSet.next()){
                Carrinho carrinho = new Carrinho();
                carrinho.setId(resultSet.getInt("id"));
                carrinho.setProduto_id(resultSet.getString("produto"));
                carrinho.setIngredienteEscolha(resultSet.getInt("ingredienteEscolha"));
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
                carrinho.setProduto_id(resultSet.getString("produto"));
                carrinho.setIngredienteEscolha(resultSet.getInt("ingredienteEscolha"));
                carrinho.setQuantidade(resultSet.getInt("quantidade"));
                return carrinho;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(BairroImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar por Quantidade", ex);
        }
        return null;
    }

    @Override
    public List listar(Carrinho carrinho) throws SQLException{
        List<Carrinho> carrinhoList = new LinkedList<>();
        PreparedStatement prepareStatement;
        
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM carrinho");
            ResultSet resultSet = prepareStatement.getResultSet();
            
            while(resultSet.next()){
                Carrinho carrinho = new Carrinho();
                
                carrinho.setId(resultSet.setInt("id"));
                carrinho.setProduto_id(resultSet.setString("produto"));
                carrinho.setIngredienteEscolha(resultSet.setInt("ingredienteEscolha"));
                carrinho.setQuantidade(resultSet.setInt("quantidade"));
                
                carrinhoList.add(carrinho);
            }            
        }catch(SQLException ex){
            Logger.getLogger(CarrinhoImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar", ex);                        
        }
        return carrinhoList;       
    }

}
