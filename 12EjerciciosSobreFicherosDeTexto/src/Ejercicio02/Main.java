package Ejercicio02;

/*Ejemplo: Programa que leer por teclado líneas de texto y las añade al final del ficheros datos.txt. 
 * Para resolverlo vamos a modificar el programa anterior para que añada texto al fichero datos.txt, 
 * es decir, al volver a ejecutar el programa el contenido anterior del fichero no se pierde y
 *  el contenido nuevo se añade al final.*/

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        try (FileWriter fw = new FileWriter("c:/ficheros/datos.txt", true);
                PrintWriter salida = new PrintWriter(fw)) {
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
            cadena = sc.nextLine();
            while (!cadena.equalsIgnoreCase("FIN")) {
                salida.println(cadena);
                cadena = sc.nextLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}