
package model;

public class Login {
    private Integer id;
    private String senha;
    private Funcionario funcionario;

    public Login(Integer id, String senha, Funcionario funcionario) {
        this.id = id;
        this.senha = senha;
        this.funcionario = funcionario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
}
