package Binario.Herencia;

public class Circulo extends Figura {
	
    protected double radio;
    private static final double PI=3.1416;
    
    public Circulo(int x, int y, double radio){
        super(x,y);
        this.radio=radio;
    }
    
    public double area(){
        return PI*radio*radio;
    }
}
