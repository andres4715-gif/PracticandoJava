package MyPractice.entrevistas.POO.ejercicio2.constructores;

public class Alumno {

    private String nombre;
    private String apellido;
    private int edad;

    public Alumno(int id, String nombre, String apellido, int edad) {
        this.edad = edad;
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    private int id;

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

    public boolean mayorDeEdad() {
        boolean ingreso;
        if(this.edad > 18) {
            ingreso = true;
        }else {
            ingreso = false;
        }
        return ingreso;
    }
}
