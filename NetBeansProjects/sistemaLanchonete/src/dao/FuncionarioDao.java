
package dao;

import model.Funcionario;
import model.Login;

public interface FuncionarioDao {
    //
    public void salvar(Funcionario funcionario);
    public void editar(Funcionario funcionario);
    public void delete(Funcionario funcionario);
    //
    public Funcionario findIdForFuncionario(Integer id);
    public Funcionario findNomeForFuncionario(String nome_id);
    public Funcionario findCpfForFuncionario(String cpf_id);
    public Funcionario findRgForFuncionario(String rg_id);
    public Funcionario findTelefoneForFuncionario(Integer telefone_id);
    public Funcionario findLoginForFuncionario(Integer login_id);
}
