
package dao;

import model.Delivery;
import model.Endereco;

public interface DeliveryDao {
    //
    public void salvar(DeliveryDao delivery);
    public void editar(DeliveryDao delivery);
    public void delete(DeliveryDao delivery);
    //
    public Delivery findIdForDelivery(Integer id);
    public Delivery findChaveEntregaForDelivery(Integer chaveEntrega);
    public Delivery findNumeroForDelivery(Integer numero);
    public Delivery findComplementoForDelivery(String complemento);
    public Delivery findEnderecoForDelivery(Endereco endereco_id);
}
