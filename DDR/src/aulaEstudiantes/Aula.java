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

public class Aula {
    
    /*Atributos*/
    private int id;
    private Profesor profesor;
    private Alumno[] alumnos;
    private String materia;
     
    /*Constantes*/
    private final int MAX_ALUMNOS=20;
     
    /*Constructores*/
    public Aula(){
         
        id=1;
         
        profesor=new Profesor();
        alumnos= new Alumno[MAX_ALUMNOS];
        creaAlumnos();
        materia=Constantes.MATERIAS[MetodosSueltos.generaNumeroAleatorio(0,2)];
         
    }
     
    /*Metodos*/
     
    /**
     * Crea los alumnos para el aula
     */
    private void creaAlumnos(){
         
        for(int i=0;i<alumnos.length;i++){
            alumnos[i]=new Alumno();
        }
         
    }
     
     
    /**
     * Indica si la asistencia de los alumnos es mayor del 50%
     * @return 
     */
    private boolean asistenciaAlumnos(){
         
        int cuentaAsistencias=0;
         
        //contamos las asistencias
        for(int i=0;i<alumnos.length;i++){
             
            if(alumnos[i].isAsistencia()){
                cuentaAsistencias++;
            }
             
        }
         
        //Muestro la asistencia total
        System.out.println("Hay "+cuentaAsistencias+" alumnos");
         
        return cuentaAsistencias>=((int)(alumnos.length/2));
         
    }
     
    /**
     * Indicamos si se puede dar clase
     * @return 
     */
    public boolean darClase(){
         
        //Indicamos las condiciones para que se pueda dar la clase
         
        if(!profesor.isAsistencia()){
            System.out.println("El profesor no esta, no se puede dar clase");
            return false;
        }else if(!profesor.getMateria().equals(materia)){
            System.out.println("La materia del profesor y del aula no es la misma, no se puede dar clase");
            return false;
        }else if (!asistenciaAlumnos()){
            System.out.println("La asistencia no es suficiente, no se puede dar clase");
            return false;
        }
         
        System.out.println("Se puede dar clase");
        return true;
         
    }
     
    /**
     * Indicamos las notas de los alumnos aprobados, chicos y chicas
     */
    public void notas(){
         
        int chicosApro=0;
        int chicasApro=0;
         
         for(int i=0;i<alumnos.length;i++){
            
           //Comprobamos si el alumno esta aprobado
           if(alumnos[i].getNota()>=5){
               //Segun el sexo, aumentara uno o otro
               if(alumnos[i].getSexo()=='H'){
                   chicosApro++;
               }else{
                   chicasApro++;
               }
                
               System.out.println(alumnos[i].toString());
                
           }
             
        }
          
        System.out.println("Hay "+chicosApro+" chicos y "+chicasApro+" chicas aprobados/as");
         
    }
     
}
