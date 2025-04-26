
package model;

import java.util.List;

public class Funcionario {
    
    private String nome;
    private String cpf;
    private String rg;
    private Telefone telefone;         
    private List<Login>logins;

    public Funcionario(String nome, String cpf, String rg, Telefone telefone, List<Login> logins) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.logins = logins;
    }
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public List<Login> getLogins() {
        return logins;
    }

    public void setLogins(List<Login> logins) {
        this.logins = logins;
    }
    
    
}
