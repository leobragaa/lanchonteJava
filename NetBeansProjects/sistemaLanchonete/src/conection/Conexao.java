
package conection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    private static Connection con;
    private static Conexao obj;
    
    //Conexao com o banco de dados PostgreSQL
    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String user = "postgres";
    private final String password = "1234";

    private Conexao() {
        try {
            con = DriverManager.getConnection(url, user, password);
            con.setAutoCommit(true);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, "Erro na Conexao com o Banco de Dados", ex);
        }
    }
    public static Connection getConexao(){
        if (obj==null){
            obj = new Conexao();
        }
        return con;
    }
}

