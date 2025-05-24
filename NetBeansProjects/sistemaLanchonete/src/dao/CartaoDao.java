
package dao;
import java.sql.SQLException;
import java.util.List;
import model.Cartao;
import model.Met_Pagamento;

public interface CartaoDao {
    //
    public void salvar(Cartao cartao) throws SQLException;
    public void editar(Cartao cartao) throws SQLException;
    public List listar() throws SQLException;
    public void delete(Cartao cartao) throws SQLException;

}
