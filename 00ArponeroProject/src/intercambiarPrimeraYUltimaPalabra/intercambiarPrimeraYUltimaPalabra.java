package intercambiarPrimeraYUltimaPalabra;

import javax.swing.JOptionPane;


public class intercambiarPrimeraYUltimaPalabra {

    //Esta función divide la frase en tres partes:
    // 1. primera palabra
    // 2. desde la segunda palabra hasta la penúltima
    // 3. última palabra
    // y devuelve la frase poniendo las partes en el orden 3-2-1
    static String invierte(String cadena){
        String parte1,parte2,parte3;
        
        //Primero comprueba que haya al menos un espacio
        if (cadena.indexOf(" ")!=-1){
            parte1=cadena.substring(0,cadena.indexOf(" "));
            parte2=cadena.substring(cadena.indexOf(" "),cadena.lastIndexOf(" ")+1);
            parte3=cadena.substring(cadena.lastIndexOf(" "),cadena.length());
            
            return parte3+parte2+parte1;
            
        } else {
            //sino hay ningún espacio quiere decir que se trataba de una sola palabra
            //así que la devuelvo tal cual
            return cadena;
        }
        
        
    } 
    public static void main(String[] args) {
        String frase;
        
        frase=JOptionPane.showInputDialog("Introduzca una frase (al menos de dos palabras)");
        System.out.println("Cadena invirtiendo primer y última palabras: "+invierte(frase));
    }
    
}
