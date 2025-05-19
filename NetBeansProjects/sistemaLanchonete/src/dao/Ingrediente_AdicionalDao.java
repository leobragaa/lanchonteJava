
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Ingrediente_Adicional;
import model.Ingrediente_Escolha;

public interface Ingrediente_AdicionalDao {
    //
    public void salvar(Ingrediente_Adicional ingredienteAdd)throws SQLException;
    public void editar(Ingrediente_Adicional ingredienteAdd)throws SQLException;
    public List listar()throws SQLException;
    public void delete(Ingrediente_Adicional ingredienteAdd)throws SQLException;
    //
    public Ingrediente_Adicional findIdForIngredienteAdd(Integer id);
    public Ingrediente_Adicional findNomeForIngredienteAdd(String nome_id);
    public Ingrediente_Adicional findValorForIngredienteAdd(Double valor_id);
    public Ingrediente_Adicional findIngEscolhaForIngredienteAdd(Ingrediente_Escolha ingredienteEscolha_id);
    
}
