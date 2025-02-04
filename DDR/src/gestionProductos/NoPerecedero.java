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

public class NoPerecedero extends Producto{
     
    //Atributos
    private String tipo;
 
    //constructores
    public NoPerecedero(String tipo, String nombre, double precio) {
        super(nombre, precio);
        this.tipo = tipo;
    }
 
    //Metodos
    public String getTipo() {
        return tipo;
    }
 
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
 
    @Override
    public String toString() {
        return super.toString() + " tipo=" + tipo + '}';
    }
     
     
}
