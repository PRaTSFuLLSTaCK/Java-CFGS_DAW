package ejemploInterface02;

public abstract class Reloj {
}

class Cucu extends Reloj implements Parlanchin{
    public void habla(){
        System.out.println("¡Cucu, cucu, ..!");
    }
}
