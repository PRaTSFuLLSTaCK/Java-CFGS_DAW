package Prog_Tarea11;

/**  
 * nombre Ejercicio 1 de tarea 11 
 * descripción: Clase que permite consultar los datos de la base de datos y
 *              en caso de traer parámetro de entrada, filtra los datos.
 * @author Angel León
 */

public class SeleccionaDatosDeTabla { 
    public void consultarDatos() {
        String sql;
        ConexionMysql mysql = new ConexionMysql();
        Connection conn = mysql.Conectar();
        try{
            Statement s = conn.createStatement();
                    //sentencia para la seleccion de datos de la tabla estudiantes
                    sql= "SELECT * FROM clientes, escrituras, escCli "
                            + "where (clientes.cod_Cliente = escCli.codCli and "
                            + "escrituras.cod_escritura=escCli.codEsc)";
                    s.executeQuery(sql);
                    ResultSet rs = s.getResultSet();
                    System.out.println("\n**********************************"); 
                    System.out.println("LOS DATOS DE LA TABLA CLIENTE SON:");
                    System.out.println("**********************************");
                    while (rs.next ()) {
                        System.out.println ("Nombre.- " + rs.getString ("nombre") + "\tTeléfono.- " 
                                + rs.getString ("telefono") + "\tTipo de documento.- " 
                                + rs.getString ("tipo") + "\tNombre de fichero.- " 
                                + rs.getString ("nom_fich")+"\tIntercinientes.- " 
                                + rs.getString ("num_interv"));
                    }

        } catch(Exception e) { 
            System.err.println ("Se han encontrado errores.- "+e.toString()); 
        } finally {    
            if (conn != null)
                try {
                    conn.close ();
                }catch (Exception e) { /* sin mensajes de error */ }
        }
    } 
    
    // Consulta datos con filtro de documentación.
    public void consultarDatos(String dato) {
        String sql;
        ConexionMysql mysql = new ConexionMysql();
        Connection conn = mysql.Conectar();
        try{
            Statement s = conn.createStatement();
                    //sentencia para la seleccion de datos de la tabla estudiantes
                    sql= "SELECT * FROM clientes, escrituras, escCli "
                            + "where (clientes.cod_Cliente = escCli.codCli and "
                            + "escrituras.cod_escritura=escCli.codEsc and "
                            + "escrituras.tipo='"+dato+"')";
                    s.executeQuery(sql);
                    ResultSet rs = s.getResultSet();
                    System.out.println("\n**********************************"); 
                    System.out.println("LOS DATOS DE LA TABLA CLIENTE SON:");
                    System.out.println("**********************************");
                    while (rs.next ()) {
                        System.out.println ("Nombre.- " + rs.getString ("nombre") + "\tTeléfono.- " 
                                + rs.getString ("telefono") + "\tTipo de documento.- " 
                                + rs.getString ("tipo") + "\tNombre de fichero.- " 
                                + rs.getString ("nom_fich")+"\tIntercinientes.- " 
                                + rs.getString ("num_interv"));
                    }

        } catch(Exception e) { 
            System.err.println ("Se han encontrado errores. "); 
        } finally {    
            if (conn != null)
                try {
                    conn.close ();
                }catch (Exception e) { /* sin mensajes de error */ }
        }
    } 
}

