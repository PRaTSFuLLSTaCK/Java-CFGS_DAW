package convertirDecimalABinario;

/*
 * 
 * 5) Crea una aplicación que nos convierta un número en base decimal a binario. 
 * Esto lo realizara un método al que le pasaremos el numero como parámetro, devolverá un String con el numero convertido a binario. 
 * Para convertir un numero decimal a binario, debemos dividir entre 2 el numero y el resultado de esa división se divide entre 2 de nuevo hasta que no se pueda dividir mas, 
 * el resto que obtengamos de cada división formara el numero binario, de abajo a arriba.
 * 
 */

import javax.swing.JOptionPane;

public class ConvertirDecimalBinario {
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Introduce un numero");
        int numero=Integer.parseInt(texto);
        String binario=decimalBinario(numero);
        System.out.println("El numero "+numero+ " en binario es "+binario);
    }
   public static String decimalBinario (int numero){
        String binario="";
        String digito;
        for(int i=numero;i>0;i/=2){
            if(i%2==1){
                digito="1";
            }else{
                digito="0";
            }
            //Se añade el digito al principio (mira la imagen del post)
            binario=digito+binario;
        }
        return binario;
    }
}
