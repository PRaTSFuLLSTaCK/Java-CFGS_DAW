package Prog_Tarea11;

/**
 * nombre Ejercicio 1 de tarea 11 
 * descripción: Clase que conecta nos muestra un menú de opciones.
 * @author Angel
 */

public class MenuOpciones { //clase que contien el menu de opciones
    String msg="****************Ingrese la Opcion****************";
    public int menuPrincipal() {
        int opcion=0;
        try {
            System.out.println("\n\n----------------------------------------------------");
            System.out.println("*** NOTARIA DEL ESTADO ***");
            System.out.println("----------------------------------------------------");
            System.out.println("(1). Crear tablas ");             
            System.out.println("(2). Ingresar datos "); 
            System.out.println("(3). Consulta general "); 
            System.out.println("(4). Consulta documento determinado ");
            System.out.println("(5). Actualización cliente "); 
            System.out.println("(6). Eliminar tablas "); 
            System.out.println("(7). Salir ");
            System.out.println("----------------------------------------------------");
            System.out.println("----------------------------------------------------");            
            opcion=UtilConsola.leerEntero("Inserta la opción.- ", true); 
        }catch (Exception e) { 
                System.err.println("Error debe digitar una de las opciones. ");
        }
        return opcion;
    }
}

