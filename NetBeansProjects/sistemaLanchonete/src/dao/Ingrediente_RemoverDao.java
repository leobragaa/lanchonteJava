
package dao;

import model.Ingrediente_Remover;

public interface Ingrediente_RemoverDao {
    //
    public void salvar(Ingrediente_Remover ingredienteRemove);
    public void editar(Ingrediente_Remover ingredienteRemove);
    public void delete(Ingrediente_Remover ingredienteRemove);
    //
    public Ingrediente_Remover findIdForIngredienteRemove(Integer id);
    public Ingrediente_Remover findNomeForIngredienteRemove(String nome_id);
    public Ingrediente_Remover findNomeForIngredienteEscolha(String ingredienteEscolha_id);
}
