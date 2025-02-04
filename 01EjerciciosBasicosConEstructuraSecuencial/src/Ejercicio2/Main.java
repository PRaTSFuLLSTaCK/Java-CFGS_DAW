package Ejercicio2;

import java.util.Scanner;

//2.      Programa Java que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”


public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String cadena;//Declaracion de variable
        System.out.println("Introduce un nombre: "); //texto indroductorio para el dato
        cadena = sc.nextLine();//lectura de la variable
        System.out.println("Buenos Días " + cadena);//Mostrar el dato introducido
    }
}