
package implementsDao;

import conection.Conexao;
import dao.FuncionarioDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Funcionario;
import model.Login;
import model.Telefone;
import java.sql.PreparedStatement;

public class FuncionarioImplements implements FuncionarioDao{

    @Override
    public List listar() throws SQLException {
        List<Funcionario> funcionarioList = new LinkedList<>();
        PreparedStatement prepareStatement; 
        try{
            prepareStatement = Conexao.getConnection()
                    .prepareStatement(
                    "SELECT * FROM funcionario");
            ResultSet resultSet = prepareStatement.executeQuery();
            
            while(resultSet.next()){
                Funcionario funcionario = new Funcionario();

                funcionario.setId(resultSet.getInt("id"));
                funcionario.setNome(resultSet.getString("nome"));
                funcionario.setCpf(resultSet.getString("cpf"));
                funcionario.setRg(resultSet.getString("rg"));

                List<Telefone> telefones = new LinkedList<>();
                Telefone telefone = new Telefone();
                telefone.setId(resultSet.getInt("telefone"));
                telefones.add(telefone);
                funcionario.setTelefone(telefones);
                
                List<Login> logins = new LinkedList<>();
                Login login = new Login();
                login.setId(resultSet.getInt("login"));
                logins.add(login);
                funcionario.setLogins(logins);
                
                funcionarioList.add(funcionario);
            }
        }catch(SQLException ex){
            Logger.getLogger(FuncionarioImplements.class.getName()).log(Level.SEVERE, "Erro ao Listar Funcionario", ex);
        }
        
        return funcionarioList;   
    }

    @Override
    public void salvar(Funcionario funcionario) throws SQLException {
        PreparedStatement prepareFuncionario;
        PreparedStatement prepareTelefone;
        PreparedStatement prepareLogin;
            
        try{
            prepareFuncionario = Conexao.getConnection()
                .prepareStatement(
                "INSERT INTO funcionario (id, nome, cpf, rg) VALUES(?, ?, ?, ?)");
            prepareFuncionario.setInt(1,funcionario.getId());
            prepareFuncionario.setString(2,funcionario.getNome());
            prepareFuncionario.setString(3,funcionario.getCpf());
            prepareFuncionario.setString(4,funcionario.getRg());
            prepareFuncionario.executeUpdate();
            
            prepareTelefone = Conexao.getConnection()
                .prepareStatement(
                "INSERT INTO funcionario (id, numero, dd, cliente) VALUES(?, ?, ?, ?)");
            for (Telefone telefone : funcionario.getTelefone()) {
                prepareTelefone.setInt(1, funcionario.getId());
                prepareTelefone.setInt(2, telefone.getNumero());
                prepareTelefone.setInt(3, telefone.getDd());               
                prepareTelefone.setInt(4, telefone.getCliente_id().getId());
                
                prepareTelefone.executeUpdate();
            }
            
            //Listagem de Login Funccionario
            prepareLogin = Conexao.getConnection()
                .prepareStatement(
                   "INSERT INTO funcionario (id, senha) VALUES(?, ?)");
            for (Login login : funcionario.getLogins()) {
                prepareLogin.setInt(1, funcionario.getId());
           
                prepareLogin.setString(2, login.getSenha());
                
                prepareLogin.executeUpdate();
            }
            
        }catch (SQLException ex){
            Logger.getLogger(FuncionarioImplements.class.getName()).log(Level.SEVERE, "Erro ao Salvar Funcionario", ex);
        }      
    }

    @Override
    public void editar(Funcionario funcionario) throws SQLException {
        PreparedStatement prepareFuncionario;
        PreparedStatement prepareTelefone;
        PreparedStatement prepareLogin;
            
        try{
            prepareFuncionario = Conexao.getConnection()
                .prepareStatement(
                "UPDATE funcionario SET nome = ?, cpf = ?, rg = ? WHERE id = ?");
            prepareFuncionario.setInt(1,funcionario.getId());
            prepareFuncionario.setString(2,funcionario.getNome());
            prepareFuncionario.setString(3,funcionario.getCpf());
            prepareFuncionario.setString(4,funcionario.getRg());
            prepareFuncionario.executeUpdate();
            
            //Listagem do Telefone
            prepareTelefone = Conexao.getConnection()
                .prepareStatement(
                "UPDATE funcionario SET nome = ?, cpf = ?, rg = ? WHERE id = ?");
            for (Telefone telefone : funcionario.getTelefone()) {
                prepareTelefone.setInt(1, funcionario.getId());
                prepareTelefone.setInt(2, telefone.getNumero());
                prepareTelefone.setInt(3, telefone.getDd());
                
                prepareTelefone.setInt(4, telefone.getCliente_id().getId());
                
                prepareTelefone.executeUpdate();
            }
            
            //Listagem de Login Funccionario
            prepareLogin = Conexao.getConnection()
                .prepareStatement(
                "UPDATE funcionario SET nome = ?, cpf = ?, rg = ? WHERE id = ?");
            for (Login login : funcionario.getLogins()) {
                prepareLogin.setInt(1, funcionario.getId());
                prepareTelefone.setInt(2, login.getFuncionario().getId());
                
                prepareLogin.setString(3, login.getSenha());
                
                prepareLogin.executeUpdate();
            }
            
        }catch (SQLException ex){
            Logger.getLogger(FuncionarioImplements.class.getName()).log(Level.SEVERE, "Erro ao Editar Funcionario", ex);
        }     
    }

    @Override
    public void delete(Funcionario funcionario) throws SQLException {
        PreparedStatement prepareFuncionario;
        PreparedStatement prepareTelefone;
        PreparedStatement prepareLogin;
            
        try{
            prepareFuncionario = Conexao.getConnection()
                .prepareStatement(
                "DELETE FROM funcionario (id, nome, cpf, rg) VALUES(?, ?, ?, ?)");
            prepareFuncionario.setInt(1,funcionario.getId());
            prepareFuncionario.setString(2,funcionario.getNome());
            prepareFuncionario.setString(3,funcionario.getCpf());
            prepareFuncionario.setString(4,funcionario.getRg());
            prepareFuncionario.executeUpdate();
            
            prepareTelefone = Conexao.getConnection()
                .prepareStatement(
                "DELETE FROM funcionario (id, numero, dd, cliente) VALUES(?, ?, ?, ?)");
            for (Telefone telefone : funcionario.getTelefone()) {
                prepareTelefone.setInt(1, funcionario.getId());
                prepareTelefone.setInt(2, telefone.getNumero());
                prepareTelefone.setInt(3, telefone.getDd());
                
                prepareTelefone.setInt(4, telefone.getCliente_id().getId());
                
                prepareTelefone.executeUpdate();
            }
            
            //Listagem de Login Funccionario
            prepareLogin = Conexao.getConnection()
                .prepareStatement(
                   "DELETE FROM funcionario (id, senha) VALUES(?, ?)");
            for (Login login : funcionario.getLogins()) {
                prepareLogin.setInt(1, funcionario.getId());
                
                prepareLogin.setString(2, login.getSenha());
                
                prepareLogin.executeUpdate();
            }
            
        }catch (SQLException ex){
            Logger.getLogger(FuncionarioImplements.class.getName()).log(Level.SEVERE, "Erro ao Deletar Funcionario", ex);
        }     
    }

}
