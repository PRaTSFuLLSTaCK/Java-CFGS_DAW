package TablasNDimensionales;

/*
 * Se pretende realizar un programa para gestionar la lista de participaciones en una competición de salto de longitud. 
 * El número de plazas disponible es de 10. Sus datos se irán introduciendo en el mismo orden que vayan inscribiéndose los atletas. 
 * Diseñar el programa que muestre las siguientes opciones: 
 * 
 * 1- Inscribir un participante. 
 * 2- Mostrar listado de datos. 
 * 3- Mostrar listado por marcas. 
 * 4- Finalizar el programa. 
 * 
 * Si se selecciona 1, se introducirán los datos de uno de los participantes: 
 * 
 * Nombre, mejor marca del 2002, mejor marca del 2001 y mejor marca del 2000. 
 * Si se elige la opción 2, se debe mostrar un listado por número de dorsal. 
 * La opción 3 mostrará un listado ordenado por la marca del 2002, de mayor a menor. 
 * Tras procesar cada opción, se debe mostrar de nuevo el menú inicial, hasta que se seleccione la opción 4, que terminará el programa.
 */

public class ParticipantesDeUnaCompeticion {

	public static void main(String[] args) { 

		final int TAM=10,D=0,M0=1,M1=2,M2=3; 

		// TAM: Número máximo de participantes    

		// D: número de dorsal       

		// M0, M1, M2: Marca del 2000, 2001, y 2002 

		int opc,numc,dorsal,i,aux;    
		boolean d_rep,inter;

		int part[][]=new int[TAM][4];   

		numc=0;       
		opc=0;

		do{        

			System.out.println();    

			System.out.println("--------------------------------");       

			System.out.println("1. Inscribir participantes");          

			System.out.println("2. Mostrar listado por datos");       

			System.out.println("3. Mostrar listado por marcas");         

			System.out.println("4. Salir");         

			System.out.println("--------------------------------");        

			System.out.print("Por favor, introduzca una opción: ");    

			opc=Utilidades.Entrada.entero();         

			System.out.println();      

			switch(opc){              

			case 1:                  

				if(numc==20)             

					System.out.println("Listado completo");   

				else{                      

					do{                    

						System.out.print("Introduzca dorsal: ");   

						dorsal=Utilidades.Entrada.entero();

						d_rep=false; 

						i=0;                   

						while(i<numc && d_rep==false){    

							if(part[i][D]==dorsal){        

								System.out.print("Dorsal registrado.");  

								System.out.println("Por favor intente de nuevo");   

								d_rep=true;                         

							}                            

							i++;                       

						}                    

					}while(d_rep==true);  

					if(d_rep==false){  

						part[numc][D]=dorsal; 

						System.out.print("Introduzca marca del 2000: ");   

						part[numc][M0]=Utilidades.Entrada.entero();


						System.out.print("Introduzca marca del 2001: ");  

						part[numc][M1]=Utilidades.Entrada.entero();     

						System.out.print("Introduzca marca del 2002: ");  

						part[numc][M2]=Utilidades.Entrada.entero();                   

						System.out.println();               

						numc++;             

					}      

				}              

				break;

			case 2: // método de ordenación por burbuja, controlado por intercambio 

				inter=true;         

				while(inter==true){  

					inter=false;      

					for (int j=0;j<=numc-1-1;j++){     

						if(part[j][D]>part[j+1][D]){    

							for (int k=0;k<4;k++){     

								aux=part[j][k];     

								part[j][k]=part[j+1][k]; 

								part[j+1][k]=aux;     

							}                       

							inter=true;          

						}                    

					}                 

				}               

				System.out.println("LISTADO DE DATOS,SEGUN DORSAL:");   

				System.out.println ("dorsal - marcas");             

				for (int j=0;j<numc;j++){           

					System.out.println();          

					for (int k=0;k<4;k++){       

						System.out.print(part[j][k]+" ");   

					}                

				}              

				break;

			case 3:


				inter=true;     

				while(inter==true){  

					inter=false;       

					for (int j=0;j<=numc-1-1;j++){   

						if(part[j][M2]>part[j+1][M2]){  

							for (int k=0;k<4;k++){     

								aux=part[j][k];         

								part[j][k]=part[j+1][k];  

								part[j+1][k]=aux;        

							}                         

							inter=true;            

						}                 

					}              

				}               

				System.out.println("LISTADO POR MARCAS :");  

				System.out.println ("dorsal - marcas");    

				for (int j=0;j<numc;j++){       

					System.out.println();      

					for (int k=0;k<4;k++){    

						System.out.print(part[j][k]+" ");   

					}             

				}          

				break;        

			}     

		}    

		while(opc!=4);  

	}

}


