package VariablesYCondicionales;

public class FechaCorrectaMeses28O30O31Dias02 {

	public static void main(String[] args) {    

		int dia,mes,año;

		int dias_del_mes;   

		boolean fecha_correcta=true;

		System.out.print("Introduzca día: ");  

		dia=Utilidades.Entrada.entero();     

		System.out.print("Introduzca mes: "); 

		mes=Utilidades.Entrada.entero();   

		System.out.print("Introduzca año: ");  

		año=Utilidades.Entrada.entero();

		dias_del_mes = 0;// si se utiliza un mes fuera del rango 1..12    

		// supondremos que los días del mes son 0.

		if(año==0) // el único año que no existe es el 0   

			fecha_correcta = false;   

		if (dia<1 || dia >31) // un día fuera del rango 1..31 no tiene sentido    

			fecha_correcta = false;       

		if (mes<1 || mes >12) // un mes fuera del rango 1..12 no tiene sentido      

			fecha_correcta = false;

		if(mes==2 )          

			dias_del_mes = 28;  

		if(mes==4 || mes==6 || mes==9 || mes==11)   

			dias_del_mes = 30;    

		if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)         

			dias_del_mes = 31;

		if (dia > dias_del_mes)      

			fecha_correcta = false;

		if (fecha_correcta)           

			System.out.println(dia + "/" + mes + "/" + año+": Fecha correcta");     

		else            

			System.out.println("Fecha incorrecta");    

	}

}


