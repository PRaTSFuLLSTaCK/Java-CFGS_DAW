package gestionProductos;

/*
 * 
 * 13) Nos piden hacer que gestionemos una serie de productos.

Los productos tienen los siguientes atributos:

Nombre
Precio
Tenemos dos tipos de productos:

Perecedero: tiene un atributo llamado días a caducar
No perecedero: tiene un atributo llamado tipo
Crea sus constructores, getters, setters y toString.

Tendremos una función llamada calcular, que según cada clase hará una cosa u otra, a esta función le pasaremos un numero siendo la cantidad de productos

En Producto, simplemente seria multiplicar el precio por la cantidad de productos pasados.
En Perecedero, aparte de lo que hace producto, el precio se reducirá según los días a caducar:
Si le queda 1 día para caducar, se reducirá 4 veces el precio final.
Si le quedan 2 días para caducar, se reducirá 3 veces el precio final.
Si le quedan 3 días para caducar, se reducirá a la mitad de su precio final.
En NoPerecedero, hace lo mismo que en producto
Crea una clase ejecutable y crea un array de productos y muestra el precio total de vender 5  productos de cada uno. Crea tú mismo los elementos del array.
 * 
 */

public class Main {
	 
    public static void main(String[] args) {
         
        //Creo que array de productos
        Producto[] productos = new Producto[3];
         
        //Creo los elementos
        productos[0] = new Producto("producto 1", 10);
        productos[1] = new Perecedero(1, "producto 2", 20);
        productos[2] = new NoPerecedero("tipo 1", "producto 3", 5);
 
        //Calculo el precio
        double total=0;
        for(int i=0;i<productos.length;i++){
            total += productos[i].calcular(5); //Polimorfismo
        }
         
        //Muestro el total
        System.out.println("el total es "+total);
         
    }
     
}
