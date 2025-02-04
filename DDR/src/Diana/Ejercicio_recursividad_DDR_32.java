package Diana;
public class Ejercicio_recursividad_DDR_32 {
 
    public static void main(String[] args) {
 
        // Zonas donde puedo puntuar
        int zonas[] = {10, 25, 50, 75};
 
        // numero de dardos que lanzo
        int dardos = 5;
        // Regiones con el numero de dardos en cada region
        int regionesDadas[] = new int[zonas.length];
        // puntuacion que se debe llegar
        int puntuacion = 100;
        int etapa = 0;
 
        int solucion[] = new int[zonas.length];
 
        dardosV1(solucion, zonas, regionesDadas, dardos, etapa, 0, puntuacion);
         
        mostrarSolucion(zonas, solucion);
 
    }
 
    public static boolean dardosV1(
            int[] solucion,
            int[] zonas,
            int[] regionesDadas,
            int dardos,
            int etapa,
            int puntuacionActual,
            int puntuacionIgualar
    ) {
 
        boolean fin = false;
 
        if (dardos == 0 || etapa == zonas.length || calcularPuntuacion(zonas, regionesDadas) == puntuacionIgualar) {
 
            if (calcularPuntuacion(zonas, regionesDadas) == puntuacionIgualar) {
                for (int i = 0; i < zonas.length; i++) {
                    solucion[i] = regionesDadas[i];
                }
                fin = true;
            }
 
        } else {
 
            for (int d = 0; d <= dardos && !fin; d++) {
 
                int puntuacionZona = zonas[etapa] * d;
 
                puntuacionActual += puntuacionZona;
 
                if (puntuacionActual <= puntuacionIgualar) {
 
                    regionesDadas[etapa] = d;
 
                    fin = dardosV1(
                            solucion,
                            zonas,
                            regionesDadas,
                            dardos - d,
                            etapa + 1,
                            puntuacionActual,
                            puntuacionIgualar
                    );
 
                    regionesDadas[etapa] = 0;
 
                }
 
            }
 
        }
 
        return fin;
 
    }
 
    /**
     * Calcula los puntos de las zonas segun las regiones dadas
     *
     * @param zonas
     * @param regionesDada
     * @return
     */
    public static int calcularPuntuacion(int[] zonas, int[] regionesDada) {
 
        int puntos = 0;
        // Recorro las regiones donde tengo el numero de dardos
        for (int i = 0; i < regionesDada.length; i++) {
            // Sumo los puntos
            puntos += zonas[i] * regionesDada[i];
        }
        return puntos;
    }
 
     /**
     * Muestra el resultado segun los dardos usados Por ejemplo: 0 2 1 0
     * (regiones) => 25 25 50
     *
     * @param zonas
     * @param regionesDada
     */
    public static void mostrarSolucion(int[] zonas, int[] regionesDada) {
 
        // Recorro las regiones donde tengo el numero de dardos
        for (int i = 0; i < regionesDada.length; i++) {
            // Si es distinto de cero
            if (regionesDada[i] != 0) {
 
                // muestro la zona repetida tantas veces como dardos haya
                for (int j = 0; j < regionesDada[i]; j++) {
                    System.out.print(zonas[i] + " ");
                }
            }
        }
        System.out.println("");
 
    }
     
}