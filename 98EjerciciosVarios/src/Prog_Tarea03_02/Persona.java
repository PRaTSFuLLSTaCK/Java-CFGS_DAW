package Prog_Tarea03_02;
/**
 * @author José Luis
 * @version 3.2
 */
public class Persona {
    String nombre;
    int edad;
    float altura;
    
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
        nombre=nom;
    }
    void cambia_edad(int edad){
        this.edad=edad;
    }
    void cambia_altura(float altura){
        this.altura=altura;
    }
}

