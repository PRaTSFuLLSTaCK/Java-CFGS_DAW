package Complejo;

public class Complejo {
	
	private double pReal;
	private double pImag;
	
	public Complejo () {
		
		this.pReal = 0;
		this.pImag = 0;

	}
	
	public Complejo (double pReal, double pImag) {
		
		this.pReal = pReal;
		this.pImag = pImag;
	}

	public double getpReal() {
		return pReal;
	}

	public void setpReal(double pReal) {
		this.pReal = pReal;
	}

	public double getpImag() {
		return pImag;
	}

	public void setpImag(double pImag) {
		this.pImag = pImag;
	
	
	}

	@Override
	public String toString() {
		return "Complejo [pReal=" + pReal + ", pImag=" + pImag + ", getpReal()=" + getpReal() + ", getpImag()="
				+ getpImag() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	public void asignar (double x, double y) {
		
		setpReal(x);
		setpImag(y);
		
	}
	
	public void sumar (Complejo otro) {
		
		this.pReal += otro.pReal;
		this.pImag += otro.pImag;
		
	}

}
