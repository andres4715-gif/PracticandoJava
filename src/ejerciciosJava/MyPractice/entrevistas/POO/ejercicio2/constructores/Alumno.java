package ejerciciosJava.MyPractice.entrevistas.POO.ejercicio2.constructores;

public class Alumno {

    private final int id;
    private String nombre;
    private String apellido;
    private int edad;

    public Alumno(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public boolean mayorDeEdad(int edadPermitida) {
        boolean ingreso;
        if(this.edad > edadPermitida) {
            ingreso = true;
        }else {
            ingreso = false;
        }
        return ingreso;
    }

    public void gettingFakeData (int dato1, int dato2) {
        int respuesta = dato1 + dato2;
        System.out.println("--- La data que se quiere obtner es: " + respuesta);
    }

    public boolean mayoriaEdad(int limite) {
        boolean data;
        data = this.edad >= limite;
        return data;

    }
}
