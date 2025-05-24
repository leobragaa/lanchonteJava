
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Ingrediente_Escolha;

public interface Ingrediente_EscolhaDao {
    //
    public void salvar(Ingrediente_Escolha ingredienteEscolha)throws SQLException;
    public void editar(Ingrediente_Escolha ingredienteEscolha)throws SQLException;
    public List listar()throws SQLException;
    public void delete(Ingrediente_Escolha ingredienteEscolha)throws SQLException;
}
