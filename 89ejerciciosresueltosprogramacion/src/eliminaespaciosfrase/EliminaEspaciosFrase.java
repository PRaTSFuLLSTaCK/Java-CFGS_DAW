package eliminaespaciosfrase;

import javax.swing.JOptionPane;

public class EliminaEspaciosFrase {

    //Para eliminar los espacios utilizo la función indexOf que 
    //devuelve la posición del primer espacion en blanco a partir
    //de una posición dada.
    //La idea general es componer una nueva frase, pero solo añadiendo 
    //las palabras de la frase original y no los espacios, para marcar el
    //comienzo y final de cada palabra utilizo la función indexOf
    static String eliminaEspacios(String frase){
        String resultado="";
        int i=0,j;
        
        do {
            j=frase.indexOf(" ",i);
            if (j!=-1){
                resultado=resultado+frase.substring(i,j);
                i=j+1;
            } else {
                resultado=resultado+frase.substring(i,frase.length());
            }           
        } while (j!=-1);
        
        return resultado;
    }
    
    public static void main(String[] args) {
        String frase;
        
        frase=JOptionPane.showInputDialog(null, "Introduzca una frase:");
        System.out.println("La frase sin espacios es: "+eliminaEspacios(frase));
    }
}
