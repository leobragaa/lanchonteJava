package model;

public class Bairro {
    private Integer id;
    private String nome;
    private Endereco endereco_id;

    public Bairro(Integer id, String nome, Endereco endereco_id) {
        this.id = id;
        this.nome = nome;
        this.endereco_id = endereco_id;
    }

    public Bairro() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco_id;
    }

    public void setEndereco(Endereco endereco_id) {
        this.endereco_id = endereco_id;
    }
    
}
