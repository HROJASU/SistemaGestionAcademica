
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
     public static Connection Conectar() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/bd_ventas","root","123root");
            System.out.println("Conexion Exitosa");
            return con;
        } catch (SQLException e) {
            System.err.println("No se pudo establecer conexion con la Base de Datos. Error: " + e);
        }
        return null;
    }
}
