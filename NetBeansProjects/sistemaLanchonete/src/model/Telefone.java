package model;

public class Telefone {
    private Integer id;
    private Integer dd;
    private Integer numero;
    private Funcionario funcionario;
    private Cliente cliente_id;


    public Telefone(Integer id, Integer dd, Integer numero, Funcionario funcionario, Cliente cliente_id) {
        this.id = id;
        this.dd = dd;
        this.numero = numero;
        this.funcionario = funcionario;
        this.cliente_id = cliente_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Cliente cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Integer getDd() {
        return dd;
    }

    public void setDd(Integer dd) {
        this.dd = dd;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
    
}
