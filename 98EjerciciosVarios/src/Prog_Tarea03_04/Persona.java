package Prog_Tarea03_04;

/**
 * @author José Luis
 * @version 3.4
 */
public class Persona {
    String nombre;
    int edad;
    float altura;

    // Constructor sin argumentos que aprovechamos para asignarle
    // unos valores iniciales
    public Persona(){
        nombre="Luisa Pérez";
        edad=22;
        altura=1.70f;
    }

    // Constructor con todos los argumentos que nos permite asignar los
    // valores que le enviemos.
    // Utilizamos el operador this para distinguir los atributos de la clase Persona
    // de los valores enviados por parámetro
    public Persona(String nombre,int edad,float altura){
        this.nombre=nombre;
        this.edad=edad;
        this.altura=altura;
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


