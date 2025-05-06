
package implementsDao;

import conection.Conexao;
import dao.TelefoneDao;
import model.Telefone;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelefoneImplements implements TelefoneDao{

    @Override
    public void salvar(Telefone telefone) throws SQLException{
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    " INSERT INTO telefone(id, dd, numero, funcionario, cliente) VALUES (?, ?, ?, ?, ?)");
            prepareStatement.setInt(1, telefone.getId());
            prepareStatement.setInt(2, telefone.getDd());
            prepareStatement.setInt(3, telefone.getNumero());
            prepareStatement.setString(4, telefone.getFuncionario());
            prepareStatement.setString(5, telefone.getCliente_id());
        }catch(SQLException ex){
            Logger.getLogger(TelefoneImplements.class.getName()).log(Level.SEVERE, "Erro ao Salvar os dados", ex);            
        }
    }

    @Override
    public void editar(Telefone telefone) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "UPDATE telefone SET dd = ?, numero = ?, funcionario = ?, cliente = ? WHERE id = ?");
            prepareStatement.setInt(1,telefone.getId());
            prepareStatement.setInt(2,telefone.getDd());
            prepareStatement.setInt(3,telefone.getNumero());
            prepareStatement.setString(4,telefone.getFuncionario());
            prepareStatement.setString(5,telefone.getCliente_id());
        }catch(SQLException ex){
            Logger.getLogger(TelefoneImplements.class.getName()).log(Level.SEVERE, "Erro ao Editar", ex);            
        }
    }

    @Override
    public void delete(Telefone telefone) {
        PreparedStatement prepareStatement;
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "DELETE FROM telefone(id, dd, numero, funcionario, cliente) VALUES(?, ?, ?, ? , ?)");
            prepareStatement.setInt(1, telefone.getId());
            prepareStatement.setInt(2, telefone.getDd());
            prepareStatement.setInt(3, telefone.getNumero());
            prepareStatement.setString(4, telefone.getFuncionario());
            prepareStatement.setString(5, telefone.getCliente_id());
        }catch(SQLException ex){
            Logger.getLogger(TelefoneImplements.class.getName()).log(Level.SEVERE, "Erro ao Deletar", ex);            
        }
    }
    @Override
    public List listar () throws SQLException{
        List<Telefone> telefoneList = new LinkedList<>();
        PreparedStatement prepareStatement;
        
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM telefone");
            ResultSet resultSet = prepareStatement.getResultSet();
            
            while(resultSet.next()){
                Telefone telefone = new Telefone();
                
                telefone.setId(resultSet.getInt("id"));
                telefone.setDd(resultSet.getInt("dd"));
                telefone.setNumero(resultSet.getInt("numero"));
                telefone.setFuncionario(resultSet.getString("funcionario"));
                telefone.setCliente_id(resultSet.getString("cliente"));
                
                telefoneList.add(telefone);
            }            
        }catch(SQLException ex){
            Logger.getLogger(TelefoneImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar", ex);                        
        }
        return telefoneList;
    }
    
    @Override
    public Telefone findTelefoneForId(Integer id) {
        try {
        PreparedStatement prepareStatement = Conexao.getConnection()
            .prepareStatement("SELECT * FROM telefone WHERE id = ?");
        prepareStatement.setInt(1, id);
        ResultSet resultSet = prepareStatement.getResultSet();

        if (resultSet.next()) {
            Telefone telefone = new Telefone();
            telefone.setId(resultSet.getInt("id"));
            telefone.setDd(resultSet.getInt("dd"));
            telefone.setNumero(resultSet.getInt("numero"));
            telefone.setFuncionario(resultSet.getString("funcionario"));
            telefone.setCliente_id(resultSet.getString("cliente"));
            return telefone;
        }
    } catch (SQLException ex) {
        Logger.getLogger(TelefoneImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar telefone por ID", ex);
    }
        return null;
    }

    @Override
    public Telefone findTelefoneForDd(Integer dd_id) {
        try {
        PreparedStatement prepareStatement = Conexao.getConnection()
            .prepareStatement("SELECT * FROM telefone WHERE dd = ?");
        prepareStatement.setInt(2, dd_id);
        ResultSet resultSet = prepareStatement.getResultSet();

        if (resultSet.next()) {
            Telefone telefone = new Telefone();
            telefone.setId(resultSet.getInt("id"));
            telefone.setDd(resultSet.getInt("dd"));
            telefone.setNumero(resultSet.getInt("numero"));
            telefone.setFuncionario(resultSet.getString("funcionario"));
            telefone.setCliente_id(resultSet.getString("cliente"));
            return telefone;
        }
    } catch (SQLException ex) {
        Logger.getLogger(TelefoneImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar telefone por dd", ex);
    }
        return null;
    }

    @Override
    public Telefone findTelefoneForNumero(Integer numero_id) {
                try {
        PreparedStatement prepareStatement = Conexao.getConnection()
            .prepareStatement("SELECT * FROM telefone WHERE numero = ?");
        prepareStatement.setInt(3, numero_id);
        ResultSet resultSet = prepareStatement.getResultSet();

        if (resultSet.next()) {
            Telefone telefone = new Telefone();
            telefone.setId(resultSet.getInt("id"));
            telefone.setDd(resultSet.getInt("dd"));
            telefone.setNumero(resultSet.getInt("numero"));
            telefone.setFuncionario(resultSet.getString("funcionario"));
            telefone.setCliente_id(resultSet.getString("cliente"));
            return telefone;
        }
    } catch (SQLException ex) {
        Logger.getLogger(TelefoneImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar telefone por Numero", ex);
    }
        return null;
    }

    @Override
    public Telefone findTelefoneForFuncionario(String funcionario_id) {
        try {
            PreparedStatement prepareStatement = Conexao.getConnection()
                .prepareStatement("SELECT * FROM telefone WHERE funcionario = ?");
            prepareStatement.setInt(4, funcionario_id);
            ResultSet resultSet = prepareStatement.getResultSet();

        if (resultSet.next()) {
            Telefone telefone = new Telefone();
            telefone.setId(resultSet.getInt("id"));
            telefone.setDd(resultSet.getInt("dd"));
            telefone.setNumero(resultSet.getInt("numero"));
            telefone.setFuncionario(resultSet.getString("funcionario"));
            telefone.setCliente_id(resultSet.getString("cliente"));
            return telefone;
        }
    } catch (SQLException ex) {
        Logger.getLogger(TelefoneImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar telefone por Funcionario", ex);
    }
        return null;
    }

    @Override
    public Telefone findTelefoneForCliente(String cliente_id) {
    }

    
}
