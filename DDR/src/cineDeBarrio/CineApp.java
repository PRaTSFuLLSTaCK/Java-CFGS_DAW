package cineDeBarrio;

/**
 * @author DiscoDurodeRoer
 */
public class CineApp {

    public static void main(String[] args) {
        
        //Creamos la cola, al crearla ya creamos el numero de personas
        ListaEnlazada<Persona> cola = new ListaEnlazada<>();
        
        //Generamos la cola
        generarCola(cola);
        
        //Creamos variables que nos seran útiles
        double recaudacion;
        double recaudacionTotal=0;
        Persona espectadorActual;
        int edadActual;
        
        //Recorremos la cola
        while(!cola.estaVacia()){
            
            //"Atendemos" al espectador para que pague
            espectadorActual=cola.devolverPrimero();
            edadActual=espectadorActual.getEdad();
            
            //Comprobamosla edad
            if(edadActual>=5 && edadActual<=10){
                recaudacion=1;
            }else if(edadActual>=11 && edadActual<=17){
                recaudacion=2.5;
            }else{
                recaudacion=3.5;
            }
            recaudacionTotal+=recaudacion;
            
            
            System.out.println("Una persona de "+edadActual+" años se le ha cobrado " +recaudacion+ " euros");
            
            //Quitamos al espectador de la cola
            //Tambien hemos podido usar al principio el meotodo devolverYBorrarPrimero();
            cola.quitarPrimero();
            
        }
        
        //Mostramos el resultado
        System.out.println("La recaudación es de "+recaudacionTotal+" euros");
        
    }
    
    /**
     * Genera una cola de personas
     * @param cola
     */
    public static void generarCola(ListaEnlazada<Persona> cola){
        
       int numeroPersonas=generaNumeroAleatorio(1,50);
        
       for(int i=0;i<numeroPersonas;i++){
           cola.insertarUltimo(new Persona(generaNumeroAleatorio(5, 60)));
       } 
        
    }
    
    /**
     * Genera un numero aleatorio entre dos numeros.
     * Entre el minimo y el maximo incluidos
     * @param minimo Número mínimo
     * @param maximo Número máximo
     * @return Número entre minimo y maximo
     */
    public static int generaNumeroAleatorio(int minimo, int maximo){
        
        int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }
    
}
