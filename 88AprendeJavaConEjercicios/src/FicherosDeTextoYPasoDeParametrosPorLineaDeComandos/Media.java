package FicherosDeTextoYPasoDeParametrosPorLineaDeComandos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Media {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Uso del programa: media FICHERO");
			System.exit(-1); // sale del programa
		}
			
		try {		
			BufferedReader bf = new BufferedReader(new FileReader(args[0]));
			
			String linea = "0";
			int i = 0;
			double suma = 0;
			
			while (linea != null) {
				i++;
				suma += Double.parseDouble(linea);
				linea = bf.readLine();					
			}
			i--;
			
			bf.close();

			System.out.println("La media es " + suma/(double)i);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}