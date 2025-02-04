package ejemploInterface01;

public class Cucu extends Reloj implements Parlanchin{
    public void habla(){
	    System.out.println("¡Cucu, cucu, ..!");
    }
    
    public void atrasar_hora() {
	    System.out.println("Atrasando el reloj una hora.");
    }
}
