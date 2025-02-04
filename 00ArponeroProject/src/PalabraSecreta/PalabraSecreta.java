package PalabraSecreta;

import javax.swing.JOptionPane;

public class PalabraSecreta {


    public static void main(String[] args) {
       int intentos=0;
       String secreta, palabra;
       
       secreta=JOptionPane.showInputDialog("Introduzca la palabra secreta");
       do{
           palabra=JOptionPane.showInputDialog("Intenta averiguar la palabra, intento: "+(intentos+1)); 
           //Se seguirán dando oportunidades mientras que el usuario no acierte ni consuma los 3 intentos
       } while (!palabra.equalsIgnoreCase(secreta) && ++intentos<3);
       if (intentos==3){
           JOptionPane.showMessageDialog(null, "Lo siento, la palabra secreta era: "+secreta);
       } else {
           JOptionPane.showMessageDialog(null, "Enhorabuena!!");
       }
    }
    
}
