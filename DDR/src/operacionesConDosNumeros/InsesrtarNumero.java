package operacionesConDosNumeros;

import java.util.Scanner;

public class InsesrtarNumero {
 
    public static void main(String[] args) {
        
        //Pedimos el numero
       Scanner sn=new Scanner(System.in);
       int num=sn.nextInt();
        
       int contador=0;
        
       //Hasta que no se introduzca -1 no se sale
       while(num!=-1){
            
           contador++;
            
           num=sn.nextInt(); //Pedimos de nuevo el número
            
       }
         
       System.out.println("Fin, se ha introducido "+contador+" numeros");
        
    }
     
}
