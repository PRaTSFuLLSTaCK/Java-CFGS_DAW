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

public class Main {

    public static void main(String[] args) {

        Celular celular1 = new Celular("LG","Rojo"); //Declaracion de celular 1
        celular1.llamar();

        Celular celular2 = new Celular("MOTOROLA","VERDE"); //Declaracion de celular 2
        celular2.llamar();

        Celular detalleCelular = new Celular(); //Mostrando detalle de objeto celular creado

        detalleCelular.detalleCelular(celular2);
    }
}
