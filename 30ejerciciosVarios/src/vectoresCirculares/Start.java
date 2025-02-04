package vectoresCirculares;

public class Start {

	public static void main(String[] args) {

		VectorCircular miVector = new VectorCircular();
		miVector.add(1);
		miVector.add(2);
		miVector.add(3);
		miVector.add(4);
		miVector.add(5);
		miVector.add(6);
		miVector.add(7);
		miVector.imprimir();

		miVector.add(8);
		miVector.imprimir();
		
		miVector.add(9);
		miVector.imprimir();
		
		miVector.add(10);
		miVector.add(11);
		miVector.add(12);
		miVector.add(13);
		miVector.add(14);
		miVector.add(15);
		miVector.add(16);
		miVector.imprimir();	
		
	
		int posicion = miVector.buscar(19);
		System.out.println("estaba en la posición "+posicion);
		
		
		
		
	
	
	}
	
	
	
}
