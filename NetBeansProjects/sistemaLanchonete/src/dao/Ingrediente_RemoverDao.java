
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Ingrediente_Remover;

public interface Ingrediente_RemoverDao {
    //
    public void salvar(Ingrediente_Remover ingredienteRemove)throws SQLException;
    public void editar(Ingrediente_Remover ingredienteRemove)throws SQLException;
    public List listar()throws SQLException;
    public void delete(Ingrediente_Remover ingredienteRemove)throws SQLException;
}
