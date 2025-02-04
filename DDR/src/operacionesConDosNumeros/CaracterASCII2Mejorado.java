package operacionesConDosNumeros;

import javax.swing.JOptionPane;
public class CaracterASCII2Mejorado {
 
    public static void main(String[] args) {
 
         
        String texto=JOptionPane.showInputDialog("Introduce un caracter ASCII");
        //Pasamos el String a char con el metodo charAt
        char caracter=texto.charAt(0);
  
        //Pasamos el caracter a codigo
        int codigo=(int)caracter;
  
        System.out.println(codigo);
    }
}
