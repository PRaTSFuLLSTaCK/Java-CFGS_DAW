package Ejercicio03;

import java.util.*;
import java.io.*;
/**
 * Programa que lee una temperatura expresada en grados centígrados y los pasa a grados kelvin.
 * Repetir el proceso mientras que se responda ‘S’ a la pregunta:
 * Repetir proceso? (S/N)
 * @author Enrique
 */
public class CentigradosAKelvin {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        double temperatura;
        char car;
        do{
            System.out.print("Introduce temperatura en ºC: ");
            temperatura = sc.nextDouble();
            System.out.println("Grados Kelvin ..: " + (temperatura+273));
            System.out.print("Repetir proceso? (S/N): " );
            car = (char)System.in.read();
        }while(car =='S' || car == 's');
    }
}