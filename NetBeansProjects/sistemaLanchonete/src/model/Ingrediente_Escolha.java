
package model;

public class Ingrediente_Escolha {
    private Ingrediente_Escolha ingredienteEscolha_id;
    private Ingrediente_Remover ingredienteRemover_id;  

    public Ingrediente_Escolha(Ingrediente_Escolha ingredienteEscolha_id, Ingrediente_Remover ingredienteRemover_id) {
        this.ingredienteEscolha_id = ingredienteEscolha_id;
        this.ingredienteRemover_id = ingredienteRemover_id;
    }

    public Ingrediente_Escolha getIngredienteEscolha_id() {
        return ingredienteEscolha_id;
    }

    public void setIngredienteEscolha_id(Ingrediente_Escolha ingredienteEscolha_id) {
        this.ingredienteEscolha_id = ingredienteEscolha_id;
    }

    public Ingrediente_Remover getIngredienteRemover_id() {
        return ingredienteRemover_id;
    }

    public void setIngredienteRemover_id(Ingrediente_Remover ingredienteRemover_id) {
        this.ingredienteRemover_id = ingredienteRemover_id;
    }
    
}
