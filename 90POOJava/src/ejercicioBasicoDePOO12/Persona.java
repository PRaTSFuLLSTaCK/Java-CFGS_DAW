package ejercicioBasicoDePOO12;

class Persona {
    String nombre,apellido;
    int edad;
//constructor de la clase persona que recibe por parametro el nombre apellido y edad
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
//metodos que sirvan para obtener y poner los datos de la persona
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //metodo que devuelve los datos de la persona
    public String datos(){
        return this.nombre+"\n"+this.apellido;
    }
    public int edad(){
        return this.edad;
    }
}
