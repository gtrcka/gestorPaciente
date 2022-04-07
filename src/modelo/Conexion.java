
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/gestorpaciente?autoReconnect=true&useSSL=false";
    public static final String user = "root";
    public static final String pass = "1234";
    Connection conexion = getConnection();
    
    
    public Connection getConnection(){
        Connection conexion = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, user, pass);
        } catch(Exception ex){
            System.err.println("Error, " + ex);
        }
        return conexion;
    }
    
    public Connection getcon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String unicode = "useSSL=false&autoReconnect=true&useUnicode=yes&characterEncoding=UTF-8";
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/gestorpaciente?" + unicode, "root", "1234");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("couldn't connect!");
            throw new RuntimeException(ex);
        }
    }
}


