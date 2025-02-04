package Prog_Tarea03_01;


import java.util.Scanner;
/**
 * @author José Luis
 * @version 3.1
 */
public class Tarea3_01 {

    public static void main(String[] args) {
        // Creamos variable que reciba los datos por teclado
        Scanner dato = new Scanner( System.in );
        // Creamos 'a' de tipo 'Persona'
        Persona a=new Persona();
        // Creamos variable 'persona' de tipo String
        String persona;
        // Preguntamos el nombre de la persona y lo introducimos en 'persona'
        System.out.println("Introduzca el nombre de la persona ");
        persona=dato.nextLine();
        // Asignamos a 'a' el valor de 'persona' para su variable 'nombre'
        a.cambia_Nombre(persona);
        // Mostramos por pantalla el valor de 'nombre' que posee 'a'
        System.out.print("El nombre de la persona introducida es ");
        System.out.println(a.consulta_Nombre());
    }
}

