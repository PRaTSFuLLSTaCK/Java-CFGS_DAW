package Prog_Tarea03_03;

/**
 * @author José Luis
 * @version 3.3
 */
public class Persona {
    //Declaramos las variables iniciales
    String nombre;
    int edad;
    float altura;
    //Constructor que aplica valores iniciales a las variables
    public Persona (){
        nombre="Luisa Pérez";
        edad=22;
        altura=1.70f;
    }

    //devolver valores
    String consulta_Nombre(){
        return nombre;
    }
    int consulta_edad(){
        return edad;
    }
    float consulta_altura(){
        return altura;
    }
    //asignar valores
    void cambia_Nombre(String nom){
        this.nombre=nom;
    }
    void cambia_edad(int edad){
        this.edad=edad;
    }
    void cambia_altura(float altura){
        this.altura=altura;
    }
}


