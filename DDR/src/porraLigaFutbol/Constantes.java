package porraLigaFutbol;

/*
 * 
 * 11) Estando en un grupo de amigos, se planea hacer una porra de la liga de fútbol. A nosotros se nos ocurre hacer un programa en POO para simular como podría desarrollarse la porra.

Cada jugador de la porra, pone un 1 euro cada jornada y decide el resultado de los partidos acordados.

Si nadie acierta en una jornada los resultados, el bote se acumula.

En principio, deben acertar el resultado de dos partidos para llevarse el dinero del bote de la porra.

Todos empiezan con un dinero inicial que será decidido por el programador (ya sea como parámetro o como constante). Si el jugador no tiene dinero en una jornada no podrá jugar la porra.

Para esta versión, entre jugadores podrán repetir resultados repetidos, por lo que el jugador que primero diga ese resultado (tal como estén de orden) se llevara primero el bote.

Los resultados de la porra serán generados aleatoriamente, tanto los de jugador como los de los partidos (no es necesario nombre, solo resultados).

Al final del programa, se deberá mostrar el dinero que tienen los jugadores y el número de veces que han ganado.

Para este ejercicio, recomiendo usar interfaces (no hablo de interfaces gráficas) para las constantes y métodos que sean necesarios.
 * 
 */

public interface Constantes {
    public final int NUMERO_PARTIDOS=2;
     
    public final int NUMERO_JORNADAS=38;
    public final double DINERO_INICIAL=35;
     
    public final int RESULTADO_MINIMO=0;
    public final int RESULTADO_MAXIMO=3;
     
    public final double DINERO_CADA_JORNADA=1;
     
    public final Jugador[] JUGADORES={ 
                                    new Jugador("Make"),
                                    new Jugador("JuanMa"),
                                    new Jugador("Fernando"),
                                    new Jugador("Alberto"),
                                    new Jugador("Lorente"),
                                    new Jugador("Adrian"),
                                    new Jugador("Maria"),
                                    new Jugador("Parra"),
                                    new Jugador("Pablo"),
                                    new Jugador("Prieto"),
                                    new Jugador("Ruben"),
                                    new Jugador("Jony"),
                                    new Jugador("Fran"),
                                    new Jugador("Isidoro"),
                                    new Jugador("Rafa")
                                };
}
