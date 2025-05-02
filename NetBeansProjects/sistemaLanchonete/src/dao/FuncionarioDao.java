
package dao;

import model.Funcionario;
import model.Login;
import model.Telefone;

public interface FuncionarioDao {
    //
    public void salvar(FuncionarioDao funcionario);
    public void editar(FuncionarioDao funcionario);
    public void delete(FuncionarioDao funcionario);
    //
    public Funcionario findIdForFuncionario(Integer id);
    public Funcionario findNomeForFuncionario(String nome);
    public Funcionario findCpfForFuncionario(String cpf);
    public Funcionario findRgForFuncionario(String rg);
    public Funcionario findTelefoneForFuncionario(Telefone telefone);
    public Funcionario findLoginForFuncionario(Login logins);
}
