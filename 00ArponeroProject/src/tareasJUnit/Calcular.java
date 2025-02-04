package tareasJUnit;
//Clase Calcular.java
public class Calcular{
    public Calcular(){ }
    //--------------------------------------------
    public float sumar(float a, float b){
        return a+b;
    }
    public float restar(float a, float b){
        return a-b;
    }
    public float multiplicar(float a, float b){
        return a*b;
    } 
    public float dividir(float a, float b) throws ArithmeticException{
        if (b == 0) {
			throw new ArithmeticException("No est� permitida la divisi�n por cero");
		}
    	return a/b;
    }
    public boolean isPrimo(int a){
        if(a<=1) return false;
        int i=2;
        boolean primo=true;
        while(primo && i<=(a/2)){
            if(a%i==0) return false;
            i++;
        }
        return true;
    }
}