package barajaDeCartas;

/*
 * 
 * 10)  Vamos a hacer una baraja de cartas españolas orientado a objetos.

Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas)

La baraja estará compuesta por un conjunto de cartas, 40 exactamente.

Las operaciones que podrá realizar la baraja son:

barajar: cambia de posición todas las cartas aleatoriamente
siguienteCarta: devuelve la siguiente carta que está en la baraja, cuando no haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
cartasDisponibles: indica el número de cartas que aún puede repartir
darCartas: dado un número de cartas que nos pidan, le devolveremos ese número de cartas (piensa que puedes devolver). En caso de que haya menos cartas que las pedidas, no devolveremos nada pero debemos indicárselo al usuario.
cartasMonton: mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario
mostrarBaraja: muestra todas las cartas hasta el final. Es decir, si se saca una carta y luego se llama al método, este no mostrara esa primera carta.
 * 
 */

public class Main {
	 
    public static void main(String[] args) {
         
        //Creamos la baraja
        Baraja b = new Baraja();
         
        //Mostramos las cartas disponibles (40)
        System.out.println("Hay "+b.cartasDisponible()+" cartas disponibles");
        
        //Saco una carta
        b.siguienteCarta();
         
        //Saco 5 cartas
        b.darCartas(5);
         
        //Mostramos las cartas disponibles (34)
        System.out.println("Hay "+b.cartasDisponible()+" cartas disponibles");
        
        System.out.println("Cartas sacadas de momento");
         
        b.cartasMonton();
         
         
        //Barajamos de nuevo
        b.barajar();
        
        //Saco 5 cartas
        Carta[] c = b.darCartas(5);
         
        System.out.println("Cartas sacadas despues de barajar ");
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
         
    }
     
}
