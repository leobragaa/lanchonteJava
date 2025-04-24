
package model;

public class Login {
    private String senha;
    private Funcionario funcionario;

    public Login(String senha, Funcionario funcionario) {
        this.senha = senha;
        this.funcionario = funcionario;
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
