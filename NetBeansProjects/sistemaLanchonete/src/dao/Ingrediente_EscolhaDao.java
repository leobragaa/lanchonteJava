
package dao;

import java.util.List;
import model.Ingrediente_Escolha;

public interface Ingrediente_EscolhaDao {
    //
    public void salvar(Ingrediente_Escolha ingredienteEscolha);
    public void editar(Ingrediente_Escolha ingredienteEscolha);
    public List listar(Ingrediente_Escolha ingredienteEscolha);
    public void delete(Ingrediente_Escolha ingredienteEscolha);
    //
    public Ingrediente_Escolha findIdForIngredienteEscolha(Integer id);
    public Ingrediente_Escolha findIngAddForIngredienteEscolha(Integer ingredienteAdicional_id);
    public Ingrediente_Escolha findIngRemoveForIngredienteEscolha(Integer ingredienteRemover_id);
}
