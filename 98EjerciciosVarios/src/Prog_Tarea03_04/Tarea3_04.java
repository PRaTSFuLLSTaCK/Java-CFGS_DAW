package Prog_Tarea03_04;

/*4. Crea un constructor con parámetros para la clase Persona que inicialice los atributos del
objeto con los valores indicados en los parámetros. A continuación crea un proyecto que
declare un objeto de tipo Persona utilizando el constructor, para posteriormente mostrar
el contenido de los atributos por pantalla. Utiliza el operador this.*/

import java.io.*;
/**
 * @author José Luis
 * @version 3.4
 */
public class Tarea3_04 {
    static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        int opcion=9;
        while(opcion != 0){
            opcion=menu();
            if(opcion==1) operaciones.introDatos();
            if(opcion==2) operaciones.consulDatos();
        }
    }
    static int menu() throws IOException{
        int opcion=9;
        while(opcion<0 || opcion>2){
            System.out.println("  menu de opciones  ");
            System.out.println("--------------------");
            System.out.println("1 - Introducir datos");
            System.out.println("2 - Consultar datos ");
            System.out.println("0 - Salir ");
            System.out.println("--------------------");
            System.out.println("  Qué desea hacer?  ");
            opcion=Integer.parseInt(dato.readLine());
        }
        return opcion;
    }

}
