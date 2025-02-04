package matricesDinamicas;

public class start {

	public static void main(String[] args) {
		
		matricesDinamicas miMatriz = new matricesDinamicas(4, 8);
		//miMatriz.imprimir();
		
		miMatriz.imprimir();
		miMatriz.addColumna(0);
		System.out.println("------");
		miMatriz.imprimir();

		

	}

}
