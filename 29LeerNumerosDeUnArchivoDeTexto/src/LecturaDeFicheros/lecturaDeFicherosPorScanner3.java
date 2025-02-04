package LecturaDeFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class lecturaDeFicherosPorScanner3 {
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
