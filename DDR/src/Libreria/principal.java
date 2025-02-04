package Libreria;

/*
 * 
 * 6) Crear una clase Libro que contenga los siguientes atributos:
– ISBN

– Titulo

– Autor

– Número de páginas

Crear sus respectivos métodos get y set correspondientes para cada atributo. Crear el método toString() para mostrar la información relativa al libro con el siguiente formato:

“El libro con ISBN creado por el autor tiene páginas”

En el fichero main, crear 2 objetos Libro (los valores que se quieran) y mostrarlos por pantalla.

Por último, indicar cuál de los 2 tiene más páginas.
 * 
 */

public class principal {
	 
    public static void main(String[] args) {
        
        //Creamos lo objetos
        Libro libro1=new Libro(1111111111, "titulo1", "autor1", 30);
        Libro libro2=new Libro(1111111112, "titulo2", "autor2", 60);
         
        //Mostramos su estado
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
         
        //Modificamos el atributo numPaginas del libro1
        libro1.setNumPaginas(70);
         
        //Comparamos quien tiene mas paginas
        if(libro1.getNumPaginas()>libro2.getNumPaginas()){
            System.out.println(libro1.getTitulo()+" tiene más páginas");
        }else{
            System.out.println(libro2.getTitulo()+" tiene más páginas");
        }
         
         
    }
     
}

