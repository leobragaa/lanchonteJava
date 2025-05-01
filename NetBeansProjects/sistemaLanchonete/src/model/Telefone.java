package model;

public class Telefone {
    private int id;
    private int dd;
    private int numero;
    private Funcionario funcionario;
    private Cliente cliente_id;


    public Telefone(int id, int dd, int numero, Funcionario funcionario, Cliente cliente_id) {
        this.id = id;
        this.dd = dd;
        this.numero = numero;
        this.funcionario = funcionario;
        this.cliente_id = cliente_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Cliente cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
    
}
