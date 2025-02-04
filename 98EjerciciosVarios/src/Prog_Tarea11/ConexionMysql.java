package Prog_Tarea11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**  
 * nombre Ejercicio 1 de tarea 11 
 * descripción: Clase que conecta con la bd notarbd a través de driver jdbc.
 * @author Angel León
 */

public class ConexionMysql{

    public String db = "notarbd";
    public String url = "jdbc:mysql://localhost/"+db;
    public String user = "root";
    public String pass = "piolin";

    public ConexionMysql(){}

    public Connection Conectar(){

        Connection link = null;

        try{
            //cargamos el Driver
            Class.forName("com.mysql.jdbc.Driver");
            // creamos un enlace
            link = DriverManager.getConnection(this.url, this.user, this.pass);
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return link;
    }
}

