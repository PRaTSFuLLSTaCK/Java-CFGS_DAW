package Prog_Tarea11;

import java.sql.Connection;
import java.sql.Statement;

/**  
 * nombre Ejercicio 1 de tarea 11 
 * descripción: clase que crea las tablas vacias del ejercicio
 * @author Angel León
 */

public class CreaTabla { 
    public void crear () {
        ConexionMysql mysql = new ConexionMysql();
        Connection conn = mysql.Conectar();
        try {
            Statement s = conn.createStatement ();
            String tabla1, tabla2, tabla3;
            //sentencias para la creacion de tablas
            tabla1 ="CREATE TABLE clientes (cod_Cliente varchar(10), nombre varchar(40), telefono varchar(10),"
                    + "constraint cli_pk primary key (cod_Cliente))";            
            tabla2 ="CREATE TABLE escrituras (cod_Escritura  varchar(10), tipo varchar(5), "
                    + "nom_fich varchar(40), num_interv int(2), constraint esc_pk "
                    + "primary key (cod_Escritura), constraint interv_ck check (num_interv >= 2))";      
            tabla3 ="CREATE TABLE escCli (codigo DOUBLE AUTO_INCREMENT, codCli varchar(10), "
                    + "codEsc varchar(40), constraint cod_pk primary key (codigo), "
                    + "constraint cod_Cli_fk foreign key (codCli) references clientes(cod_Cliente), "
                    + "constraint cod_Esc_fk foreign key (codEsc) references escrituras(cod_Escritura))";
            s.executeUpdate(tabla1);
            s.executeUpdate(tabla2);
            s.executeUpdate(tabla3);
            System.out.println ("\n *** Tablas Creadas ***"); 
        }catch (Exception e) { 
            System.err.println ("Error creando las tablas. "); 
        } finally {    
            if (conn != null)
                try {
                    conn.close ();
                }catch (Exception e) { /* sin mensajes de error */ }
        }
    } 
} 
 
