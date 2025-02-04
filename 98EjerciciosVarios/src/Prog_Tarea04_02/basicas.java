package Prog_Tarea04_02;

import java.io.*;

/**
 *
 * @author José Luis
 * @version 4.2
 */
public class basicas {
    static BufferedReader opcion = new BufferedReader(new InputStreamReader(System.in));
    static void inicio(){
        int op=0;
        String car="";
        while(op<1){
            System.out.println("Operaciones básicas:\n");
            System.out.println("a - Suma");
            System.out.println("b - Resta");
            System.out.println("c - Producto");
            System.out.println("d - División");
            System.out.println("e - Volver");
            try{
                car=opcion.readLine();
                op = car.charAt(0);
                op-=96;
                if(op<1 || op>5) System.err.println("Sólo son válidas los caracteres 'a', 'b', 'c', 'd' y 'e'");
            }catch(IOException e){
                System.err.println("Error en la entrada de datos");
            }catch(NumberFormatException e){
                System.err.println("Sólo son válidos los caracteres 'a', 'b', 'c', 'd' y 'e'");
            }
            try{
                switch(op){
                    case 1:
                        System.out.println("¡Suma!");
                        op=0;
                        System.out.print("Introduzca el primer sumando: ");
                        float suma1=Float.parseFloat(opcion.readLine());
                        System.out.print("Introduzca el segundo sumando: ");
                        float suma2=Float.parseFloat(opcion.readLine());
                        System.out.printf("La suma de %.2f mas %.2f es igual a %.2f\n\n",suma1,suma2,suma1+suma2);
                        break;
                    case 2:
                        System.out.println("¡Resta!");
                        op=0;
                        System.out.print("Introduzca el minuendo: ");
                        float resta1=Float.parseFloat(opcion.readLine());
                        System.out.print("Introduzca el sustraendo: ");
                        float resta2=Float.parseFloat(opcion.readLine());
                        System.out.printf("La resta de %.2f menos %.2f es igual a %.2f\n\n",resta1,resta2,resta1-resta2);
                        break;
                    case 3:
                        System.out.println("¡Multiplicación!");
                        op=0;
                        System.out.print("Introduzca el multiplicando: ");
                        float por1=Float.parseFloat(opcion.readLine());
                        System.out.print("Introduzca el multiplicador: ");
                        float por2=Float.parseFloat(opcion.readLine());
                        System.out.printf("La multiplicación de %.2f por %.2f es igual a %.2f\n",por1,por2,por1*por2);
                        break;
                    case 4:
                        System.out.println("¡División!");
                        op=0;
                        System.out.print("Introduzca el dividendo: ");
                        float div1=Float.parseFloat(opcion.readLine());
                        System.out.print("Introduzca el divisor: ");
                        float div2=Float.parseFloat(opcion.readLine());
                        System.out.printf("La divsión de %.2f entre %.2f es igual a %.2f\n",div1,div2,div1/div2);
                        break;
                    case 5:
                        System.out.println("¡Hasta pronto!");
                }
            }catch(IOException e){
                System.err.println("Error en la entrada de datos");
            }catch(NumberFormatException e){
                System.err.println("Sólo se admiten valores numéricos");
            }
        }
    }
	public static void inicio1() {
		// TODO Auto-generated method stub
		
	}
}

