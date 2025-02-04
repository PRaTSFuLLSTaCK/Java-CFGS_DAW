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

//Clase Persona
public abstract class Persona {
   
  /*Atributos*/
  private String nombre;
  private char sexo;
  private int edad;
  private boolean asistencia;
   
  /*Contantes*/
  private final String[] NOMBRES_CHICOS={"Pepe", "Fernando", "Alberto", "Nacho", "Eustaquio"}; 
  private final String[] NOMBRES_CHICAS={"Alicia", "Laura", "Clotilde", "Pepa", "Elena"}; 
  private final int CHICO=0;
  private final int CHICA=1;
   
  /*Constructores*/
  public Persona(){
       
      //entre 0 y 1
      int determinar_sexo=MetodosSueltos.generaNumeroAleatorio(0,1);
       
      //Si es 0 es un chico
      if(determinar_sexo==CHICO){
          nombre=NOMBRES_CHICOS[MetodosSueltos.generaNumeroAleatorio(0,4)];
          sexo='H';
      }else{
          nombre=NOMBRES_CHICAS[MetodosSueltos.generaNumeroAleatorio(0,4)];
          sexo='M';
      }
       
      //Indicamos la disponibilidad
      disponibilidad();
       
  }

  /*Metodos*/
   
  /**
   * Devuelve el nombre
   * @return 
   */
  public String getNombre() {
      return nombre;
  }

  /**
   * Modifica el nombre
   * @param nombre 
   */
  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  /**
   * Devuelve el sexo de la persona
   * @return 
   */
  public char getSexo() {
      return sexo;
  }

  /**
   * Modifica el sexo de la persona
   * @param sexo 
   */
  public void setSexo(char sexo) {
      this.sexo = sexo;
  }

  /**
   * Devuelve la edad de la persona
   * @return 
   */
  public int getEdad() {
      return edad;
  }

  /**
   * Modifica la edad de la edad
   * @param edad 
   */
  public void setEdad(int edad) {
      this.edad = edad;
  }

  /**
   * Indica la asistencia de la persona
   * @return 
   */
  public boolean isAsistencia() {
      return asistencia;
  }

  /**
   * Modifica la asistencia de la persona
   * @param asistencia 
   */
  public void setAsistencia(boolean asistencia) {
      this.asistencia = asistencia;
  }
   
  //abtracto, las clases hijas deben implementarlo
  public abstract void disponibilidad();
   
}
