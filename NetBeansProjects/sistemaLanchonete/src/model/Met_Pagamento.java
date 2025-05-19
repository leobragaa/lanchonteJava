
package model;

import java.util.List;

public class Met_Pagamento {
    private Integer id;
    private Double pix;
    private List<Dinheiro> dinheiro_id;
    private List<Cartao> cartao_id;

    public Met_Pagamento(Integer id, Double pix, List<Dinheiro> dinheiro_id, List<Cartao> cartao_id) {
        this.id = id;
        this.pix = pix;
        this.dinheiro_id = dinheiro_id;
        this.cartao_id = cartao_id;
    }

    public Met_Pagamento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPix() {
        return pix;
    }

    public void setPix(Double pix) {
        this.pix = pix;
    }

    public List<Dinheiro> getDinheiro_id() {
        return dinheiro_id;
    }

    public void setDinheiro_id(List<Dinheiro> dinheiro_id) {
        this.dinheiro_id = dinheiro_id;
    }

    public List<Cartao> getCartao_id() {
        return cartao_id;
    }

    public void setCartao_id(List<Cartao> cartao_id) {
        this.cartao_id = cartao_id;
    }

}
