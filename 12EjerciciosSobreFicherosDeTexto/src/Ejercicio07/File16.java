package Ejercicio07;

/*Disponemos de un fichero de texto llamado enteros.txt 
 * que contiene los siguientes números enteros separados por espacios 
 * en blanco o comas:

34,45,23 8, 9
12 23

El siguiente programa Java lee el contenido del fichero y muestra los números. 
Muestra también la cantidad de números leídos y su suma.
El programa lee líneas completas del fichero y las pasa a un StringTokenizer 
del que se extraen los números.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class File16 {
    public static void main(String[] args) {
        File f = new File("c:/ficheros/enteros.txt");
        int numero, suma = 0, cont = 0;
        StringTokenizer st;
        Scanner entrada = null;
        String cadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                cadena = entrada.nextLine();
                st = new StringTokenizer(cadena, " ,");
                while (st.hasMoreTokens()) {
                    numero = Integer.parseInt(st.nextToken());
                    System.out.println(numero);
                    suma = suma + numero;
                    cont++;
                }
            }
            System.out.println("Número leídos: " + cont);
            System.out.println("Suma " + suma);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
    }
}