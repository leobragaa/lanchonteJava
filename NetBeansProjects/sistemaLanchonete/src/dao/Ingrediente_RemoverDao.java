
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Ingrediente_Escolha;
import model.Ingrediente_Remover;

public interface Ingrediente_RemoverDao {
    //
    public void salvar(Ingrediente_Remover ingredienteRemove)throws SQLException;
    public void editar(Ingrediente_Remover ingredienteRemove)throws SQLException;
    public List listar()throws SQLException;
    public void delete(Ingrediente_Remover ingredienteRemove)throws SQLException;
    //
    public Ingrediente_Remover findIdForIngredienteRemove(Integer id);
    public Ingrediente_Remover findNomeForIngredienteRemove(String nome_id);
    public Ingrediente_Remover findEscolhaForIngredienteRemove(Ingrediente_Escolha ingredienteEscolha_id);
}
