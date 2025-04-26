
package model;

import java.util.List;

public class Cliente {
    private String nome;
    private List <Telefone> telefone_id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Telefone> getTelefone_id() {
        return telefone_id;
    }

    public void setTelefone_id(List<Telefone> telefone_id) {
        this.telefone_id = telefone_id;
    }

    public Cliente(String nome, List telefone_id) {
        this.nome = nome;
        this.telefone_id = telefone_id;
    }
    
}
