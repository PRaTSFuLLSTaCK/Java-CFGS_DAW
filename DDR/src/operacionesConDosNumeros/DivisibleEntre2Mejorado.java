package operacionesConDosNumeros;

import javax.swing.JOptionPane;
public class DivisibleEntre2Mejorado {
 
    public static void main(String[] args) {
 
        String texto=JOptionPane.showInputDialog("Introduce un numero");
        //Pasamos el String a int
        int numero=Integer.parseInt(texto);
 
        //Comprobamos si es divisible entre 2, es decir, si el resto de la division es 0
        if (numero%2==0){
            System.out.println("El numero "+numero+" es divisible entre 2");
        }else{
            System.out.println("El numero "+numero+" no es divisible entre 2");
        }
    }
}
