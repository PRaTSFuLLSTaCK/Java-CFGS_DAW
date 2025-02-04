package borradoVectores;

public class Start {

	public static void main(String[] args) {
	
		MiVector vector = new MiVector();
		
		int dondeQuedo;
		
		
		vector.add(22);
		vector.add(10);
		vector.add(15);
		vector.add(18);
		vector.add(67);
		vector.add(45);
		vector.add(30);
		vector.del(15);
		vector.del(67);
		vector.imprimir();
		

	}
}
