package Ejercicio04;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList();
        leerArray(cadenas);
        System.out.println("Cadena de mayor longitud : " + cadenaMasLarga(cadenas));
    }

    //llenar el ArrayLIst con Strings introducidos por teclado
    public static void leerArray(ArrayList<String> cadenas) {
        Scanner sc = new Scanner(System.in);
        String s;
        boolean masCadenas;
        do {
            masCadenas = true;
            System.out.print("Introduce una cadena de caracteres (Fin para acabar): ");
            s = sc.nextLine();
            if (s.equalsIgnoreCase("FIN")) {
                masCadenas = false;
            } else {
                cadenas.add(s);
            }
        } while (masCadenas);
    }
   
    //Calcular y devolver la cadena de mayor longitud
    public static String cadenaMasLarga(ArrayList<String> cadenas) {
        String mayor = cadenas.get(0);
        for (int i = 1; i < cadenas.size(); i++) {
            if (cadenas.get(i).length() > mayor.length()) {
                mayor = cadenas.get(i);
            }
        }
        return mayor;
    }
} //Fin Clase Principal