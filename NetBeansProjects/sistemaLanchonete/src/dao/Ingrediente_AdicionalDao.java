
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Ingrediente_Adicional;

public interface Ingrediente_AdicionalDao {
    //
    public void salvar(Ingrediente_Adicional ingredienteAdd)throws SQLException;
    public void editar(Ingrediente_Adicional ingredienteAdd)throws SQLException;
    public List listar()throws SQLException;
    public void delete(Ingrediente_Adicional ingredienteAdd)throws SQLException;

    
}
