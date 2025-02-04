package aulaEstudiantes;

/*
 * 
 * 8) Queremos representar con programación orientada a objetos, un aula con estudiantes y un profesor.
Tanto de los estudiantes como de los profesores necesitamos saber su nombre, edad y sexo. De los estudiantes, queremos saber también su calificación actual (entre 0 y 10) y del profesor que materia da.
Las materias disponibles son matemáticas, filosofía y física.
Los estudiantes tendrán un 50% de hacer novillos, por lo que si hacen novillos no van a clase pero aunque no vayan quedara registrado en el aula (como que cada uno tiene su sitio).
El profesor tiene un 20% de no encontrarse disponible (reuniones, baja, etc.)
Las dos operaciones anteriores deben llamarse igual en Estudiante y Profesor (polimorfismo).
El aula debe tener un identificador numérico, el número máximo de estudiantes y para que esta destinada (matemáticas, filosofía o física). Piensa que más atributos necesita.
Un aula para que se pueda dar clase necesita que el profesor esté disponible, que el profesor de la materia correspondiente en el aula correspondiente (un profesor de filosofía no puede dar en un aula de matemáticas) y que haya más del 50% de alumnos.
El objetivo es crear un aula de alumnos y un profesor y determinar si puede darse clase, teniendo en cuenta las condiciones antes dichas.
Si se puede dar clase mostrar cuantos alumnos y alumnas (por separado) están aprobados de momento (imaginad que les están entregando las notas).
NOTA: Los datos pueden ser aleatorios (nombres, edad, calificaciones, etc.) siempre y cuando tengan sentido (edad no puede ser 80 en un estudiante o calificación ser 12).
 * 
 */

//Clase Alumno, hereda de la clase Persona
public class Alumno extends Persona{
   
  /*Atributos*/
  private int nota;
   
  /*Constructor*/
  public Alumno(){
      super();
       
      nota=MetodosSueltos.generaNumeroAleatorio(0,10);
       
      super.setEdad(MetodosSueltos.generaNumeroAleatorio(12,15));
       
  }

  /*Metodos*/
   
  /**
   * Devuelve la nota
   * @return nota del alumno
   */
   
  public int getNota() {
      return nota;
  }

  /**
   * Modifica la nota del alumno
   * @param nota 
   */
  public void setNota(int nota) {
      this.nota = nota;
  }

  /**
   * Indica si el alumno esta disponible (50%)
   */
  @Override
  public void disponibilidad() {
       
      int prob=MetodosSueltos.generaNumeroAleatorio(0, 100);
       
      if(prob<50){
          super.setAsistencia(false);
      }else{
          super.setAsistencia(true);
      }
       
  }
   
  /**
   * Muestra la informacion del alumno
   * @return informacion
   */
  public String toString(){
       
      return "Nombre: "+super.getNombre()+" ,sexo: "+super.getSexo()+" , nota: "+nota;
      
  }
   
   
   
   
}
