
package dao;

import java.util.Date;
import model.Cupom;

public interface CupomDao {
    //
    public void salvar(Cupom cupom);
    public void editar(Cupom cupom);
    public void delete(Cupom cupom);
    //
    public Cupom findIdForCupom(Integer id);
    public Cupom findValorForCupom(Integer valor_id);
    public Cupom findCodForCupom(Integer cod_id);
    public Cupom findValidadeForCupom(Date validade_id);
}
