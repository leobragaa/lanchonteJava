
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Ingrediente_Adicional;
import model.Ingrediente_Escolha;
import model.Ingrediente_Remover;

public interface Ingrediente_EscolhaDao {
    //
    public void salvar(Ingrediente_Escolha ingredienteEscolha)throws SQLException;
    public void editar(Ingrediente_Escolha ingredienteEscolha)throws SQLException;
    public List listar()throws SQLException;
    public void delete(Ingrediente_Escolha ingredienteEscolha)throws SQLException;
    //
    public Ingrediente_Escolha findIdForIngredienteEscolha(Integer id);
    public Ingrediente_Escolha findIngAddForIngredienteEscolha(Integer ingredienteAdicional_id);
    public Ingrediente_Escolha findIngRemoveForIngredienteEscolha(List<Ingrediente_Remover> ingredienteRemover_id);
    public Ingrediente_Escolha findIngAdicionalForIngredienteEscolha(List<Ingrediente_Adicional> ingredienteAdicional_id);
}
