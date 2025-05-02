
package dao;

import model.Funcionario;
import model.Login;

public interface LoginDao {
    //
    public void salvar (LoginDao login);
    public void editar (LoginDao login);
    public void delete (LoginDao login);
    //
    public Login findIdorLogin(Integer id);
    public Login findSenhaForLogin(String senha);
    public Login findFuncionarioForLogin(Funcionario funcionario);
}
