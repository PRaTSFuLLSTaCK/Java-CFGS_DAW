package Binario.Fichero_Objetos;

// Copiar un fichero ficheroOriginal en el fichero ficheroCopia de 1000 bytes en 1000 bytes

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopiaFicheros {

	// E: ficheroOriginal => fichero origen que se va a copiar
	//    ficheroCopia => fichero destino que se machacará con en el contenido del ficheroCopia
	// S: nada, en el ficheroCopia se copia el ficheroOriginal
	public static void copia (String ficheroOriginal, String ficheroCopia)
	{
		try
		{
			// Se abre el fichero original para lectura
			FileInputStream fileInput = new FileInputStream(ficheroOriginal);
			BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
			
			// Se abre el fichero donde se hará la copia
			FileOutputStream fileOutput = new FileOutputStream (ficheroCopia);
			BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);
			
			// Bucle para leer de un fichero y escribir en el otro de 1000 bytes en 1000 bytes.
			byte [] array = new byte[1000];
			int leidos = bufferedInput.read(array);
			while (leidos > 0)
			{
				bufferedOutput.write(array,0,leidos);
				leidos=bufferedInput.read(array);
			}

			// Cierre de los ficheros
			bufferedInput.close();
			bufferedOutput.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
	
		// se supone que el ficherOrigen.bin debe existir sino, no se puede copiar
		copia ("ficheroOrigen.bin", "ficheroDestino.bin");
		
		// En Linux para ver si dos archivos son iguales usa el comando diff desde la terminal de comandos
		// si no se muestra ningún mensaje al ejecutarse es que son iguales
		// diff ficheroDestino.bin ficheroOrigen.bin
		
	} // fin main

	
}

