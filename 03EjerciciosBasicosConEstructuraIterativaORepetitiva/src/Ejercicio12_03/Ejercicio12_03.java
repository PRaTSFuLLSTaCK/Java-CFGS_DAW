package Ejercicio12_03;

import java.io.IOException;

//utilizando un bucle do .. while y finalizando cuando se responde ‘n’ ó ‘N’ 
//a la pregunta  “Desea introducir más números? (S/N):”.

import java.util.Scanner;

public class Ejercicio12_03 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int numero;
        char respuesta;

        do {

            System.out.print("Introduce un número: ");
            numero = sc.nextInt();

            if (numero != 0) {
                if (numero > 0) {
                    System.out.print("Positivo");
                } else {
                    System.out.print("Negativo");
                }
                if (numero % 2 == 0) {
                    System.out.println(" Par");
                } else {
                    System.out.println(" Impar");
                }
            }

            System.out.print("Desea introducir más números? (S/N): ");
            respuesta = (char) System.in.read();

        } while (respuesta != 'N' && respuesta != 'n');
    } 
}
