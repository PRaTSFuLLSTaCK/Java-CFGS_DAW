package Ejercicio5;

//Ejercicio 5. Programa que lee por teclado 
//el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia. 

//Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2

import java.util.*;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        double radio, longitud, area;//Declaracion de variables
        System.out.println("Introduce radio de la circunferencia:"); //Solicitud de dato
        radio = sc.nextDouble();//Lectura del dato solicitado
        longitud = 2 * Math.PI * radio;//caluculo de la longitud
        area = Math.PI * Math.pow(radio, 2);//calculo de la cirtunferencia
        System.out.println("Longitud de la circunferencia -> " + longitud);//Mostrar la longitud 
        System.out.println("Area de la circunferencia -> " + area);//Mostrar el area
    }
}
