
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Endereco;

public interface EnderecoDao {
    //
    public void salvar (Endereco endereco) throws SQLException;
    public void editar (Endereco endereco) throws SQLException;
    public List listar () throws SQLException;
    public void delete (Endereco endereco) throws SQLException;
}
