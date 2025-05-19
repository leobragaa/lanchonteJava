
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Delivery;
import model.Endereco;
import model.Entrega;

public interface DeliveryDao {
    //
    public void salvar(Delivery delivery)throws SQLException;
    public void editar(Delivery delivery)throws SQLException;
    public List listar() throws SQLException;
    public void delete(Delivery delivery)throws SQLException;
    //
    public Delivery findIdForDelivery(Integer id);
    public Delivery findChaveEntregaForDelivery(Integer chaveEntrega_id);
    public Delivery findNumeroForDelivery(Integer numero_id);
    public Delivery findComplementoForDelivery(String complemento_id);
    public Delivery findEnderecoForDelivery(Endereco endereco_id);
    public Delivery findEntregaForDelivery(Entrega entrega_id);
}
