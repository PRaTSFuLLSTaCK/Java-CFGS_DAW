package Prog_Tarea03_01;

//1. Construye un proyecto en Java que utilice la clase Persona que se define a continuación:

/*La clase debe incluir un método principal que solicite un valor al usuario y lo introduzca en
el atributo nombre, para posteriormente mostrar por pantalla el nuevo valor del atributo.*/


/**
 * @author José Luis
 * @version 3.1
 */
public class Persona {
    String nombre;
    int edad;
    float altura;

    String consulta_Nombre(){
        return nombre;
    }

    void cambia_Nombre(String nom){
        nombre=nom;
    }
}