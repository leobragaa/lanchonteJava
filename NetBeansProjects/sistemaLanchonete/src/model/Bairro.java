package model;

public class Bairro {
    private int id;
    private String bairro;

    public Bairro(int id, String bairro) {
        this.id = id;
        this.bairro = bairro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
}
