package ruletaRusa;

/**
 * 12)  Vamos a hacer el juego de la ruleta rusa en Java.

Como muchos sabéis, se trata de un número de jugadores que con un revolver con un sola bala en el tambor se dispara en la cabeza.

Las clases a hacer son:

Revolver:
Atributos:
posición actual (posición del tambor donde se dispara, puede que esté la bala o no)
posición bala (la posición del tambor donde se encuentra la bala)
Estas dos posiciones, se generaran aleatoriamente.

Funciones:
disparar(): devuelve true si la bala coincide con la posición actual
siguienteBala(): cambia a la siguiente posición del tambor
toString(): muestra información del revolver (posición actual y donde está la bala)
Jugador:
Atributos
id (representa el número del jugador, empieza en 1)
nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo)
vivo (indica si está vivo o no el jugador)
Funciones:
disparar(Revolver r): el jugador se apunta y se dispara, si la bala se dispara, el jugador muere.
Juego:
Atributos:
Jugadores (conjunto de Jugadores)
Revolver
Funciones:
finJuego(): cuando un jugador muere, devuelve true
ronda(): cada jugador se apunta y se dispara, se informara del estado de la partida (El jugador se dispara, no ha muerto en esa ronda, etc.)
El número de jugadores será decidido por el usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.

En cada turno uno de los jugadores, dispara el revólver, si este tiene la bala  el jugador muere y el juego termina.

Aunque no lo haya comentado, recuerda usar una clase ejecutable para probarlo.


 */

public class Main {
 
    public static void main(String[] args) {
         
        Juego juego = new Juego(2);
         
        while( !juego.finJuego() ){
            juego.ronda();            
            //juego.rondaV2();
        }
         
        System.out.println("El juego ha terminado");
         
    }
     
}