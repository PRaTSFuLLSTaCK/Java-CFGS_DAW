package LecturaDeFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class lecturaDeFicherosPorScanner {
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
