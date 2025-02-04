package operacionesConDosNumeros;

public class Primeros100NumerosDivisibles2y3For {
	 
    public static void main(String[] args) {
 
        //Definimos el bucle, incluye el 100
        for (int num=1;num<=100;num++){
            //Comprobamos si es divisible entre 2 o 3
            if (num%2==0 || num%3==0){
                System.out.println(num);
            }
        }
    }
}
