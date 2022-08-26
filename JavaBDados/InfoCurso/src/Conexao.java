
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    String serverName = "localhost";
    String database = "infocurso";
    String url = "jdbc:mysql://" + serverName + "/" + database;
    String username = "root";
    String password = "";
    Connection conexao;
    
    Conexao() throws SQLException{
        conexao = DriverManager.getConnection(url, username, password);
    }
}
