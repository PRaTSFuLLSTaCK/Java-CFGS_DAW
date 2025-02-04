package calculoLetraDNI;

import javax.swing.JOptionPane;

public class calculoLetraDNI {

    //Esta función devuelve la letra que le corresponde al número de dni que se le 
    //pasa como parámetro
    static char calculaLetra(long numero){
        String letras="TRWAGMYFPDXBNJZSQVHLCKE";    
        int posicion;
        
        //Calculo el resto de la división entre 23 para veriguar la posición 
        //dentro de la cadena de letras definida arriba
        posicion=(int)(numero%23);
        
        //Devuelvo la letra que hay en la posición "posicion" de la cadena de letras
        return letras.charAt(posicion);
    }
    public static void main(String[] args) {
        String dni;
        long numero=0;
        
        dni=JOptionPane.showInputDialog("Introduzca un número de DNI:");
        try{
            numero=Long.parseLong(dni);
            JOptionPane.showMessageDialog(null,"Al número de DNI: "+dni+" le corresponde la letra: "+calculaLetra(numero));
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Formato incorrecto en el dni");
        }   
    } 
}
