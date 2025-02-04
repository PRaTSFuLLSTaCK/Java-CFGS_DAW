package Prog_Tarea04_02;

import java.io.*;

/**
 *
 * @author José Luis
 */
public class complejas {
    static BufferedReader opcion = new BufferedReader(new InputStreamReader(System.in));
    static void inicio(){
        int op=0;
        String car="";
        while(op<1 || op>3){
            System.out.println("Operaciones complejas:\n");
            System.out.println("a - Potencia");
            System.out.println("b - Raiz cuadrada");
            System.out.println("c - Volver");
            try{
                car=opcion.readLine();
                op = car.charAt(0);
                op-=96;
                if(op<1 || op>5) System.err.println("Sólo son válidas los caracteres 'a', 'b' y 'c'");
            }catch(IOException e){
                System.err.println("Error en la entrada de datos");
            }catch(NumberFormatException e){
                System.err.println("Sólo son válidos los caracteres 'a', 'b' y 'c'");
            }
            switch(op){
                case 1:
                    System.out.println("¡Potencia!");
                    op=0;
                    boolean error=true;
                    while(error){
                        error=false;
                        try{
                            System.out.print("Introduzca la base:");
                            float op1=Float.parseFloat(opcion.readLine());
                            System.out.printf("\nIntroduzca el exponente:");
                            float op2=Float.parseFloat(opcion.readLine());
                            double res=Math.pow(op1,op2);
                            System.out.printf("\nEl número %.2f elevado a %.2f es igual a %.2f\n",op1,op2,res);
                        } catch(IOException e){
                            System.err.println("Error en la entrada de datos");
                        } catch(NumberFormatException e){
                            System.err.println("Sólo valores numéricos");
                            error=true;
                        }
                    }
                    break;
                case 2:
                    System.out.println("¡Raiz cuadrada!");
                    op=0;
                    boolean error2=true;
                    while(error2){
                        error2=false;
                        try{
                            System.out.print("Introduzca el radicando:");
                            float op1=Float.parseFloat(opcion.readLine());
                            double res=Math.sqrt(op1);
                            System.out.printf("\nLa raiz cuadrada del número %.2f es igual a %.2f\n",op1,res);
                        } catch(IOException e){
                            System.err.println("Error en la entrada de datos");
                        } catch(NumberFormatException e){
                            System.err.println("Sólo valores numéricos");
                            error2=true;
                        }
                    }
                    break;
                case 3:
                    System.out.println("¡Hasta pronto!");
            }
        }
    }
	public static void inicio1() {
		// TODO Auto-generated method stub
		
	}
}

