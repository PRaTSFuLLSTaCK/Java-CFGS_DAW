package Prog_Tarea10;

import Util.ConexionAOracle;
import Util.UtilConsola;
import java.sql.*;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * nombre Ejercicio 1 de tarea 10
 * descripción: Programa que muestra menús de opciones y efectua operaciones 
 *             de base de datos con objetos.
 * @author Angel León
 */
public class Diccionario {

    public static void main(String[] args) throws SQLException {
        int error = 0;
        int numero = 0;
        int visto;
        
        /* Creamos una conexión con la base de datos.*/
        ConexionAOracle cac=new ConexionAOracle();      
        //String namespace = UtilConsola.leerCadena("Namespace (default.- XE): ", true);
        //String usuario = UtilConsola.leerCadena("Usuario: ", true);
        //String password = UtilConsola.leerCadena("Contraseña: ", true);
        String namespace = "XE";
        String usuario = "usuario";
        String password = "usuario";
        String sqlC, idi, tra;
        PreparedStatement ps;
        Array mi_array;
        String termino;
        
        Connection cOracle=cac.construirConexion(namespace, usuario, password);
        if (cOracle!=null){
            crear_tablas(cOracle);
            do{
                try{
                    System.out.print("\n\n");
                    System.out.print("              APLICACIÓN DICCIONARIO");
                    System.out.print("\n===================================================");
                    System.out.print("\n\nElige una opción:");
                    System.out.print("\n\t1.- Añade un nuevo término.");
                    System.out.print("\n\t2.- Ver todas los terminos.");
                    System.out.print("\n\t3.- Ver uno o varios términos.");
                    System.out.print("\n\t4.- Eliminar un termino y sus traducciones.");
                    System.out.print("\n\t5.- Salir de la aplicación.\n");

                    numero = UtilConsola.leerEntero("\nIntroduzca un número: (1 al 5) ", true);

                    switch(numero) { 
                        case 1: //Crear un nuevo término
                            String seguir="si";
                            Hashtable lista = new Hashtable();
                            termino = UtilConsola.leerCadena("\nIntroduce un termino: ", true);
                            while(exista(termino, cOracle)){
                                System.out.println("\nEse termino ya existe..."); 
                                termino=UtilConsola.leerCadena("\nIntroduce otro termino: ", true);
                            }
                                
                            String idioma=UtilConsola.leerCadena("Introduce el idioma: ", true);
                            while (idioma!=null){
                                String traduccion=UtilConsola.leerCadena("Introduce la traducción: ", true);
                                lista.put(idioma,traduccion);
                                idioma=UtilConsola.leerCadena("Introduce el idioma: [ENTER para salir] ", false);
                            }                           
                            Enumeration<String> id = lista.keys();
                            sqlC="INSERT INTO ejercicio VALUES ('"+termino+"',0, tabla_traduccion (";
                           while(id.hasMoreElements()){
                               idioma = id.nextElement();
                               sqlC=sqlC.concat("tipo_traduccion('");
                               sqlC=sqlC.concat(idioma);
                               sqlC=sqlC.concat("', '");
                               sqlC=sqlC.concat((String) lista.get(idioma));
                               if (id.hasMoreElements())
                                   sqlC=sqlC.concat("'), ");
                               else
                                   sqlC=sqlC.concat("')))");
                            }
                            //System.out.println("\n"+sqlC+"\n");    //Control de cadena
                            ps=cOracle.prepareStatement(sqlC,Statement.RETURN_GENERATED_KEYS);
                            ps.executeUpdate();
                            break;
                        case 2: // Ver el listado de terminos sin incrementos;
                            sqlC="SELECT * FROM ejercicio";
                            ps=cOracle.prepareStatement(sqlC,Statement.RETURN_GENERATED_KEYS);
                            try (ResultSet cont = ps.executeQuery(sqlC)) {
                                while (cont.next())
                                    System.out.print("\nTermino: " + cont.getString(1) +  ", visto: "+cont.getInt(2)+" veces.");
                            }                       
                            break;
                        case 3: // Ver el listado de terminos a buscar por aproximación e incremento;
                            termino=UtilConsola.leerCadena("\nIntroduce el termino a buscar: ", true);
                            sqlC="SELECT * FROM ejercicio WHERE (palabra LIKE '%"+termino+"%')";
                            ps=cOracle.prepareStatement(sqlC,Statement.RETURN_GENERATED_KEYS);
                            try (ResultSet cont = ps.executeQuery(sqlC)) {
                                while (cont.next()){
                                    System.out.print("\nTermino: " + cont.getString(1) +  "   Traducciones: ");
                                    visto = cont.getInt(2) + 1;
                                    mi_array = cont.getArray(3);
                                    Object[] trads = (Object[]) mi_array.getArray();
                                    int valor = trads.length;
                                    for (int x=0;x<valor;x++){
                                        oracle.sql.STRUCT obj1 = (oracle.sql.STRUCT)trads[x];
                                        idi = (String) obj1.getAttributes()[0];
                                        tra = (String) obj1.getAttributes()[1];                    
                                        System.out.print(idi +" - "+ tra +", ");
                                    }
                                     System.out.print("visualizado "+visto+" veces");
                                }
                            }
                            // Incremento el campo visto de los registros de la consulta anterior
                            // he probado con updateRow, creando un statement actualizable, pero
                            // lo visto en internet... Oracle no es muy receptivo a modificar resultset.
                            sqlC="UPDATE ejercicio SET visto = visto +1 WHERE (palabra LIKE '%"+termino+"%')";
                            ps=cOracle.prepareStatement(sqlC,Statement.RETURN_GENERATED_KEYS);
                            ps.executeUpdate(sqlC);
                            break;
                            
                        case 4: // Eliminar un determinado termino con sus traducciones
                            termino=UtilConsola.leerCadena("\nIntroduce el termino a borrar: ", true);
                            sqlC="DELETE FROM ejercicio WHERE (palabra = '"+termino+"')";
                            ps=cOracle.prepareStatement(sqlC,Statement.RETURN_GENERATED_KEYS);
                            ps.executeUpdate();
                            break;  
                            
                        case 5: // Salir de la aplicación;
                            System.out.println("\nEncantado de haber trabajado con usted...");
                            System.out.println("¡Que tenga un buen día!");
                            break;     
                        default:
                            System.out.println("Sólo del 1 al 5");                       
                    }             
                }catch(NumberFormatException e){
                    System.out.println("\nDebe introducir números.\n\n");

                }catch(IllegalArgumentException e){
                    System.out.println("\n"+e.getMessage()+"\n\n");
                }
                finally{
                    if (numero != 4 && error != 0){
                        System.out.println("\nHa odurrido un error...\n\n");
                        numero = 0;
                    }
                }
            }while (numero != 5);
            //Cerramos todo
            cOracle.close();
        }
    else System.out.println("No se ha podido conectar.");         
    }
       
/**
    * nombre Crear_tablas 
    * descripción: Función que crea las tablas y los objetos para poder guardar
    *              todos los datos, en el caso de que estén creadas no las modifica
    * @param cOracle es la conexión con Oracle
    */    
    
