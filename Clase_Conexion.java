
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bayer
 */
public class Clase_Conexion {
    public static Connection getConexion() {
        Connection conexion=null;
         try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conexion = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/Constructora", "Adminn","admin");
            System.out.println("Se concecto Correctamente ");

        } catch (Exception e) {
            System.err.println("Hubo un error en la instalacion " + e);
        }
        return conexion;

    }
}
