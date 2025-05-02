
package model;

public class Ingrediente_Escolha {
    private Integer id;
    private Ingrediente_Adicional ingredienteAdicional_id;
    private Ingrediente_Remover ingredienteRemover_id;  

    public Ingrediente_Escolha(Integer id, Ingrediente_Adicional ingredienteAdicional_id, Ingrediente_Remover ingredienteRemover_id) {
        this.id = id;
        this.ingredienteAdicional_id = ingredienteAdicional_id;
        this.ingredienteRemover_id = ingredienteRemover_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ingrediente_Adicional getIngredienteAdicional_id() {
        return ingredienteAdicional_id;
    }

    public void setIngredienteAdicional_id(Ingrediente_Adicional ingredienteAdicional_id) {
        this.ingredienteAdicional_id = ingredienteAdicional_id;
    }

    public Ingrediente_Remover getIngredienteRemover_id() {
        return ingredienteRemover_id;
    }

    public void setIngredienteRemover_id(Ingrediente_Remover ingredienteRemover_id) {
        this.ingredienteRemover_id = ingredienteRemover_id;
    }
    
}
