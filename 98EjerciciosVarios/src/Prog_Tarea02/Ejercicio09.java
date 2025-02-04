package Prog_Tarea02;

/*9.- Diseña un programa Java que solicite un número de 5 dígitos del teclado, separe el número en
sus dígitos individuales y los muestre por pantalla. Por ejemplo, si el número es 53123 que
muestre:
5 3 1 2 3*/

import java.util.Scanner;
/**
 * @author José Luis
 * @class numeroTexto
 * @description Poner un número como texto separando sus cifras
 */

public class Ejercicio09 {
    public static void main (String args[]){
        Scanner dato=new Scanner (System.in);
        int numero;
        System.out.println("Introduzca un número de cinco cifras: ");
        numero = dato.nextInt();
        while((numero>99999) || (numero<10000)){
            System.out.println("Número erróneo. Sólo 5 cifras. Vuelva a intentarlo: ");
            numero = dato.nextInt();
        }
    
        System.out.println("El número: "+numero+" como texto es "+numTex(numero));
    }
    public static String numTex(int n1){
        int x,y;
        String z="";
        x = n1;
        while(x>0){
            y=x%10;
            x=x/10;
            z=String.valueOf(y)+" "+z;
        }                                             
        return z;
    }
}


