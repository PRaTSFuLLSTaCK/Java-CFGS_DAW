package Ejercicio10;

/*Crear un fichero de texto en Java con caracteres aleatorios.

Programa Java para crear un fichero de texto que contenga caracteres 
obtenidos de forma aleatoria. Los caracteres a incluir en el fichero 
serán las letras de la A a la Z (mayúsculas y minúsculas incluida la ñ) 
y espacios en blanco.  

El número total de caracteres a escribir se pide por teclado.*/

/*Utilizaremos la clase Random para obtener números de forma aleatoria. 
 * Obtendremos números entre 0 y 255 que es el rango de caracteres de la tabla 
 * ASCII. Una vez obtenido el número comprobaremos si corresponde a una letra 
 * mayúscula o minúscula o a un espacio en blanco o a la letra ñ. 
 * Si es así se escribe en el fichero de texto.*/

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class CrearArchivoCaracteresAleatorios {

    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int cont = 0, n, cantidad;

        do{
            System.out.println("Introduce número de caracteres: ");
            cantidad = sc.nextInt();
        }while(cantidad < 1);

        try (PrintWriter salida = new PrintWriter("c:/ficheros/caracteres.txt")) {

            while (cont < cantidad) {

                n = rnd.nextInt(255); //se obtiene un número

                //si el número corresponde a una letra o a un espacio se escribe en el fichero
                if ((Character.toUpperCase((char) n) >= 'A'
                        && Character.toUpperCase((char) n) <= 'Z')
                        || ((char) n == ' ')
                        || ((char) n == 'ñ')
                        || ((char) n == 'Ñ')) {
                    salida.print((char) n);
                    cont++;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}