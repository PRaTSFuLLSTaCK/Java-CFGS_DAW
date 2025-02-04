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

public class POOrra implements Constantes{
     
    private double bote;
     
    public POOrra(){
        bote=0;
    }
     
    /**
     * Aumenta la cantidad del bote
     * @param dinero 
     */
    public void aumentarBote(double dinero){
        bote+=dinero;
    }
     
    /**
     * Dejamos el bote a 0
     */
    public void vacirBote(){
        bote=0;
    }
     
    /**
     * Metodo principal que simula el transcurso de la porra
     */
    public void jornadas(){
         
        Resultados resultados = new Resultados();
        String[] partidos;
         
        //Recorremos las jornadas
        for(int i=0;i<NUMERO_JORNADAS;i++){
             
            System.out.println("JORNADA "+(i+1));
            System.out.println("");
             
            //Apuesta
            for(int j=0;j<JUGADORES.length;j++){
                //Si un jugador puede pagar
                if(JUGADORES[j].puedePagar()){
                    //el jugador paga, dice sus resultados y el bote se aumenta
                    JUGADORES[j].ponerEnElBote();
                    JUGADORES[j].generarResultados();
                    aumentarBote(DINERO_CADA_JORNADA);
                }else{
                    //Si no puede pagar, los resultados se vacian
                    JUGADORES[j].reiniciarResultados();
                }
                 
            }
             
             
            //Partido
            resultados.generarResultados();
            partidos = resultados.getPartidos();
             
            //Comprobacion
            for(int j=0;j<JUGADORES.length;j++){
                //Indica si ha acertado
                if (JUGADORES[j].haAcertadoPorra(partidos)){
                    //Le damos el bota al jugador y vaciamos el bote
                    JUGADORES[j].ganarBote(bote);
                    vacirBote();
                }
                 
            }
             
            System.out.println("");
            System.out.println("");
             
            System.out.println(toString());
             
            System.out.println("");
            System.out.println("");
             
        }
         
        //Motramos el estado de los jugadores
        for(int i=0;i<JUGADORES.length;i++){
            System.out.println(JUGADORES[i]);
        }
         
    }
 
    @Override
    public String toString() {
        return "En la POOrra hay de bote" + bote + " euro/s";
    }
     
}
