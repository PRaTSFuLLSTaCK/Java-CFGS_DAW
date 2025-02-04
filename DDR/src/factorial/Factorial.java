package factorial;

/*
 * 
 * 4) Crea una aplicación que nos calcule el factorial de un número pedido por teclado, lo realizara mediante un método al que le pasamos el número como parámetro. 
 * Para calcular el factorial, se multiplica los números anteriores hasta llegar a uno. 
 * 
 * Por ejemplo, si introducimos un 5, realizara esta operación 5*4*3*2*1=120.
 */

import javax.swing.JOptionPane;

public class Factorial {
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Introduce un numero");
        int numero=Integer.parseInt(texto);
        System.out.println("El factorial de "+numero+ " es " +factorial(numero));
    }
   public static int factorial (int numero){
        int res=numero;
        //Se inicia con el numero anterior al que introducimos
        for(int cont=(numero-1);cont>0;cont--){
            //Acumulamos el resultado
            res=res*cont;
        }
        return res;
    }
}
