package Prog_Tarea11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**  
 * nombre Ejercicio 1 de tarea 11 
 * descripción: Clase que con la cual insertamos registros en las 
 *              tablas de la Bd.
 * @author Angel León
 */

public class InsertaDatosEnLaTabla { 
    public void ingresarDatos(){
        String valor="N", sql;
        String txt_cod = null, txt_nom, txt_tlf;
        String txt_cod_esc, txt_fic, txt_tip, txt_int;
        ConexionMysql mysql = new ConexionMysql();
        Connection conn = mysql.Conectar();
        try {
            System.out.println("\n\n");
            txt_nom=UtilConsola.leerCadena("Inserta el nombre del cliente.- ", true);
            Statement s = conn.createStatement ();
            sql="SELECT cod_cliente FROM clientes WHERE (nombre='"+txt_nom+"')";
            s.executeQuery(sql);
            ResultSet rs = s.getResultSet();
            while (rs.next ()) {
                txt_cod = rs.getString(1);
            }
            if (txt_cod == null) {
                System.out.println("\nCliente no encontrado en la BD. Se le dará de alta.");
                txt_cod=UtilConsola.leerCadena("Inserta un código para el cliente.- ", true);
                txt_tlf=UtilConsola.leerCadena("Inserta el teléfono del cliente.- ", true);
                sql="INSERT INTO clientes(cod_Cliente, nombre, telefono) "
                        + "VALUES ('"+txt_cod+"','"+txt_nom+"','"+txt_tlf+"')";
                s.executeUpdate(sql); 
            }          
            txt_cod_esc = UtilConsola.leerCadena("Inserta un código de escritura.- ", true);
            txt_fic = UtilConsola.leerCadena("Escribe el nombre de fichero.- ", true);
            txt_tip = UtilConsola.leerCadena("Tipo de documento (ESC-Escritura, CV-Compraventa).- ", true);
            txt_int = UtilConsola.leerCadena("Cuantos intervinientes(>=2).- ", true);
            sql="INSERT INTO escrituras(cod_Escritura, tipo, nom_fich, num_interv) "
                    + "VALUES ('"+txt_cod_esc+"','"+txt_tip+"','"
                    +txt_fic+"','"+txt_int+"')";
            s.executeUpdate(sql);
            sql="INSERT INTO escCli(codCli, codEsc) VALUES ('"+txt_cod+"','"+txt_cod_esc+"')";
            s.executeUpdate(sql);
        } catch(Exception e) { 
            System.err.println ("Se han encontrado errores... "); 
        } finally {    
            if (conn != null)
                try {
                    conn.close ();
                }catch (Exception e) { /* sin mensajes de error */ }
        }
    }
}  

