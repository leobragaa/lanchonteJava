
package dao;

import model.Ingrediente_Escolha;
import model.Ingrediente_Remover;

public interface Ingrediente_RemoverDao {
    //
    public void salvar(Ingrediente_RemoverDao ingredienteRemove);
    public void editar(Ingrediente_RemoverDao ingredienteRemove);
    public void delete(Ingrediente_RemoverDao ingredienteRemove);
    //
    public Ingrediente_Remover findIdForIngredienteRemove(Integer id);
    public Ingrediente_Remover findNomeForIngredienteRemove(String nome);
    public Ingrediente_Remover findNomeForIngredienteRemove(Ingrediente_Escolha ingredienteEscolha);
}
