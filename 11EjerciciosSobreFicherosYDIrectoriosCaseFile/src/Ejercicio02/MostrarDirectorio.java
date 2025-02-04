package Ejercicio02;

//Mostrar el contenido de un directorio en Java

/*Programa que muestre el contenido de un directorio o carpeta. Se deben mostar los nombres de los archivos 
y los directorios que contiene en orden alfababético.

Solución:

Primero creamos un objeto File que va a representar el directorio o carpeta a mostrar. 
Por ejemplo, en un sistema Windows si queremos mostrar el contenido de la unidad C: 
escribimos la siguiente instrucción:

File directorio = new File("c:/");
Una vez creado el objeto, podemos utilizar el método list() de la clase File. 
El método list() devuelve un array de String con el nombre de todos los archivos y 
directorios que contiene el objeto que lo invoca.

String[] lista = directorio.list();
Ordenamos alfabéticamente el array lista mediante el método Arrays.sort:
Arrays.sort(lista);

Por último mostramos el contenido del array:
for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
}*/
import java.io.File;
import java.util.Arrays;

public class MostrarDirectorio {

  public static void main(String[] args) {
      File directorio = new File("c:/"); //directorio a listar
      String[] lista = directorio.list();
      Arrays.sort(lista);
      for (int i = 0; i < lista.length; i++) {
          System.out.println(lista[i]);
      }
  }
}