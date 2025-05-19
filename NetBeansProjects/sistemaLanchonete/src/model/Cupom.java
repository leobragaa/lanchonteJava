
package model;

import java.util.Date;

public class Cupom {
    private Integer id;
    private Double valorCupom;
    private Integer codigo;
    private Date validade;
    private Pagamento pagamento_id;

    public Cupom(Integer id, Double valorCupom, Integer codigo, Date validade, Pagamento pagamento) {
        this.id = id;
        this.valorCupom = valorCupom;
        this.codigo = codigo;
        this.validade = validade;
        this.pagamento_id = pagamento_id;
    }

    public Cupom() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValorCupom() {
        return valorCupom;
    }

    public void setValorCupom(Double valorCupom) {
        this.valorCupom = valorCupom;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public Pagamento getPagamento() {
        return pagamento_id;
    }

    public void setPagamento(Pagamento pagamento_id) {
        this.pagamento_id = pagamento_id;
    }

}
