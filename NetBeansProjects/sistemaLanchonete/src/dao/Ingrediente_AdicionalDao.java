
package dao;

import model.Ingrediente_Adicional;
import model.Ingrediente_Escolha;

public interface Ingrediente_AdicionalDao {
    //
    public void salvar(Ingrediente_AdicionalDao ingredienteAdd);
    public void editar(Ingrediente_AdicionalDao ingredienteAdd);
    public void delete(Ingrediente_AdicionalDao ingredienteAdd);
    //
    public Ingrediente_Adicional findIdForIngredienteAdd(Integer Id);
    public Ingrediente_Adicional findNomeForIngredienteAdd(String nome);
    public Ingrediente_Adicional findValorForIngredienteAdd(Double valor);
    public Ingrediente_Adicional findIngEscolhaForIngredienteAdd(Ingrediente_Escolha ingredienteEscolha_id);
    
}
