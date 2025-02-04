package operacionesConDosNumeros;

import javax.swing.JOptionPane;
public class RadioCirculo2 {
 
    public static void main(String[] args) {
 
        String texto=JOptionPane.showInputDialog("Introduce un radio");
        //Pasamos el String a double
        double radio=Double.parseDouble(texto);
 
        //Formula area circulo, usamos algunos de los metodos de Math
        double area=Math.PI*Math.pow(radio, 2);
 
        System.out.println("El area del circulo es "+area);
    }
}
