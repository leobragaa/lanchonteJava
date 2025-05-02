
package conection;
import java.sql.*;

public class Conexao {
    private static Connection con;
    
    public static Connection getConnection(){
        return con;
    }
}
