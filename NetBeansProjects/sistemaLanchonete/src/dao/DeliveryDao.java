
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Delivery;

public interface DeliveryDao {
    //
    public void salvar(Delivery delivery)throws SQLException;
    public void editar(Delivery delivery);
    public List listar() throws SQLException;
    public void delete(Delivery delivery);
    //
    public Delivery findIdForDelivery(Integer id);
    public Delivery findChaveEntregaForDelivery(Integer chaveEntrega_id);
    public Delivery findNumeroForDelivery(Integer numero_id);
    public Delivery findComplementoForDelivery(String complemento_id);
    public Delivery findEnderecoForDelivery(String endereco_id);
}
