package Complejo;

public class PrincipalComplejo {
	
	private void main(String [] args) {
		
		Complejo c = new Complejo (5, 6);
		
		System.out.println(c.getpReal());
		System.out.println(c.getpImag());
		
		c.setpReal(4);
		c.setpImag(2);
		
		System.out.println(c);
		
		Complejo c2 = new Complejo (3, 2);
		c.sumar(c2);
		
		System.out.println(c);

	}

}
