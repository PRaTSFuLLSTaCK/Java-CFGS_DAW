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

public class Perecedero extends Producto {
 
    //Atributos
    private int dias_a_caducar;
 
    //Constructores
    public Perecedero(int dias_a_caducar, String nombre, double precio) {
        super(nombre, precio);
        this.dias_a_caducar = dias_a_caducar;
    }
 
    //Metodos
    public int getDias_a_caducar() {
        return dias_a_caducar;
    }
 
    public void setDias_a_caducar(int dias_a_caducar) {
        this.dias_a_caducar = dias_a_caducar;
    }
 
    @Override
    public String toString() {
        return super.toString() + " dias_a_caducar=" + dias_a_caducar;
    }
 
    /**
     * Calcula el precio segun una cantidad,
     * tambien segun los dias que le queden al prodcuto,
     * se reducira el precio.
     * <ul>
     * <li>1: 4 veces menos</li>
     * <li>2: 3 veces menos</li>
     * <li>3: 2 veces menos</li>
     * </ul>
     * @param cantidad
     * @return 
     */
    @Override
    public double calcular(int cantidad) {
 
        double precioFinal = super.calcular(cantidad);
 
        switch (dias_a_caducar) {
            case 1:
                precioFinal /= 4;
                break;
            case 2:
                precioFinal /= 3;
                break;
            case 3:
                precioFinal /= 2;
                break;
        }
         
        return precioFinal;
 
    }
 
}
