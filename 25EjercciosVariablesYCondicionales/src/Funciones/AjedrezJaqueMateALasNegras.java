package Funciones;

public class AjedrezJaqueMateALasNegras {

	final static int V=-1; // escaque vacío
	final static int P=0;  // peón    
	final static int T=1;  // torre    
	final static int C=2;  // caballo    
	final static int A=3;  // alfil    
	final static int D=4;  // dama    
	final static int R=5;  // rey

	// igual para los negros 

	final static int PN=10;   
	final static int TN=11;    
	final static int CN=12;    
	final static int AN=13;    
	final static int DN=14;    
	final static int RN=15;

	public static void main(String[] args)    { 

		int tablero[][] = {     { V,  V,  V,  V,  V,  V,  V,  V}, 
								{ V,  V,  V,  V,  V,  V,  V,  V},    
								{ V,  V,  V,  V,  V,  V,  V,  V},  
								{ V,  V,  V,  V,  V,  V,  V, DN},   
								{ V,  V,  V,  V,  V,  V,  V,  V},   
								{CN,  V,  V, DN,  V,  V,  V,  V},   
								{ V,  P,  P, PN,  V,  V,  V,  V},    
								{ V,  V,  R,  V,  V,  V,  V,  V}};

		// hay que tener con el tablero: como lo visualizamos y sus índices.    
		// En realidad el tablero no es como se ve arriba. Ya que hemos de imaginarlo   
		// rotado 90 grados hacia la izquierda.

		int num_jaque=0;        
		int pos_rey[];

		boolean amenaza=false;		// una posible mejora es indicar en la variable   
		// amenaza la primera pieza contraria nos está  
		// acechando e indicar con un escaque vacío que  
		// no existe peligro

		pos_rey = busca_rey(tablero);

		if ( jaque (tablero) == true ) 

		{            
			amenaza =true; 

			num_jaque=0;      

			// intentaremos mover el rey a las casillas adyacentes      
			// y comprobar si en la nueva ubicación recibe jaque    

			num_jaque += mover_rey (tablero,  0, -1);         
			num_jaque += mover_rey (tablero,  0,  1);     
			num_jaque += mover_rey (tablero,  1, -1);
			num_jaque += mover_rey (tablero,  1,  0);            
			num_jaque += mover_rey (tablero,  1,  1);           
			num_jaque += mover_rey (tablero, -1, -1);           
			num_jaque += mover_rey (tablero, -1,  0);            
			num_jaque += mover_rey (tablero, -1,  1);   

		}

		// mostramos se existe amenaza   

		if (amenaza)           

			if (num_jaque<8)    

				System.out.println("Solo es jaque."); 

			else                

				System.out.println("Jaque Mate"); 

		else            

			System.out.println("El rey no está amenazado");

	}

	static boolean jaque(int tablero[][])    

	{        boolean amenaza=false;  

	int pieza;          // pieza que no está amenazando

	int pos_rey[];  // posición del rey en el tablero  

	pos_rey = new int [2];

	pos_rey = busca_rey (tablero);

	// ahora iremos viendo las posibles amenazas una a una:

	// en primer lugar veremos si nos amenaza un caballo:   

	amenaza =amenaza_caballo (tablero, pos_rey);

	// AHORA       
	// miraremos hacia la derecha (dx:1, dy:0)   
	// aquí no puede amenazar una torre o dama

	pieza =primera_pieza(tablero, pos_rey, 1, 0); 

	if (pieza ==DN || pieza ==TN)    

		amenaza=true;

	// miraremos hacia la izquierda (dx:-1, dy:0)
	// aquí no puede amenazar una torre o dama   

	pieza =primera_pieza(tablero, pos_rey, -1, 0); 

	if (pieza ==DN || pieza ==TN)     

		amenaza=true;

	// miraremos hacia arriba (dx:0, dy:1)   
	// aquí no puede amenazar una torre o dama 

	pieza =primera_pieza(tablero, pos_rey, 0, 1); 

	if (pieza ==DN || pieza ==TN)        

		amenaza=true;

	// miraremos hacia abajo (dx:0, dy:-1)  
	// aquí no puede amenazar una torre o dama 

	pieza =primera_pieza(tablero, pos_rey, 0, -1);  

	if (pieza ==DN || pieza ==TN)   

		amenaza=true;

	// miraremos en la diagonal derecha arriba (dx:1, dy:1) 

	// aquí no puede amenazar un alfil o una dama   

	pieza =primera_pieza(tablero, pos_rey, 1, 1);  

	if (pieza ==DN || pieza ==AN)     

		amenaza=true;

	// miraremos en la diagonal derecha abajo (dx:1, dy:-1) 

	// aquí no puede amenazar un alfil o una dama    

	pieza =primera_pieza(tablero, pos_rey, 1, -1);

	if (pieza ==DN || pieza ==AN)      

		amenaza=true;

	// miraremos en la diagonal izquierda arriba (dx:-1, dy:1) 

	// aquí no puede amenazar un alfil o una dama

	pieza =primera_pieza(tablero, pos_rey, -1, 1);  

	if (pieza ==DN || pieza ==AN)    

		amenaza=true;

	// miraremos en la diagonal izquierda abajo (dx:-1, dy:-1)

	// aquí no puede amenazar un alfil o una dama  

	pieza =primera_pieza(tablero, pos_rey, -1, -1);   

	if (pieza ==DN || pieza ==AN)      

		amenaza=true;

	// falta que nos amenace un peón
	// el posible peón se encuentra arriba a la derecha o a la izquierda  

	if ( (pos_rey[0]+1<8 && pos_rey[1]+1<8 && tablero[pos_rey[0]+1][pos_rey[1]+1]==PN) ||
			(0<=pos_rey[0]-1 && pos_rey[1]+1<8 && tablero[pos_rey[0]-1][pos_rey[1]+1]==PN) )  

		amenaza=true;

	return (amenaza); 

	}

