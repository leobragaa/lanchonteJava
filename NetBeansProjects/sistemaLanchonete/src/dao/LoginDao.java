
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Funcionario;
import model.Login;

public interface LoginDao {
    //
    public void criarConexao();
    public void salvar (Login login)throws SQLException;
    public void editar (Login login)throws SQLException;
    public List listar ()throws SQLException;
    public void delete (Login login)throws SQLException;
    //
    public Login findIdorLogin(Integer id);
    public Login findSenhaForLogin(String senha_id);
    public Login findFuncionarioForLogin(Funcionario funcionario_id);
}
