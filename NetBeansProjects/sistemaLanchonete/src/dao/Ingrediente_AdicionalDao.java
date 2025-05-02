
package dao;

import model.Ingrediente_Adicional;

public interface Ingrediente_AdicionalDao {
    //
    public void salvar(Ingrediente_Adicional ingredienteAdd);
    public void editar(Ingrediente_Adicional ingredienteAdd);
    public void delete(Ingrediente_Adicional ingredienteAdd);
    //
    public Ingrediente_Adicional findIdForIngredienteAdd(Integer id);
    public Ingrediente_Adicional findNomeForIngredienteAdd(String nome_id);
    public Ingrediente_Adicional findValorForIngredienteAdd(Double valor_id);
    public Ingrediente_Adicional findIngEscolhaForIngredienteAdd(String ingredienteEscolha_id);
    
}
