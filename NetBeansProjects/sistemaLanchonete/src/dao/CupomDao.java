
package dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import model.Cupom;
import model.Pagamento;

public interface CupomDao {
    //
    public void salvar(Cupom cupom)throws SQLException;
    public void editar(Cupom cupom)throws SQLException;
    public List listar() throws SQLException;
    public void delete(Cupom cupom)throws SQLException;
    //
    public Cupom findIdForCupom(Integer id);
    public Cupom findValorForCupom(Integer valor_id);
    public Cupom findCodForCupom(Integer cod_id);
    public Cupom findValidadeForCupom(Date validade_id);
    public Cupom findPagamentoForCupom(Pagamento pagamento_id);
}
