
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Funcionario;
import model.Login;
import model.Telefone;

public interface FuncionarioDao {
    //
    public void salvar(Funcionario funcionario)throws SQLException;
    public void editar(Funcionario funcionario)throws SQLException;
    public List listar()throws SQLException;
    public void delete(Funcionario funcionario)throws SQLException;
    //
    public Funcionario findIdForFuncionario(Integer id);
    public Funcionario findNomeForFuncionario(String nome_id);
    public Funcionario findCpfForFuncionario(String cpf_id);
    public Funcionario findRgForFuncionario(String rg_id);
    public List<Funcionario> findTelefoneForFuncionario(List<Telefone> telefone_id);
    public List<Funcionario> findLoginForFuncionario(List<Login> login_id);
}
