
package model;

public class Cartao {
    private int id;
    private boolean tipoPagamento;
    private String numCartao;
    private Integer cvv;

    public Cartao(int id, boolean tipoPagamento, String numCartao, Integer cvv) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.numCartao = numCartao;
        this.cvv = cvv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
