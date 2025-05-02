
package dao;

import java.util.Date;
import model.Cupom;

public interface CupomDao {
    //
    public void salvar(CupomDao cupom);
    public void editar(CupomDao cupom);
    public void delete(CupomDao cupom);
    //
    public Cupom findIdForCupom(Integer id);
    public Cupom findValorForCupom(Double valorCupom);
    public Cupom findCodForCupom(Integer codigo);
    public Cupom findValidadeForCupom(Date validade);
}
