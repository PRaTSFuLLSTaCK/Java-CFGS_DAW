package Ejercicio05;

/*Programa que lee línea a línea el contenido del fichero datos.txt 
 * utilizando la clase Scanner.
Se utiliza el método hasNext() de Scanner para saber si quedan más datos 
que leer en el fichero. Este método devuelve false si se ha llegado al final 
del fichero y true en caso contrario.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class File12 {
    public static void main(String[] args) {
        File f = new File("c:/ficheros/datos.txt");
        String cadena;
        Scanner entrada = null;
        try {
            entrada = new Scanner(f); //se crea un Scanner asociado al fichero
            while (entrada.hasNext()) { //mientras no se alcance el final del fichero
                cadena = entrada.nextLine(); //se lee una línea del fichero
                System.out.println(cadena); //se muestra por pantalla
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally{
            entrada.close();
        }  
    }
}