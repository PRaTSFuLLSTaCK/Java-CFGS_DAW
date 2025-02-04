package HerenciaCocheVehiculo;

public class Camion extends Vehiculo implements Arrancar {

    public Camion() {
        // TODO Apéndice de constructor generado automáticamente
    }
    
    private int ejes;
    private int cargaMax;
    private String categoria;
    
    public Camion(int ejes, int cargaMax, String categoria) {
        
        this.ejes = ejes;
        this.cargaMax = cargaMax;
        this.categoria = categoria;
    }
    
    public Camion(String matricula, String modelo, String marca, int kilometros,int ejes, int cargaMax, String categoria) {
        super(matricula, modelo, marca, kilometros);
        this.ejes = ejes;
        this.cargaMax = cargaMax;
        this.categoria = categoria;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String toString() {
                    return "Camion [ejes=" + ejes + ", cargaMax=" + cargaMax + ", categoria=" + categoria + "]";
    }

     public void Arrancar(){
        System.out.println("Embragar y girar llave");
    }
    
    public void Parar(){
   System.out.println("Echar freno de mano y girar llave");
}
    

}
