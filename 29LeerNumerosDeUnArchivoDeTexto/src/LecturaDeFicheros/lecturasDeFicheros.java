package LecturaDeFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 
 * Programa Java que lee el contenido del fichero datos.txt creado en el ejemplo anterior y lo muestra por pantalla. 
 * El proceso consiste en leer una línea del fichero y mostrarla por pantalla. 
 * El proceso se repite hasta que se llegue al final del fichero y no hayan más líneas que leer.
 * Cuando esto ocurre el método readLine() devuelve null.
 * 
 */

public class lecturasDeFicheros {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("c:/ficheros/datos.txt");
            BufferedReader entrada = new BufferedReader(fr);
            String cadena = entrada.readLine(); //se lee la primera línea del fichero
            while (cadena != null) {  //mientras no se llegue al final del fichero
                System.out.println(cadena); //se nuestra por pantalla
                cadena = entrada.readLine(); //se lee la siguiente línea del fichero
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
