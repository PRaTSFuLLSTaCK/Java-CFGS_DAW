package Ejercicio04;

/*Mostrar por pantalla el contenido del fichero de texto datos.txt 
 * pero en este caso lo vamos a leer carácter a carcater. 
 * El proceso consiste en leer un carácter del fichero y mostrarlo por pantalla. 
 * Este proceso se repite hasta que no queden más caracteres que leer en el 
 * fichero, es decir, hasta que se alcance el finall del fichero. 
 * En este caso el método read() devuelve -1.*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File14 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("c:/ficheros/datos.txt");
            BufferedReader entrada = new BufferedReader(fr);
            int car = entrada.read(); //se lee el primer carácter del fichero
            while (car != -1) { //mientras no se llegue al final del fichero
                System.out.print((char) car); //se nuestra por pantalla
                car = entrada.read(); //se lee el siguiente carácter del fichero
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

