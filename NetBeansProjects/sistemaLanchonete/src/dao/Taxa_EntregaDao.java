
package dao;

import model.Endereco;
import model.Taxa_Entrega;

public interface Taxa_EntregaDao {
    //
    public void salvar(Taxa_EntregaDao taxaDaEntrega);
    public void editar(Taxa_EntregaDao taxaDaEntrega);
    public void delete(Taxa_EntregaDao taxaDaEntrega);
    //
    public Taxa_Entrega findtTaxaEntregaForId(Integer id);
    public Taxa_Entrega findtTaxaEntregaForTaxa(Double taxaEntrega);
    public Taxa_Entrega findtTaxaEntregaForEndereco(Endereco endereco_id);
    
}
