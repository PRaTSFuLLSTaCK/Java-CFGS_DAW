package barajaMejorada;

/*
 * 
 * 16) Vamos a hacer unas mejoras a la clase Baraja del ejercicio 5 de POO de los videos.

Lo primero que haremos es que nuestra clase Baraja será la clase padre y será abstracta.

Le añadiremos el número de cartas en total y el número de cartas por palo.

El método crearBaraja() será abstracto.

La clase Carta tendrá un atributo genérico que será el palo de nuestra versión anterior.

Creamos dos Enum:

PalosBarEspañola:
OROS
COPAS
ESPADAS
BASTOS
PalosBarFrancesa:
DIAMANTES
PICAS
CORAZONES
TREBOLES
Creamos dos clases hijas:

BarajaEspañola: tendrá un atributo boolean para indicar si queremos jugar con las cartas 8 y 9 (total 48 cartas) o no (total 40 cartas).
BarajaFrancesa: no tendrá atributos, el total de cartas es 52 y el número de cartas por palo es de 13. Tendrá dos métodos llamados:
cartaRoja(Carta<PalosBarFrancesa> c): si el palo es de corazones y diamantes.
cartaNegra(Carta<PalosBarFrancesa> c): si el palo es de tréboles y picas.
De la carta modificaremos el método toString()

Si el palo es de tipo PalosBarFrancesa:

La carta número 11 será Jota
La carta numero 12 será Reina
La carta numero 13 será Rey
La carta numero 1 será As
Si el palo es de tipo PalosBarFrancesa:

La carta numero 10 será Sota
La carta numero 12 será Caballo
La carta numero 13 será Rey
La carta numero 1 será As
 * 
 */

public class Main {
	 
    public static void main(String[] args) {
         
        //Creamos la baraja
        BarajaFrancesa b = new BarajaFrancesa();
         
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
