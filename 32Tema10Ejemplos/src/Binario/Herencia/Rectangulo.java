package Binario.Herencia;

public class Rectangulo extends Figura{
    protected double ancho, alto;
    public Rectangulo(int x, int y, double ancho, double alto){
        super(x,y);
        this.ancho=ancho;
        this.alto=alto;
    }
    public double area(){
        return ancho*alto;
    }
}
