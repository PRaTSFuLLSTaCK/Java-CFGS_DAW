package numeroDeCifras;

/*
 * 
 * 6) Crea una aplicación que nos cuente el número de cifras de un número entero positivo (hay que controlarlo) pedido por teclado. 
 * Crea un método que realice esta acción, pasando el número por parámetro, devolverá el número de cifras.
 * 
 */

import javax.swing.JOptionPane;

public class NumeroCifras {
    public static void main(String[] args) {
        int numero=0;
        do{
            String texto=JOptionPane.showInputDialog("Introduce un numero positivo");
            numero=Integer.parseInt(texto);
        }while(numero<0);
        int numCifras=cuentaCifras(numero);
        //Controlamos en el caso de que haya una cifra o mas
        if (numCifras==1){
            System.out.println("El numero "+numero+ " tiene "+numCifras+" cifra");
        }else{
            System.out.println("El numero "+numero+ " tiene "+numCifras+" cifras");
        }
    }
    public static int cuentaCifras (int numero){
         int contador=0;
         for (int i=numero;i>0;i/=10){
             //Incrementamos el contador
             contador++;
         }
         return contador;
    }
}
