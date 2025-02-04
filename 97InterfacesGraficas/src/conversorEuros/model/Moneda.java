
package model;

public class Moneda {
    private String nom;
    private double valor;
/**
 * Inicia el objecte moneda
 * @param nom
 * @param valorMonedaBase 
 */
    public Moneda(String nom, double valorMonedaBase) {
        this.nom = nom;
        this.valor = valorMonedaBase;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
