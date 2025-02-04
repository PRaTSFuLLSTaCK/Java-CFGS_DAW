package Ejercicio13;

/*Programa Java que convierte millas a kilómetros. 
El programa pide que se introduzca una cantidad de millas y calcula y muestra su equivalente en Kilómetros. 
El proceso se repite hasta que se introduzca un 0 como valor para las millas.
1 Milla equivale a 1.6093 Kilómetros.
El valor de los KM resultantes se debe mostrar con dos decimales.
Solución:
Para pasar de millas a Km realizaremos la operación:
Km = millas * 1.6093
Para resolver el ejercicio utilizaremos como estructura repetitiva un bucle do .. while.
Para mostrar los Km equivalentes con dos decimales utilizaremos printf. 
Puedes consultar en esta entrada del blog la función printf.*/

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int millas;
        double km;
        System.out.println("Convertir Millas a Kilometros");
        do {

            System.out.print("Introduce millas (0 para finalizar): ");
            millas = sc.nextInt();

            if (millas != 0) {
                km = millas * 1.6093;
                System.out.printf("%d millas equivalen a %.2f KM %n", millas, km);
            }

        } while (millas != 0);
    }

}