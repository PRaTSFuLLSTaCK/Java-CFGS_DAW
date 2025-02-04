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

public class Jugador implements Constantes, MetodosInterfaz{
  
    private String nombre;
    private double dinero;
    private int porrasGanadas;
    private String[] resultados;
     
    public Jugador(String nombre){
        this.nombre=nombre;
        this.dinero = DINERO_INICIAL;
        this.porrasGanadas=0;
        this.resultados = new String[NUMERO_PARTIDOS];
        reiniciarResultados();
    }
     
    public void reiniciarResultados(){
         
        for(int i=0;i<resultados.length;i++){
            resultados[i]="";
        }
         
    }
     
    public boolean puedePagar(){
        return dinero>=DINERO_CADA_JORNADA;
    }
     
    public void ponerEnElBote(){
        dinero-=DINERO_CADA_JORNADA;
        System.out.println("Jugador "+nombre+" ha puesto "+DINERO_CADA_JORNADA+" euro/s y le queda "+dinero+" euro/s");
    }
     
    public void ganarBote(double bote){
        dinero+=bote;
        porrasGanadas++;
        System.out.println("Jugador "+nombre+" ha ganado "+bote+" euro/s y tiene "+dinero+" euro/s");
    }
     
    @Override
    public void generarResultados() {
         
        int pLocal, pVisitante;
         
        for(int i=0;i<resultados.length;i++){
            pLocal = Metodos.generaNumeroAleatorio(RESULTADO_MINIMO, RESULTADO_MAXIMO);
            pVisitante = Metodos.generaNumeroAleatorio(RESULTADO_MINIMO, RESULTADO_MAXIMO);
             
            resultados[i] = pLocal +" - "+pVisitante;
             
            System.out.println("El Jugador "+nombre+" ha elegido el resultado "+resultados[i]);
             
        }
        System.out.println("");
    }
     
    public boolean haAcertadoPorra(String[] resultados_partidos){
         
        for(int i=0;i<resultados.length;i++){
            if(!resultados[i].equals(resultados_partidos[i])){
                return false;
            }    
        }
        return true;
         
    }
     
 
    @Override
    public String toString() {
        return "El jugador " + nombre + " tiene dinero=" + dinero + " y ha ganado " + porrasGanadas + " porra/s";
    }
     
}
