package Prog_Tarea11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**  
 * nombre Ejercicio 1 de tarea 11 
 * descripción: clase que permite actualizar datos de la tabla Clientes
 * @author Angel León
 */

public class ActualizarDatos { 
    public void actualizarClientes(String dato) {
        String sql, txt_cod = null, txt_nom = null, txt_tlf = null;
        String nom, tlf;
        ConexionMysql mysql = new ConexionMysql();
        Connection conn = mysql.Conectar(); 
        try{
            Statement s = conn.createStatement();
            sql="SELECT * FROM clientes WHERE (nombre='"+dato+"')";
            s.executeQuery(sql);
            ResultSet rs = s.getResultSet();
            while (rs.next ()) {
                txt_cod = rs.getString("cod_Cliente");
                txt_nom = rs.getString("nombre");
                txt_tlf = rs.getString("telefono");
            }
            if (txt_cod!=null){
                System.out.println ("Cliente.- "+txt_nom+"\tteléfono.- "+txt_tlf);
                nom=UtilConsola.leerCadena("Dime nuevo nombre de cliente (ENTER deja mismo).- ", false);
                tlf=UtilConsola.leerCadena("Dime nuevo teléfono de cliente (ENTER deja mismo).- ", false);
                if (nom==null) nom=txt_nom;
                if (tlf==null) tlf=txt_tlf;
                sql="UPDATE clientes SET nombre='" + nom + "', telefono='" + tlf
                    + "' WHERE (cod_Cliente='" + txt_cod + "')";
                s.executeUpdate(sql);
            }
            else System.out.println ("Cliente no encontrado. "); 
        } catch(Exception e) { 
            System.err.println ("Se han encontrado errores.- "+e.toString());     
        } finally {    
            if (conn != null)
                try {
                    conn.close ();
                }catch (Exception e) { /* sin mensajes de error */ }
        }
    }
}