	// esta función busca el rey blanco y devuelve su posición  
	// en una tabla de dos elementos. Siendo posicion[0] la columna y 
	// posicion[1] la fila.

	static int[] busca_rey (int tablero[][])   

	{       

		int i,j; 

		int posicion[];

		posicion = new int [2];

		for (i=0; i <8; i++)  

			for (j=0; j <8; j++)  

				if (tablero[i][j]==R)

				{  

					posicion[0] =i;   
					posicion[1] =j;   

				}
		return (posicion);    

	}

	// esta función busca la primera pieza que existe desde la posición pos,    
	// en la dirección indicada por dx, dy.   
	// Los valores de dx, dy son:  
	//  dx  dy  dirección   
	//  1    1   diagonal derecha arriba    
	//  1    0   derecha   
	//  1   -1  diagonal derecha abajo    
	//  0    1   hacia arriba   
	//  0    0   ESTE CASO NO SE DARÁ NUNCA    
	//  0   -1  hacia abajo    
	//  -1   1   diagonal izquierda arriba    
	//  -1   0   hacia la izquierda    
	//  -1  -1   diagonal izquierda abajo

	static int primera_pieza (int tablero[][], int pos[], int dx, int dy) 

	{        int posx, posy; 

	//posición del tablero en la que estamos mirando

	int pieza;

	posx =pos[0]; 
	posy =pos[1];

	pieza = V; 

	// en principio suponemos que no hay ninguna pieza

	// damos el primer paso: es decir pasamos a la primera casilla 

	// después del rey.       

	posx +=dx;        

	posy +=dy;

	// mientras no nos salgamos del tablero y no encontremos una pieza

	while ( 0<=posx && posx<=7 && 0<=posy && posy<=7 && pieza ==V)      

	{            

		pieza = tablero[posx][posy];

		posx += dx;     
		posy += dy;   

	}
	return (pieza);  

	}
	static boolean amenaza_caballo (int tablero[][], int pos[]) 

	{    

		boolean amenaza=false;

		// Hay que tener cuidado al comprobar los caballos de no salirse del  

		// tablero
		// Desde la posición actual vemos los posibles ocho posiciones desde donde  
		// puede amenazarnos un caballo.   
		// Algunas de estas posiciones pueden estar "fuera" del tablero    

		if ( (    pos[0]+2 <8 &&     pos[1]+1 <8 && tablero[pos[0]+2][pos[1]+1] ==CN) ||
				(    pos[0]+2 <8 && 0<= pos[1]-1    && tablero[pos[0]+2][pos[1]-1] ==CN) ||
				(0<= pos[0]-2    &&     pos[1]+1 <8 && tablero[pos[0]-2][pos[1]+1] ==CN) ||
				(0<= pos[0]-2    && 0<= pos[1]-1    && tablero[pos[0]-2][pos[1]-1] ==CN) || 
				(    pos[0]+1 <8 &&     pos[1]+2 <8 && tablero[pos[0]+1][pos[1]+2] ==CN) || 
				(    pos[0]+1 <8 && 0<= pos[1]-2    && tablero[pos[0]+1][pos[1]-2] ==CN) || 
				(0<= pos[0]-1    &&     pos[1]+2 <8 && tablero[pos[0]-1][pos[1]+2] ==CN) || 
				(0<= pos[0]-1    && 0<= pos[1]-2    && tablero[pos[0]-1][pos[1]-2] ==CN) )  

			amenaza = true;

		return (amenaza); 

	}
	static int mover_rey (int tablero[][], int dx, int dy) 

	{    

		int existe_jaque=0; // existe_jaque vale 0 si no hay peligro y 1 si  
		// el rey está amenazado o no puede moverse a esta                       
		// casilla.


		int pos[];    
		pos = new int [2];

		pos = busca_rey(tablero);

		if ( 0<=pos[0]+dx && pos[0]+dx<8  && 0<=pos[1]+dy && pos[1]+dy<8  && ( tablero[pos[0]+dx][pos[1]+dy]==V  ||
				tablero[pos[0]+dx][pos[1]+dy]==PN ||           tablero[pos[0]+dx][pos[1]+dy]==TN ||
				tablero[pos[0]+dx][pos[1]+dy]==CN ||           tablero[pos[0]+dx][pos[1]+dy]==AN ||
				tablero[pos[0]+dx][pos[1]+dy]==DN ) ) 

		{                

			int pieza;

			// guardamos la pieza que ocupa la posición a ocupar por el rey
			// esta pieza puede ser V (vacío) o una pieza negra que el                
			// rey capturará                

			pieza=tablero[pos[0]+dx][pos[1]+dy];

			// movemos el rey                

			tablero[pos[0]][pos[1]] =V;                
			tablero[pos[0]+dx][pos[1]+dy] =R;                

			if (jaque(tablero))                    

				existe_jaque=1;

			//volvemos el rey a su posición inicial 
			tablero[pos[0]][pos[1]] =R;  
			tablero[pos[0]+dx][pos[1]+dy] =pieza;

		}  

		else   

			// no podemos mover el rey, en la practica esta casilla no es utilizable 
			// por el rey para escapar... es lo mismo que una amenaza (jaque). 

			existe_jaque=1;

		return (existe_jaque); 

	}
}






