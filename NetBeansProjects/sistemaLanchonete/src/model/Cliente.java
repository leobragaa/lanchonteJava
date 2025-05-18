
package model;

import java.util.List;

public class Cliente {
    private Integer id;
    private String nome;
    private List <Telefone> telefone_id;
    private List <Pedido> pedido_id;

    public Cliente(Integer id, String nome, List<Telefone> telefone_id, List<Pedido> pedido_id) {
        this.id = id;
        this.nome = nome;
        this.telefone_id = telefone_id;
        this.pedido_id = pedido_id;
    }

    public Cliente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Telefone> getTelefone_id() {
        return telefone_id;
    }

    public void setTelefone_id(List<Telefone> telefone_id) {
        this.telefone_id = telefone_id;
    }

    public List<Pedido> getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(List<Pedido> pedido_id) {
        this.pedido_id = pedido_id;
    }

}
