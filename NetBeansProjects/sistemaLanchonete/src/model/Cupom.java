
package model;

import java.util.Date;

public class Cupom {
    private int id;
    private Double valorCupom;
    private Integer codigo;
    private Date validade;

    public Cupom(int id, Double valorCupom, Integer codigo, Date validade) {
        this.id = id;
        this.valorCupom = valorCupom;
        this.codigo = codigo;
        this.validade = validade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    
    
}
