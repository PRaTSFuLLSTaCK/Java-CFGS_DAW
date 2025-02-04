package Prog_Tarea04_03;

/*Ejercicio 3
Crea un proyecto que contenga una clase Libro y una clase Principal en un paquete llamado
biblioteca y pruebe todos sus métodos.
• La clase Libro contendrá tres atributos private de tipo String:
• titulo: el título del libro.
• autor: el autor del libro.
• isbn: el código ISBN del libro.*/

import java.io.*;
/**
 *
 * @author José Luis
 * @version 4.3
 */
public class Principal {
    static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
    static Libro li = new Libro();
        public static void main(String[] args) {
            int opcion=0;
            do{
                try{
                    System.out.println("  menu de opciones  ");
                    System.out.println("--------------------");
                    System.out.println("1 - Introducir datos del libro");
                    System.out.println("2 - Consultar datos del libro");
                    System.out.println("0 - Salir ");
                    System.out.println("--------------------");
                    System.out.println("  Qué desea hacer?  ");
                    opcion=Integer.parseInt(dato.readLine());
                    if(opcion == 1)introDatos();
                    if(opcion == 2)consulDatos();
                }catch (NumberFormatException nfe){
                    System.err.println("Sólo son válidos valores enteros entre 0 y 2");
                }catch (IOException ioe){
                    System.err.println("Error en la entrada de datos");
                }catch (IllegalArgumentException iae){
                    System.err.println("ISBN No válido");
                }
            }while(opcion != 0);
            
//            li.cambia_isbn("84-481-2231-3");
//            System.out.println(li.consulta_isbn());
    }
    public static void introDatos(){
        int opcion1=0;
        String nom,aut,isb;
        do{
            try{
                System.out.println("  Introducir datos  ");
                System.out.println("--------------------");
                System.out.println("1 - Introducir nombre del libro");
                System.out.println("2 - Introducir autor del libro");
                System.out.println("3 - Introducir ISBN del libro");
                System.out.println("4 - Introducir todos los datos del libro");
                System.out.println("0 - Salir ");
                System.out.println("--------------------");
                System.out.println("  Qué desea hacer?  ");
                opcion1=Integer.parseInt(dato.readLine());
                switch(opcion1){
                    case 1:
                        System.out.println("Introduzca el título del libro");
                        nom=dato.readLine();
                        li.cambia_titulo(nom);
                        break;
                    case 2:
                        System.out.println("Introduzca el autor del libro");
                        aut=dato.readLine();
                        li.cambia_autor(aut);
                        break;
                    case 3:
                        System.out.println("Introduzca el isbn del libro");
                        isb=dato.readLine();
                        li.cambia_isbn(isb);
                        break;
                    case 4:
                        System.out.println("Introduzca el título del libro");
                        nom=dato.readLine();
                        System.out.println("Introduzca el autor del libro");
                        aut=dato.readLine();
                        System.out.println("Introduzca el isbn del libro");
                        isb=dato.readLine();
                        li.Libro(nom,aut,isb);
                        break;
                    default:
                        if(opcion1 != 0) System.err.println("Sólo valores enteros entre 0 y 4");
                        break;
                }
                }catch (NumberFormatException nfe){
                    System.err.println("Sólo son válidos valores enteros entre 0 y 4");
                }catch (IOException ioe){
                    System.err.println("Error en la entrada de datos");
                }catch (IllegalArgumentException iae){
                    System.err.println("ISBN No válido");
                }
        }while(opcion1 != 0);
    }
    public static void consulDatos(){
        int opcion2=0;
        String nom,aut,isb;
        do{
            try{
                System.out.println("  Mostrar datos  ");
                System.out.println("--------------------");
                System.out.println("1 - Mostrar nombre del libro");
                System.out.println("2 - Mostrar autor del libro");
                System.out.println("3 - Mostrar ISBN del libro");
                System.out.println("4 - Mostrar todos los datos del libro");
                System.out.println("0 - Salir ");
                System.out.println("--------------------");
                System.out.println("  Qué desea hacer?  ");
                opcion2=Integer.parseInt(dato.readLine());
                switch(opcion2){
                    case 1:
                        System.out.printf("El título del libro es %s\n",li.consulta_titulo());
                        break;
                    case 2:
                        System.out.printf("El autor del libro es %s\n",li.consulta_autor());
                        break;
                    case 3:
                        System.out.printf("El isbn del libro es %s\n",li.consulta_isbn());
                        break;
                    case 4:
                        System.out.printf("Título: %s, Autor: %s, ISBN: %s\n",li.consulta_titulo(),li.consulta_autor(),li.consulta_isbn());
                        break;
                    default:
                        if(opcion2 != 0) System.err.println("Sólo valores enteros entre 0 y 4");
                        break;
                }
                }catch (NumberFormatException nfe){
                    System.err.println("Sólo son válidos valores enteros entre 0 y 4");
                }catch (IOException ioe){
                    System.err.println("Error en la entrada de datos");
                }catch (IllegalArgumentException iae){
                    System.err.println("ISBN No válido");
                }
        }while(opcion2 != 0);
        
    }
}
