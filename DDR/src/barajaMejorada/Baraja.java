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

public abstract class Baraja<T> {
 
    //Atributos
    protected Carta<T> cartas[];
    protected int posSiguienteCarta;
    protected int numCartas;
    protected int cartasPorPalo;
 
    public Baraja() {
        this.posSiguienteCarta = 0;
    }
 
    /**
     * Metodo abstracto crearBaraja
     */
    public abstract void crearBaraja();
 
    /**
     * Baraja todas las cartas
     */
    public void barajar() {
 
        int posAleatoria = 0;
        Carta c;
 
        //Recorro las cartas
        for (int i = 0; i < cartas.length; i++) {
 
            posAleatoria = Metodos.generaNumeroEnteroAleatorio(0, numCartas - 1);
 
            //intercambio
            c = cartas[i];
            cartas[i] = cartas[posAleatoria];
            cartas[posAleatoria] = c;
 
        }
 
        //La posición vuelve al inicio
        this.posSiguienteCarta = 0;
 
    }
 
    /**
     * Devuelve la casta donde se encuentre "posSiguienteCarta"
     *
     * @return carta del arreglo
     */
    public Carta siguienteCarta() {
 
        Carta c = null;
 
        if (posSiguienteCarta == numCartas) {
            System.out.println("Ya no hay mas cartas, barajea de nuevo");
        } else {
            c = cartas[posSiguienteCarta++];
        }
 
        return c;
 
    }
 
    /**
     * Devuelve un numero de cartas. Controla si hay mas cartas de las que se
     * piden
     *
     * @param numCartas
     * @return
     */
    public Carta[] darCartas(int numCartas) {
 
        if (numCartas > numCartas) {
            System.out.println("No se puede dar mas cartas de las que hay");
        } else if (cartasDisponible() < numCartas) {
            System.out.println("No hay suficientes cartas que mostrar");
        } else {
 
            Carta[] cartasDar = new Carta[numCartas];
 
            //recorro el array que acabo de crear para rellenarlo
            for (int i = 0; i < cartasDar.length; i++) {
                cartasDar[i] = siguienteCarta(); //uso el metodo anterior
            }
 
            //Lo devuelvo
            return cartasDar;
 
        }
 
        //solo en caso de error
        return null;
 
    }
 
    /**
     * Indica el numero de cartas que hay disponibles
     *
     * @return
     */
    public int cartasDisponible() {
        return numCartas - posSiguienteCarta;
    }
 
    /**
     * Muestro las cartas que ya han salido
     */
    public void cartasMonton() {
 
        if (cartasDisponible() == numCartas) {
            System.out.println("No se ha sacado ninguna carta");
        } else {
            //Recorro desde 0 a la posSiguienteCarta
            for (int i = 0; i < posSiguienteCarta; i++) {
                System.out.println(cartas[i]);
            }
        }
 
    }
 
    /**
     * Muestro las cartas que aun no han salido
     */
    public void mostrarBaraja() {
 
        if (cartasDisponible() == 0) {
            System.out.println("No hay cartas que mostrar");
        } else {
            for (int i = posSiguienteCarta; i < cartas.length; i++) {
                System.out.println(cartas[i]);
            }
        }
 
    }
 
}
