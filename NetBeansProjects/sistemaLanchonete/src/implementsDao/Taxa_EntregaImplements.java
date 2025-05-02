
package implementsDao;

import dao.Taxa_EntregaDao;
import model.Taxa_Entrega;

public class Taxa_EntregaImplements implements Taxa_EntregaDao{

    @Override
    public void salvar(Taxa_Entrega taxaDaEntrega) {
    }

    @Override
    public void editar(Taxa_Entrega taxaDaEntrega) {
    }

    @Override
    public void delete(Taxa_Entrega taxaDaEntrega) {
    }

    @Override
    public Taxa_Entrega findtTaxaEntregaForId(Integer id) {
        return null;
    }

    @Override
    public Taxa_Entrega findtTaxaEntregaForTaxa(Integer taxaEntrega_id) {
        return null;
    }

    @Override
    public Taxa_Entrega findtTaxaEntregaForEndereco(Integer endereco_id) {
        return null;
    }

}
