package Prog_Tarea03_04;

import java.io.*;
/**
 * @author José Luis
 * @version 3.4
 **/
public class operaciones {
    static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
    static Persona a=new Persona();
    static void introDatos() throws IOException{
        int opcion=9;
        while(opcion<0 || opcion>4){
            System.out.println("  menu de opciones  ");
            System.out.println("---------------------");
            System.out.println("1 - Introducir nombre");
            System.out.println("2 - Introducir edad  ");
            System.out.println("3 - Introducir altura");
            System.out.println("4 - Introducir todos los datos");
            System.out.println("0 - Salir");
            System.out.println("---------------------");
            System.out.println("  Qué desea hacer?  ");
            opcion=Integer.parseInt(dato.readLine());
        }
        switch (opcion){
            case 1:
                System.out.println("Introduzca el nombre a incluir");
                String nombr = dato.readLine();
                a.cambia_Nombre(nombr);
                break;
            case 2:
                System.out.println("Introduzca la edad a incluir");
                int eda=Integer.parseInt(dato.readLine());
                a.cambia_edad(eda);
                break;
            case 3:
                System.out.println("Introduzca la altura a incluir");
                float alt=Float.parseFloat(dato.readLine());
                a.cambia_altura(alt);
                break;
            case 4:
                System.out.println("Introduzca el nombre a incluir");
                String nomb = dato.readLine();
                System.out.println("Introduzca la edad a incluir");
                int ed=Integer.parseInt(dato.readLine());
                System.out.println("Introduzca la altura a incluir");
                float al=Float.parseFloat(dato.readLine());
                // Llamamos al método constructor pasándole los parámetros obtenidos
                a=new Persona(nomb,ed,al);
                break;
            default:
                break;
        }
    }
    static void consulDatos() throws IOException{
        int opcion=9;
        while(opcion<0 || opcion>4){
            System.out.println("  menu de opciones  ");
            System.out.println("---------------------");
            System.out.println("1 - consultar nombre");
            System.out.println("2 - consultar edad  ");
            System.out.println("3 - consultar altura");
            System.out.println("4 - consultar todos");
            System.out.println("0 - Salir");
            System.out.println("---------------------");
            System.out.println("  Qué desea hacer?  ");
            opcion=Integer.parseInt(dato.readLine());
        }
        switch (opcion){
            case 1:
                System.out.printf("El nombre es %s\n",a.consulta_Nombre());
                break;
            case 2:
                System.out.printf("La edad es %d\n",a.consulta_edad());
                break;
            case 3:
                System.out.printf("La altura es %.2f\n",a.consulta_altura());
                break;
            case 4:
                System.out.printf("El nombre es %s\n",a.consulta_Nombre());
                System.out.printf("La edad es %d\n",a.consulta_edad());
                System.out.printf("La altura es %.2f\n",a.consulta_altura());
                break;
            default:
                break;
        }
    }    
}

