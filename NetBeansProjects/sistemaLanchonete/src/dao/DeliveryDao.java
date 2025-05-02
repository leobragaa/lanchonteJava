
package dao;

import java.util.List;
import model.Delivery;

public interface DeliveryDao {
    //
    public void salvar(Delivery delivery);
    public void editar(Delivery delivery);
    public List listar(Delivery delivery);
    public void delete(Delivery delivery);
    //
    public Delivery findIdForDelivery(Integer id);
    public Delivery findChaveEntregaForDelivery(Integer chaveEntrega_id);
    public Delivery findNumeroForDelivery(Integer numero_id);
    public Delivery findComplementoForDelivery(String complemento_id);
    public Delivery findEnderecoForDelivery(Integer endereco_id);
}
