
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Endereco;
import model.Taxa_Entrega;

public interface Taxa_EntregaDao {
    //
    public void salvar(Taxa_Entrega taxaDaEntrega) throws SQLException;
    public void editar(Taxa_Entrega taxaDaEntrega) throws SQLException;
    public List listar() throws SQLException;
    public void delete(Taxa_Entrega taxaDaEntrega) throws SQLException;
    //
    public Taxa_Entrega findtTaxaEntregaForId(Integer id);
    public Taxa_Entrega findtTaxaEntregaForTaxa(Double taxaEntrega_id);
    public Taxa_Entrega findtTaxaEntregaForEndereco(Endereco endereco_id);
    
}
