package Prog_Tarea11;

import java.sql.Connection;
import java.sql.Statement;

/**  
 * nombre Ejercicio 1 de tarea 11 
 * descripción: clase que permite eliminar las tablas con todos sus datos.
 * @author Angel León
 */

public class EliminaTabla { 
    @SuppressWarnings("ConvertToTryWithResources")
    public void borrar () { 
        ConexionMysql mysql = new ConexionMysql();
        Connection conn = mysql.Conectar();
        try {
            Statement s = conn.createStatement (); 
            //sentencias para elminar las tablas de la base de datos
            s.executeUpdate("DROP TABLE escCli");
            s.executeUpdate("DROP TABLE clientes");
            s.executeUpdate("DROP TABLE escrituras");
            s.close (); 
            System.out.println ("\n *** Tablas eliminadas ***"); 
        }catch (Exception e) { 
            System.err.println ("Error al intentar borrar las tablas. "); 
        } finally {
            if (conn != null)
                try {
                    conn.close ();
                    }catch (Exception e) { /* sin mensajes de error */ } 
        }
    } 
} 


