
package dao;

import model.Endereco;

public interface EnderecoDao {
    //
    public void salvar (EnderecoDao endereco);
    public void editar (EnderecoDao endereco);
    public void delete (EnderecoDao endereco);
    //
    public Endereco findIdForEndereco(Integer id);
    public Endereco findRuaForEndereco(String rua_id);
    public Endereco findCepForEndereco(String cep_id);
    public Endereco findBairroForEndereco(String bairro_id);
    public Endereco findDistanciaForEndereco(Integer distancia_id); 
}
