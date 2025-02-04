package escaleraNumeros;

/*
 * 
 * 4) Crea una aplicación que dibuje una escalera de números, siendo cada linea números empezando en uno y acabando en el numero de la linea.
 *  Este es un ejemplo, si introducimos un 5 como altura:
 * 
 */

import javax.swing.JOptionPane;public class EscaleraNumeros2 {
	 
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Escribe una altura");
        int altura=Integer.parseInt(texto);
        dibujaEscaleraNumeros(altura);
    }   
 
    public static void dibujaEscaleraNumeros (int altura){
        for (int numero=1;numero<=altura;numero++){
            //Este bucle muestra los numeros en cada fila
            for(int i=1;i<=numero;i++){
                System.out.print(i);
            }
            //Saltamos de linea
            System.out.println("");
        }
    }
}