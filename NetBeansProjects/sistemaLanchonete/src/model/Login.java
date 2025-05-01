
package model;

public class Login {
    private int id;
    private String senha;
    private Funcionario funcionario;

    public Login(int id, String senha, Funcionario funcionario) {
        this.id = id;
        this.senha = senha;
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
