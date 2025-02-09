package Ejercicio09;

//Programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos 
//y segundos respectivamente, y comprueba si la hora que indican es una hora válida.

//Supondremos que se leemos una hora en modo 24 Horas, es decir, el valor válido para las
//horas será mayor o igual que cero y menor que 24.

//El valor válido para los minutos y segundos estará comprendido entre 0 y 59 ambos incluidos

/*
 * Programa java que lea tres números enteros H, M, S que contienen hora, minutos y
 * segundos respectivamente, y comprueba si la hora que indican es una hora válida.
 */
import java.util.*;
public class Ejercicio09 {
    public static void main(String[] args) {
        int H,M,S;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca hora: ");
        H =  sc.nextInt();
        System.out.print("Introduzca minutos: ");
        M =  sc.nextInt();
        System.out.print("Introduzca segundos: ");
        S =  sc.nextInt();
/*        La instrucción que comprueba si la hora leída por teclado es correcta es:

        	if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60)      

        	Esta condición da como resultado true cuando la hora es mayor o igual a 0 y menor que 24, los minutos son mayores o iguales a 0 y menores que 60 y los segundos son mayores 0 iguales a cero y menores a 60.
*/
        if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60)     
           System.out.println("Hora correcta");
        else
            System.out.println("Hora incorrecta");
    }
}