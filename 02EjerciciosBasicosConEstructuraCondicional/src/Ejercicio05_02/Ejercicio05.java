package Ejercicio05_02;

//Una forma alternativa de resolver este ejercicio es 
//comparando directamente las dos variables con las letras minúsculas    

import java.io.*;
public class Ejercicio05 {
public static void main(String[] args) throws IOException {
        char car1, car2;
        System.out.println("Introduzca primer carácter: ");
        car1 = (char)System.in.read(); //lee un carácter
        System.in.read();  //saltar el intro que ha quedado
        System.out.println("Introduzca segundo carácter: ");
        car2 = (char)System.in.read(); //lee el segundo carácter     
        if(car1>='a' && car1<='z'){
            if(car2>='a' && car2<='z')
               System.out.println("Los dos son letras minúsculas");
           else
               System.out.println("El primero es una letra minúscula pero el segundo no");
        }
        else{
            if(car2>='a' && car2<='z')
               System.out.println("El segundo es una letra minúscula pero el primero no");
           else
               System.out.println("Ninguno es una letra minúscula");
        }
   }
}