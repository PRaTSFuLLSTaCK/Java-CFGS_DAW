package Alumnos;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno unAlumno = Alumno.getAlumno();
		Alumno otroAlumno = Alumno.getAlumno();

		// imprimimos los objetos
		System.out.println(unAlumno);
		System.out.println(otroAlumno);
		
		
		// cambiamos uno de ellos
		unAlumno.setNombre("María");
		
		// imprimimos los dos otra vez
		System.out.println(unAlumno);
		System.out.println(otroAlumno);
	}

}
