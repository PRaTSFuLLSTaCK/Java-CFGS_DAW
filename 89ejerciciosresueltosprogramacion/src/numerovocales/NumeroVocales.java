package numerovocales;

import javax.swing.JOptionPane;


public class NumeroVocales {

    static int cuentaVocales(String cadena){
        int suma=0,i;
        
        //Para evitar comparar minúscula y mayúsculas de forma separada
        //transformo toda la cadena a minúsculas
        cadena=cadena.toLowerCase();
        for (i=0 ; i < cadena.length() ; i++){
            if (cadena.charAt(i)=='a' || 
                cadena.charAt(i)=='e' ||
                cadena.charAt(i)=='i' || 
                cadena.charAt(i)=='o' || 
                cadena.charAt(i)=='u') {
                suma++;
            }
        }
        return suma;
    }
    
    public static void main(String[] args) {
        String cadena;
        
        //Pido al usuario una palabra o frase
        cadena=JOptionPane.showInputDialog("Introduce una palabra o frase:");
        //Y muestro el número de vocales que contiene dicha palabra o frase 
        //haciendo uso de la funcion "cuentaVocales" creada más arriba
        System.out.println("El número de vocales de la cadena es: "+cuentaVocales(cadena));
    }
    
}
