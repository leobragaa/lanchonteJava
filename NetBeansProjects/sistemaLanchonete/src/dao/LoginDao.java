
package dao;

import model.Login;

public interface LoginDao {
    //
    public void criarConexao();
    public void salvar (Login login);
    public void editar (Login login);
    public void delete (Login login);
    //
    public Login findIdorLogin(Integer id);
    public Login findSenhaForLogin(String senha_id);
    public Login findFuncionarioForLogin(Integer funcionario_id);
}
