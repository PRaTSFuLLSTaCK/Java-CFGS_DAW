package Prog_Tarea03_02;
/*2. Añade a la clase Persona los métodos que faltan para poder consultar y modificar el valor
de todos los atributos. Para ello observa cómo se han creado los métodos del atributo
nombre y determina los parámetros y resultado de los demás atributos. Después completa
el programa para comprobar el funcionamiento de los nuevos métodos.*/

import java.io.*;
/**
 * @author José Luis
 * @version 3.2
 */
public class Tarea3_02 {

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

