
package implementsDao;

import conection.Conexao;
import dao.DinheiroDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Dinheiro;
import model.Telefone;

public class DinheiroImplements implements DinheiroDao{

    @Override
    public void salvar(Dinheiro dinheiro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Dinheiro dinheiro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editar(Dinheiro dinheiro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Dinheiro findIdForDinheiro(Integer id) {
        try {
        PreparedStatement prepareStatement = Conexao.getConnection()
            .prepareStatement("SELECT * FROM telefone WHERE cliente = ?");
        prepareStatement.setString(5, cliente_id);
        ResultSet resultSet = prepareStatement.getResultSet();

        if (resultSet.next()) {
            Telefone telefone = new Telefone();''''''''''''''
            
            telefone.setId(resultSet.getInt("id"));
            telefone.setDd(resultSet.getInt("dd"));
            telefone.setNumero(resultSet.getInt("numero"));
            telefone.setFuncionario(resultSet.getString("funcionario"));
            telefone.setCliente_id(resultSet.getString("cliente"));
            
            return telefone;
        }
    } catch (SQLException ex) {
        Logger.getLogger(TelefoneImplements.class.getName()).log(Level.SEVERE, "Erro ao buscar telefone por Cliente", ex);
    }
        return null;
    }

    @Override
    public Dinheiro findValorEntregaForDinheiro(Double valorEntrega_id) {
    }

}
