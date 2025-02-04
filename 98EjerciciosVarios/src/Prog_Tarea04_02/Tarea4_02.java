package Prog_Tarea04_02;

/*Ejercicio 2
Diseña un programa que imite a una calculadora capaz de realizar las operaciones básicas (suma,
resta, producto y multiplicación) y dos operaciones complejas como la potencia y la raíz cuadrada,
la aplicación debe mostrar inicialmente un menú similar al siguiente:
Emulador Calculadora
Elige una opción:
1.- Operaciones básicas.
2.- Operaciones complejas.
3.- Salir.
En el caso de la opción 1 se deberá mostrar:
a. Suma.
b. Resta.
c. Producto.
d. División.
En el caso de la opción 2 se deberá mostrar:
a. Potencia.
b. Raíz cuadrada.
Una vez elegida la opción correspondiente el programa deberá solicitar los datos necesarios y
mostrar por pantalla el resultado obtenido en cada caso. El programa deberá controlar los posibles
errores que se puedan producir a la hora de elegir la opción y de introducir los datos por teclado de
tal forma que si los datos introducidos fueran erróneos los vuelva a solicitar.
*/

import java.io.*;
/**
 *
 * @author José Luis
 * @version 4.2
 */
public class Tarea4_02 {
    static BufferedReader opcion = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        int op=0;
        while(op<1 || op>3){
            System.out.println("Elige una opción:\n");
            System.out.println("1 - Operaciones básicas");
            System.out.println("2 - Operaciones complejas");
            System.out.println("3 - Salir");
            try{
                op = Integer.parseInt(opcion.readLine());
                if(op<1 || op>3) System.err.println("Sólo valores enteros entre 1 y 3");
            }catch(IOException e){
                System.err.println("Error en la entrada de datos");
            }catch(NumberFormatException e){
                System.err.println("Sólo son válidos valores enteros entre 1 y 3");
            }
            switch(op){
                case 1:
                    basicas.inicio();
                    op=0;
                    break;
                case 2:
                    complejas.inicio();
                    op=0;
                    break;
                case 3:
                    System.out.println("¡Hasta pronto!");
            }
        }
    }
}
