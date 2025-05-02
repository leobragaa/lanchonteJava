
package implementsDao;

import conection.Conexao;
import dao.BairroDao;
import java.sql.SQLException;
import model.Bairro;

public class BairroImplements implements BairroDao{

    @Override
    public void salvar(Bairro bairroData) throws SQLException {
        PreparedStatement prepareStatement = Conexao.getConnection()
                .prepareStament(
                "insert into bairro(id,nome)VALUES(?,?)");
            prepareStatement.setId(getId());
            prepareStatement.setBairro(getBairro());
    }

    @Override
    public void editar(Bairro bairroData) {
        
    }

    @Override
    public void listar(Bairro bairroData) {
        
    }

    @Override
    public void delete(Bairro bairroData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Bairro findIdForBairro(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Bairro findNomeForBairro(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
