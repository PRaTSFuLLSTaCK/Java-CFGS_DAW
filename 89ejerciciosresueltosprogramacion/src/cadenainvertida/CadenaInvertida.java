package cadenainvertida;

import javax.swing.JOptionPane;


public class CadenaInvertida {

    static String espejo(String original){
        int i;
        String nueva="";
        
        for (i=original.length()-1 ; i >= 0 ; i--){
            nueva=nueva+original.charAt(i);
        }
        return original+nueva;
    }
    
    public static void main(String[] args) {
       String cadena;
       
       cadena=JOptionPane.showInputDialog("Introduza una cadena");
       System.out.println("Resultado: "+espejo(cadena));
    }
}