package buclesAvanzados;

import java.io.IOException;

public class StartEjercicio1 {

	public static void main(String[] args) throws IOException {
		
		
		
		char letra = (char)System.in.read();
		int ascii = letra;
		int valor = 0;
		
		while(letra!='\n') {

			switch(ascii) {
			
				case 77: valor+= 1000; break;//M  
				case 68: valor+= 500; break;//D  
				case 67: valor+= 100; break;//C  
				case 76: valor+= 50; break;//L  
				case 88: valor+= 10; break;//X  
				case 86: valor+= 5; break;//V  
				case 73: valor+= 1; break;//I  
			}
			char letraAnterior = letra;
			letra = (char)System.in.read();
			ascii = letra;
			
			if((letraAnterior=='I')&&((letra=='V')||(letra=='X'))) {
				
				valor-=2;
			}
			else if((letraAnterior=='X')&&((letra=='L')||(letra=='C'))) {
				
				valor-=20;
			}
			else if((letraAnterior=='C')&&((letra=='D')||(letra=='M'))) {
				
				valor-=200;
			}
			
			 
			
			
		}
		System.out.println(valor);
		
	}

}
