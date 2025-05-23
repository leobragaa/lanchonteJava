
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Bairro;
import model.Delivery;
import model.Endereco;
import model.Taxa_Entrega;

public interface EnderecoDao {
    //
    public void salvar (Endereco endereco) throws SQLException;
    public void editar (Endereco endereco) throws SQLException;
    public List listar () throws SQLException;
    public void delete (Endereco endereco) throws SQLException;
    //
    public Endereco findIdForEndereco(Integer id);
    public Endereco findRuaForEndereco(String rua_id);
    public Endereco findCepForEndereco(String cep_id);
    public Endereco findBairroForEndereco(Bairro bairro_id);
    public Endereco findDistanciaForEndereco(Double distancia_id); 
    public Endereco findDeliveryForEndereco(Delivery delivery_id); 
    public Endereco findTaxaEntregaForEndereco(Taxa_Entrega taxaEntrega_id); 
}
