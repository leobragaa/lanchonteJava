
package dao;

import java.util.List;
import model.Taxa_Entrega;

public interface Taxa_EntregaDao {
    //
    public void salvar(Taxa_Entrega taxaDaEntrega);
    public void editar(Taxa_Entrega taxaDaEntrega);
    public List listar(Taxa_Entrega taxaDaEntrega);
    public void delete(Taxa_Entrega taxaDaEntrega);
    //
    public Taxa_Entrega findtTaxaEntregaForId(Integer id);
    public Taxa_Entrega findtTaxaEntregaForTaxa(Integer taxaEntrega_id);
    public Taxa_Entrega findtTaxaEntregaForEndereco(Integer endereco_id);
    
}
