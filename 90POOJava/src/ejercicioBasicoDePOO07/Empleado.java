package ejercicioBasicoDePOO07;

/*
 * 
 * Crea una clase Empleado que tenga los siguientes atributos privados:
 * 
Nif.

Nombre.

Sueldo base.

Horas extra realizadas en el mes.

Tipo de IRPF (%).

Casado o no.

Número de hijos.

Importe de la hora extra. Este será un atributo static o atributo de clase.

Los objetos Empleado se podrán crear con un constructor por defecto o con un constructor con un solo parámetro correspondiente al DNI.

Además de los métodos getter/setter la clase Empleado tendrá estos métodos:

Método para el cálculo del complemento correspondiente a las horas extra realizadas.

Método para calcular el sueldo bruto (sueldo base + complemento por horas extras)

Método para calcular las retenciones por IRPF. El porcentaje de IRPF se aplica sobre el sueldo bruto, teniendo en cuenta que el 
porcentaje que hay que aplicar es el tipo menos 2 puntos si el empleado está casado y menos 1 punto adicional por cada hijo que tenga.
 * 
 */

//Clase Empleado
public class Empleado {
 
  private static double pagoPorHoraExtra; //atributo de clase
  private String nif;
  private String nombre;
  private double sueldoBase;
  private int horasExtras;
  private double tipoIRPF;
  private char casado;  //S ó N
  private int numeroHijos;
 
  //Constructor por defecto
  public Empleado() {
  }

  //Constructor con un parámetro
  public Empleado(String nif) {
      this.nif = nif;
  }

  //Métodos get/set
  public char getCasado() {
      return casado;
  }

  public void setCasado(char casado) {
      this.casado = casado;
  }

  public int getHorasExtras() {
      return horasExtras;
  }

  public void setHorasExtras(int horasExtras) {
      this.horasExtras = horasExtras;
  }

  public String getNif() {
      return nif;
  }

  public void setNif(String nif) {
      this.nif = nif;
  }

  public String getNombre() {
      return nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public int getNumeroHijos() {
      return numeroHijos;
  }

  public void setNumeroHijos(int numeroHijos) {
      this.numeroHijos = numeroHijos;
  }

  public double getSueldoBase() {
      return sueldoBase;
  }

  public void setSueldoBase(double sueldoBase) {
      this.sueldoBase = sueldoBase;
  }

  public double getTipoIRPF() {
      return tipoIRPF;
  }

  public void setTipoIRPF(double tipoIRPF) {
      this.tipoIRPF = tipoIRPF;
  }

  //métodos get/set para el atributo static
  public static double getPagoPorHoraExtra() {
      return pagoPorHoraExtra;
  }

  public static void setPagoPorHoraExtra(double pagoPorHoraExtra) {
      Empleado.pagoPorHoraExtra = pagoPorHoraExtra;
  }
 
 
  //calcular el importe de las horas extra
  public double calcularImporteHorasExtras(){
      return horasExtras * pagoPorHoraExtra;
  }
 
  //calcular el sueldo bruto
  public double calcularSueldoBruto(){
      return sueldoBase + calcularImporteHorasExtras();
  }
 
  //calcular el importe de las retencion por IRPF
  public double calcularRetencionIrpf(){
      double tipo = tipoIRPF;
      if(casado == 's' || casado == 'S') {
          tipo = tipo - 2; //2 puntos menos si está casado
      }
      tipo = tipo - numeroHijos; //un punto menos por cada hijo
      if(tipo<0){
          tipo = 0;
      }
      return calcularSueldoBruto() * tipo / 100;
  }
 
  //calcular el importe liquido a cobrar
  public double calcularSueldo(){
      return calcularSueldoBruto() - calcularRetencionIrpf();
  }

  //mostrar los datos de un trabajador
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("\nNif: ");
      sb.append(nif);
      sb.append("\nSueldo Base: ");
      sb.append(sueldoBase);
      sb.append("\nHoras Extras: ");
      sb.append(horasExtras);
      sb.append("\ntipo IRPF: ");
      sb.append(tipoIRPF);
      sb.append("\nCasado: ");
      sb.append(casado);
      sb.append("\nNúmero de Hijos: ");
      sb.append(numeroHijos);
      return  sb.toString();
  }
  
  
  
}//Fin de la Clase Empleado