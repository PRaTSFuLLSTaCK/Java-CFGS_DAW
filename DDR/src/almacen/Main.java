package almacen;

/*
 * 
 * 14) Nos piden hacer un almacén, vamos a usar programación orientado a objetos.

En un almacén se guardan un conjunto de  bebidas.

Estos productos son bebidas como agua mineral y bebidas azucaradas (coca-cola, fanta, etc). De los productos nos interesa saber su identificador (cada uno tiene uno distinto), cantidad de litros, precio y marca.

Si es agua mineral nos interesa saber también el origen (manantial tal sitio o donde sea).

Si es una bebida azucarada queremos saber el porcentaje que tiene de azúcar y si tiene o no alguna promoción (si la tiene tendrá un descuento del 10% en el precio).

En el almacén iremos almacenado estas bebidas por estanterías (que son las columnas de la matriz).

Las operaciones del almacén son las siguientes:

Calcular precio de todas las bebidas: calcula el precio total de todos los productos del almacén.
Calcular el precio total de una marca de bebida: dada una marca, calcular el precio total de esas bebidas.
Calcular el precio total de una estantería: dada una estantería (columna) calcular el precio total de esas bebidas.
Agregar producto: agrega un producto en la primera posición libre, si el identificador esta repetido en alguno de las bebidas, no se agregará esa bebida.
Eliminar un producto: dado un ID, eliminar el producto del almacén.
Mostrar información: mostramos para cada bebida toda su información.
Puedes usar un main para probar las funcionalidades (añade productos, calcula precios, muestra información, etc)
 * 
 */

public class Main {
	 
    public static void main(String[] args) {
         
        //Creo el almacen
        Almacen a = new Almacen();
         
        Bebida b;
         
        //Añado bebidas (un poco de todo)
        //La forma de hacerlo es opcional
        for(int i=0;i<10;i++){
            switch(i%2){
                case 0:
                    b=new AguaMineral("manantial1", 1.5, 5, "bezoya");
                    a.agregarBebida(b);
                    break;
                case 1:
                    b=new BebidaAzucarada(0.2, true, 1.5, 10, "Coca Cola");
                    a.agregarBebida(b);
                    break;
            }
        }
         
        //Muestro las bebidas
        a.mostrarBebidas();
         
        //Calculo el precio de todas las bebidas
        System.out.println("Precio de todas las bebidas "+a.calcularPrecioBebidas());
         
        //Elimino una bebida en concreto
        a.eliminarBebida(4);
         
        //Muestro las bebidas
        a.mostrarBebidas();
         
        //
        System.out.println("Precio de todas las bebidas"+a.calcularPrecioBebidas());
         
        System.out.println("Precio de todas las bebidas de la marca bezoya" +a.calcularPrecioBebidas("bezoya"));
         
        System.out.println("Calcular el precio de la columna 0: "+a.calcularPrecioBebidas(0));
         
    }
     
}
