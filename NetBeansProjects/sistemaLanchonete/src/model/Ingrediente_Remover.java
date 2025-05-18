
package model;

public class Ingrediente_Remover {
    private Integer id;
    private String nome;
    private Ingrediente_Escolha ingredienteEscolha_id;

    public Ingrediente_Remover(Integer id, String nome, Ingrediente_Escolha ingredienteEscolha_id) {
        this.id = id;
        this.nome = nome;
        this.ingredienteEscolha_id = ingredienteEscolha_id;
    }
    public Ingrediente_Remover(){
        
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

    public Ingrediente_Escolha getIngredienteEscolha_id() {
        return ingredienteEscolha_id;
    }

    public void setIngredienteEscolha_id(Ingrediente_Escolha ingredienteEscolha_id) {
        this.ingredienteEscolha_id = ingredienteEscolha_id;
    }
    
}
