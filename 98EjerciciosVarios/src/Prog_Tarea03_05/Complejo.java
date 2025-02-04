package Prog_Tarea03_05;

/**
 * @author José Luis
 * @version 3.5
 */
public class Complejo {
    double real;
    double imag;
    
    public Complejo(){
        real=0;
        imag=0;
    }
    
    public Complejo(double real, double imag){
        this.real=real;
        this.imag=imag;
    }
    
    public double consulta_Real(){
        return real;
    }
    
    public double consulta_Imag(){
        return imag;
    }
    
    public void cambia_Real(double real){
        this.real=real;
    }
    
    public void cambia_Imag(double imag){
        this.imag=imag;
    }
    
    public String toString(){
        return String.valueOf(real)+" + "+String.valueOf(imag)+"i";
    }
    
    public void Sumar(Complejo b){
        double uno,dos;
        uno=b.real+this.real;
        dos=b.imag+this.imag;
        System.out.printf("La parte real (%.2f y %.2f) es igual a %.2f\n", this.real,b.real,uno);
        System.out.printf("La parte imaginaria (%.2f y %.2f) es igual a %.2f\n", this.imag,b.imag,dos);
    }
}

