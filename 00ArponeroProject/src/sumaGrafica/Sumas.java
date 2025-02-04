/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaGrafica;

/**
 *
 * @author Anthony
 */
public class Sumas {
    int numero1;
    int numero2;

    public Sumas(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public int sumar(){
        return getNumero1()+getNumero2();
    }
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    
}
