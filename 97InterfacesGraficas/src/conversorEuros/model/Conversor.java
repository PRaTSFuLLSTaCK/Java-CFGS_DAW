/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

public class Conversor {

    private Moneda monedaBase;
    public static ArrayList<Moneda> llistaMonedes = new ArrayList();

    public Conversor(Moneda monedaBase, Moneda altraMoneda) {
        this.monedaBase = monedaBase;

        llistaMonedes.add(monedaBase);
        llistaMonedes.add(altraMoneda);
    }

    public void setLlistaMonedes(Moneda moneda) {
        llistaMonedes.add(moneda);
        Conversor.llistaMonedes = llistaMonedes;
    }

    public ArrayList<Moneda> getLlistaMonedes() {
        return llistaMonedes;
    }

    
    public Conversor() {

    }

    public String getNomMonedaBase() {
        return this.monedaBase.getNom();
    }

    /**
     * Metode que fa la operacio de canvi de la quantitat introduida en valor
     * moneda origen a la moneda desti, despres torna el resultat
     *
     * @param monedaOrigen
     * @param monedaDesti
     * @param quantitat
     * @return double
     */
    public double canvi(Moneda monedaOrigen, Moneda monedaDesti, double quantitat) {
        double canvi = ((quantitat * monedaOrigen.getValor()) / monedaDesti.getValor());
        return canvi;
    }

    /**
     * Agafa la moneda que li arriba i la introdueix el el arrayList
     *
     * @param monedaNova
     */
    public boolean afegirMoneda(Moneda monedaNova) {
        boolean afegit = false;
        for (int i = 0; i < this.getLlistaMonedes().size(); i++) {
            if(getLlistaMonedes().get(i).getNom().equals(monedaNova.getNom())){
                afegit = true;
                break;
            }
        }
        if(afegit == false){
        llistaMonedes.add(monedaNova);
        }
        return afegit;
    }

    /**
     * Canvia en la moneda que hi ha en la posicio introduida del array per la
     * nova moneda que li arriba.
     *
     * @param pos
     * @param moneda
     */
    public void ModificarMoneda(int pos, Moneda moneda) {
        llistaMonedes.set(pos, moneda);
    }

    /**
     * elimina el objecte que li arriba del array
     *
     * @param moneda
     */
    public void eliminarMoneda(Moneda moneda) {
        this.llistaMonedes.remove(moneda);
    }
}
