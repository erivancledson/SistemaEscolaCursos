
package infoclik.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Cledson
 */
public class Conexao {
    private static Connection connection;
    public static Connection getConnection(int sistema) throws Exception {
    	String conexao = "";
    	String usuario = "";
    	String senha = "";
    	
    	 if (sistema == Database.POSTGRESQL) {
    		conexao = "jdbc:postgresql://127.0.0.1/infoclik";
    		usuario = "postgres";
    		senha = "123@qwe";
    	}
    	else {
    		throw new IllegalArgumentException("Tipo de banco não suportado");
    	}
    	if (connection == null) {
            try {
            	connection = DriverManager.getConnection(conexao, usuario, senha);
	    	} catch(SQLException e) {
	    		throw new Exception("SQLException => ConnectionManager: " + e.getMessage());
	    	}
        }
        return connection;
    }
    public static void close() throws Exception {
    	connection.close();
    }

}
