
package dao;

import model.Delivery;

public interface DeliveryDao {
    //
    public void criarConexao();
    public void salvar(DeliveryDao delivery);
    public void editar(DeliveryDao delivery);
    public void delete(DeliveryDao delivery);
    //
    public Delivery findIdForDelivery(Integer id);
    public Delivery findChaveEntregaForDelivery(Integer chaveEntrega_id);
    public Delivery findNumeroForDelivery(Integer numero_id);
    public Delivery findComplementoForDelivery(String complemento_id);
    public Delivery findEnderecoForDelivery(Integer endereco_id);
}
