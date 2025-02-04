package Ejercicio11;

/*Programa Java que lee un archivo de texto que contiene números de tipo int y 
 * double. El archivo a leer está formado por dos líneas. La primera línea del fichero contiene números enteros separados por espacios en blanco. La segunda línea contiene números de tipo double separados también por espacios en blanco.
 
Por ejemplo:
2 6 -1 0 5 10 1 8 2 100
5,75 -8,25 4,25

No conocemos a priori la cantidad de números que hay en cada línea del archivo.
El programa debe leer el archivo de texto, mostrar por pantalla los números enteros y su suma y a continuación mostrar por pantalla los números double y su suma.
Por ejemplo, si el archivo contiene los valores anteriores, el programa mostrará por pantalla:
Números de tipo int:

2 6 -1 0 5 10 1 8 2 100
Suma de los int: 133

Números de tipo double:
5.75 -8.25 4.25

Suma de los doubles: 1.75

Solución:

Para leer el archivo de texto utilizaremos la clase Scanner.
Sabemos que en la primera línea del archivo se encuentran los números enteros. 
Para leer cada número entero del archivo utilizaremos el método nextInt() 
de Scanner. Como no sabemos cuántos números hay en la línea, para poder leerlos 
todos utilizaremos el método hasNextInt() de Scanner dentro de un bucle while. 
El método hasNextInt() devuelve true cuando lo siguiente que se va a leer 
del archivo es un entero, por lo tanto podemos usarlo para saber si quedan más 
enteros por leer.

Cuando hasNextInt() devuelva false se habrán acabado lo números enteros y 
debemos empezar a leer los de tipo double. Cada double del archivo se leerá 
con en método nextDouble(). Utilizaremos ahora el método hasNextDouble() dentro
 de un bucle while para poder leerlos todos.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivoTextoConNumeros {

    public static void main(String[] args) {
        int numeroEntero, sumaInt = 0;
        double numeroDouble, sumaDouble = 0;

        File f = new File("c:/ficheros/numeros.txt");

        try  (Scanner entrada = new Scanner(f)) {

            //Primero están todos los int seguidos
            System.out.println("Números de tipo int: ");

            while (entrada.hasNextInt()) { //mientras queden enteros por leer
                numeroEntero = entrada.nextInt(); //se lee un entero del archivo
                System.out.print(numeroEntero + " "); //se muestra por pantalla
                sumaInt = sumaInt + numeroEntero;  //se suma
            }

            //cuando acaba la lectura de enteros se muestra su suma
            System.out.println("\nSuma de los int: " + sumaInt);

            //Cuando terminan los int empiezan los double
            System.out.println("Números de tipo double: ");

            while (entrada.hasNextDouble()) { //mientras queden double por leer
                numeroDouble = entrada.nextDouble(); //se lee un double del archivo
                System.out.print(numeroDouble + " ");  //se muestra por pantalla
                sumaDouble = sumaDouble + numeroDouble; //se suma
               
            }

            //cuando acaba la lectura de double se muestra su suma
            System.out.println("\nSuma de los doubles: " + sumaDouble);

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}