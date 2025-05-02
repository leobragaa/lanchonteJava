
package dao;

import model.Ingrediente_Adicional;
import model.Ingrediente_Escolha;
import model.Ingrediente_Remover;

public interface Ingrediente_EscolhaDao {
    //
    public void salvar(Ingrediente_EscolhaDao ingredienteEscolha);
    public void editar(Ingrediente_EscolhaDao ingredienteEscolha);
    public void delete(Ingrediente_EscolhaDao ingredienteEscolha);
    //
    public Ingrediente_Escolha findIdForIngredienteEscolha(Integer id);
    public Ingrediente_Escolha findIngAddForIngredienteEscolha(Ingrediente_Adicional ingredienteAdicional_id);
    public Ingrediente_Escolha findIngRemoveForIngredienteEscolha(Ingrediente_Remover ingredienteRemover_id);
}