    public static void crear_tablas(Connection cOracle) throws SQLException{
        Statement sentencia = cOracle.createStatement();
        try{ 
        sentencia.execute("CREATE TYPE tipo_palabra AS OBJECT"
                + "("
                + "palabra varchar2(20),"
                + "visto INTEGER, traducciones tabla_traduccion"
                + ") NOT FINAL");
        
        sentencia.execute("CREATE TYPE tipo_traduccion AS OBJECT "
                + "("
                + "lenguaje  varchar2(20),"
                + "traduccion varchar2(20)"
                + ") NOT FINAL");

        sentencia.execute("CREATE TYPE tabla_traduccion AS TABLE OF tipo_traduccion");

        sentencia.execute("CREATE TABLE ejercicio OF tipo_palabra"
                + " ( CONSTRAINT palabra_c PRIMARY KEY ( palabra ),"
                + " CHECK ( palabra IS NOT NULL ) )"
                + " NESTED TABLE traducciones STORE AS trad_ntt");
        
        }
        catch( SQLException e ){
            System.out.println("Las tablas ya han sido creadas..." );
        }
    }  
    
/**
    * nombre Exista 
    * descripción: Función que comprueba si el termino ya está en la base de datos
    * @param cOracle es la conexión con Oracle
    * @param termino cadena a buscar
    * @return Devuelve verdadero en caso de que exista
    */  
    public static boolean exista(String termino, Connection cOracle) throws SQLException{
        String sqlC = "SELECT * FROM ejercicio WHERE (palabra = '"+termino+"')";
        PreparedStatement ps = cOracle.prepareStatement(sqlC,Statement.RETURN_GENERATED_KEYS);
        ResultSet cont = ps.executeQuery(sqlC);
        //System.out.println(sqlC);
        cont.next();
        if (cont.getRow()==0)
            return false;
        else
            return true;
    }        
}

