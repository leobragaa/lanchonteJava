
package model;

import java.util.List;

public class Ingrediente_Escolha {
    private Integer id;
    private List<Ingrediente_Adicional> ingredienteAdicional_id;
    private List<Ingrediente_Remover> ingredienteRemover_id;  

    public Ingrediente_Escolha(Integer id, List<Ingrediente_Adicional> ingredienteAdicional_id, List<Ingrediente_Remover> ingredienteRemover_id) {
        this.id = id;
        this.ingredienteAdicional_id = ingredienteAdicional_id;
        this.ingredienteRemover_id = ingredienteRemover_id;
    }
    public Ingrediente_Escolha(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Ingrediente_Adicional> getIngredienteAdicional_id() {
        return ingredienteAdicional_id;
    }

    public void setIngredienteAdicional_id(List<Ingrediente_Adicional> ingredienteAdicional_id) {
        this.ingredienteAdicional_id = ingredienteAdicional_id;
    }

    public List<Ingrediente_Remover> getIngredienteRemover_id() {
        return ingredienteRemover_id;
    }

    public void setIngredienteRemover_id(List<Ingrediente_Remover> ingredienteRemover_id) {
        this.ingredienteRemover_id = ingredienteRemover_id;
    }
    
}
