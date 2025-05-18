
package model;

public class Ingrediente_Adicional {
    private Integer id;
    private String nome;
    private Double valor;
    private Ingrediente_Escolha ingredienteEscolha_id;

    public Ingrediente_Adicional(Integer id, String nome, Double valor, Ingrediente_Escolha ingredienteEscolha_id) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.ingredienteEscolha_id = ingredienteEscolha_id;
    }
    public Ingrediente_Adicional(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Ingrediente_Escolha getIngredienteEscolha_id() {
        return ingredienteEscolha_id;
    }

    public void setIngredienteEscolha_id(Ingrediente_Escolha ingredienteEscolha_id) {
        this.ingredienteEscolha_id = ingredienteEscolha_id;
    }
    
    
}
