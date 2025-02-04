package Ejercicio03;

//método para calcular el número de veces que se repite un carácter en un String


/*Este es un ejemplo típico que se plantea para trabajar con cadenas de caracteres y 
 * hacer uso de los métodos de la clase String de Java. 
 * En concreto en este caso para buscar el carácter dentro del texto utilizaremos el 
 * método indexOf de String. El método indexOf(carácter) devuelve la primera posición 
 * dentro del String donde se encuentra el carácter o -1 si no lo ha encontrado. 
 * También se puede invocar al método con dos parámetros indexOf(carácter, posición) 
 * en este caso la búsqueda del carácter dentro del String comienza a partir de la posición
 *  que se le envía como parámetro. Devuelve la primera posición donde se encuentra o -1 
 *  si no lo ha encontrado.
Para resolverlo escribiremos un método llamado contarCaracteres que reciba el texto (String) y 
el carácter (char) a buscar y devuelva el número de veces que se repite el carácter dentro del texto.
El proceso utilizado para buscar el carácter en el texto es el siguiente:
Se busca la primera vez que aparece el carácter con el método indexOf:
posicion = cadena.indexOf(caracter);  
Si el carácter se ha encontrado se suma 1 a un contador y se sigue buscando a partir de la 
posición siguiente a la hallada:
posicion = cadena.indexOf(caracter, posicion + 1);
Este proceso se repite mientras el carácter se encuentre en la cadena. La búsqueda termina 
cuando indexOf devuelva -1 como posición.*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String texto;
        char caracter;
        int numeroDeVeces = 0;
        do {
            System.out.println("Introduce texto: ");
            texto = sc.nextLine();
        } while (texto.isEmpty());
        System.out.print("Introduce un carácter: ");
        caracter = (char) System.in.read();
        numeroDeVeces = contarCaracteres(texto, caracter);
        System.out.println("El caracter " + caracter + " aparece " + numeroDeVeces + " veces");
    }

    //calcular el número de veces que se repite un carácter en un String
    public static int contarCaracteres(String cadena, char caracter) {
        int posicion, contador = 0;
        //se busca la primera vez que aparece
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) { //mientras se encuentre el caracter
            contador++;           //se cuenta
            //se sigue buscando a partir de la posición siguiente a la encontrada
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
   }
}