package Prog_Tarea03_03;

/*3. De la misma forma que has creado los métodos anteriores, crea ahora un método
constructor para la clase Persona que al declarar un objeto de tipo Persona asigne los
siguientes valores a sus atributos:
nombre="Luisa Perez"
edad=22
altura=1,70
A continuación crea un proyecto que declare un objeto de tipo Persona utilizando el
constructor, para posteriormente mostrar el contenido de sus atributos por pantalla.
*/

import java.io.*;
/**
 * @author José Luis
 * @version 3.3
 */
public class Tarea3_03 {
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
