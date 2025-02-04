package ejercicioBasicoDePOO11;

/*
 * 
 * Ejemplo aplicando la Programación orientada a objetos en Java ##Ejemplo 
 * 
 * Creamos una clase llamada Celular la cual contiene dos caracteristicas principales:

Nombre
Color
Esta clase va a presentar dos metodos Constructores

Constructor No.1 Celular
Nombre
Color
Constructor No.2 Celular
El Objeto Celular debe tener metodos especiales para realizar ciertas funciones tales como:

Llamar
detalleCelular
Al final nuestra clase Celular queda de la siguiente manrea:

###Clase Celular
 * 
 */

public class Celular {

    private String nombre,color;
    
    public Celular(String nombre,String color){
        this.nombre = nombre;
        this.color = color;
    }

    public Celular(){}

    public void llamar(){
        System.out.println("Llamando de "+nombre+" Color: "+color);
    }

    public void detalleCelular(Celular celular){
        System.out.println("-----------------------------------------------------------");
        System.out.println("Nombre: " + celular.nombre + "\nColor:  " + celular.color );
        System.out.println("-----------------------------------------------------------");
    }
    
}
