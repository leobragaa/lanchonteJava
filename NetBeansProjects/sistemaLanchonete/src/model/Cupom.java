
package model;

import java.util.Date;

public class Cupom {
    private Double valorCupom;
    private Integer codigo;
    private Date validade;

    public Cupom(Double valorCupom, Integer codigo, Date validade) {
        this.valorCupom = valorCupom;
        this.codigo = codigo;
        this.validade = validade;
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
    
    
}
