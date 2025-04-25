
package model;

public class Cartao {
    private boolean tipoPagamento;
    private String numCartao;
    private Integer cvv;

    public Cartao(boolean tipoPagamento, String numCartao, Integer cvv) {
        this.tipoPagamento = tipoPagamento;
        this.numCartao = numCartao;
        this.cvv = cvv;
    }

    public boolean isTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(boolean tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }
    
}
