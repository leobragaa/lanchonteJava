
package model;

public class Met_Pagamento {
    private String pix;
    private Dinheiro dinheiro_id;
    private Cartao cartao_id;

    public Met_Pagamento(String pix, Dinheiro dinheiro_id, Cartao cartao_id) {
        this.pix = pix;
        this.dinheiro_id = dinheiro_id;
        this.cartao_id = cartao_id;
    }

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    public Dinheiro getDinheiro_id() {
        return dinheiro_id;
    }

    public void setDinheiro_id(Dinheiro dinheiro_id) {
        this.dinheiro_id = dinheiro_id;
    }

    public Cartao getCartao_id() {
        return cartao_id;
    }

    public void setCartao_id(Cartao cartao_id) {
        this.cartao_id = cartao_id;
    }
    
    
}
