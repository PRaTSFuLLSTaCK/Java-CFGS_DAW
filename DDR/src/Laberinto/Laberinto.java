package Laberinto;

import java.util.ArrayList;
 
public class Laberinto {
 
    private Casilla[][] tablero;
 
    private ArrayList<ArrayList<Casilla>> caminos;
 
    public Laberinto(Casilla[][] tablero) {
        this.tablero = tablero;
        caminos = new ArrayList<>();
    }
 
    /**
     * Indica si se puede mover hacia arriba
     * @param casillaActual
     * @param casillaDestino
     * @return 
     */
    public boolean arribaDisponible(Casilla casillaActual, Casilla casillaDestino) {
 
        if (casillaDestino != null && !casillaDestino.isVisitado()) {
            return casillaActual.arribaDisponible();
        }
 
        return false;
    }
 
    /**
     * Indica si se puede mover hacia la derecha
     * @param casillaActual
     * @param casillaDestino
     * @return 
     */
    public boolean derechaDisponible(Casilla casillaActual, Casilla casillaDestino) {
 
        if (casillaDestino != null && !casillaDestino.isVisitado()) {
            return casillaActual.derechaDisponible();
        }
 
        return false;
    }
 
    /**
     * Indica si se puede mover hacia abajo
     * @param casillaActual
     * @param casillaDestino
     * @return 
     */
    public boolean abajoDisponible(Casilla casillaActual, Casilla casillaDestino) {
 
        if (casillaDestino != null && !casillaDestino.isVisitado()) {
            return casillaActual.abajoDisponible();
        }
 
        return false;
    }
 
    /**
     * Indica si se puede mover hacia la izquierda
     * @param casillaActual
     * @param casillaDestino
     * @return 
     */
    public boolean izquierdaDisponible(Casilla casillaActual, Casilla casillaDestino) {
 
        if (casillaDestino != null && !casillaDestino.isVisitado()) {
            return casillaActual.izquierdaDisponible();
        }
 
        return false;
    }
 
    /**
     * Coge la casilla indicada
     * @param x
     * @param y
     * @return 
     */
    public Casilla getCasillaAt(int x, int y) {
        if (dentroDelLimite(x, y)) {
            return tablero[x][y];
        }
        return null;
    }
 
    /**
     * Indica si esta dentro del limite
     * @param x
     * @param y
     * @return 
     */
    public boolean dentroDelLimite(int x, int y) {
 
        return (x >= 0 && x < tablero.length) && (y >= 0 && y < tablero[0].length);
 
    }
 
    /**
     * añade un camino a la solucion
     * @param camino 
     */
    public void añadirCamino(ArrayList<Casilla> camino) {
        if (camino != null && !camino.isEmpty()) {
            caminos.add(camino);
        }
    }
 
    /**
     * Muestra los caminos
     */
    public void mostrarCaminos() {
 
        int i = 1;
        for (ArrayList<Casilla> camino : caminos) {
            System.out.println("Camino: " + i);
            for (Casilla c : camino) {
                System.out.println(c);
            }
            i++;
        }
 
    }
 
}
