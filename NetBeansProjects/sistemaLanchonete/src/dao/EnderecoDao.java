
package dao;

import model.Bairro;
import model.Endereco;

public interface EnderecoDao {
       //
    public void salvar (EnderecoDao endereco);
    public void editar (EnderecoDao endereco);
    public void delete (EnderecoDao endereco);
    //
    public Endereco findIdForEndereco(Integer id);
    public Endereco findRuaForEndereco(String rua);
    public Endereco findCepForEndereco(String cep);
    public Endereco findBairroForEndereco(Bairro bairro_id);
    public Endereco findForEndereco(Double distancia); 
}
