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

public class BarajaEspañola extends Baraja {
 
    private boolean incluye_8_9;
 
    public BarajaEspañola(boolean incluye_8_9) {
        super();
 
        this.incluye_8_9 = incluye_8_9;
 
        if (incluye_8_9) {
            numCartas = 48;
            cartasPorPalo = 12;
        } else {
            numCartas = 40;
            cartasPorPalo = 10;
        }
 
        crearBaraja(); //Creamos la baraja
        super.barajar(); // barajamos la baraja
    }
 
    @Override
    public void crearBaraja() {
 
        this.cartas = (Carta<PalosBarajaEspañola>[]) new Carta[numCartas];
 
        PalosBarajaEspañola[] palos = PalosBarajaEspañola.values();
 
        //Recorro los palos
        for (int i = 0; i < palos.length; i++) {
 
            //Recorro los numeros
            for (int j = 0; j < cartasPorPalo; j++) { 
            	if (incluye_8_9) { cartas[((i * cartasPorPalo) + j)] = new Carta(j + 1, palos[i]); }
            	else { //Las posiciones del 8 y del 9 son el 7 y el 8 (emepzamos en 8) if (j >= 7) {
                        //Solo para la sota, caballo y rey
                        cartas[((i * cartasPorPalo) + j)] = new Carta(j + 3, palos[i]);
                     {
                        //Para los casos de 1 a 7
                        cartas[((i * cartasPorPalo) + j)] = new Carta(j + 1, palos[i]);
                    }
                }
 
            }
 
        }
 
    }
 
}
