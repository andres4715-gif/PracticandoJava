package ejerciciosJava.MyPractice.entrevistas.POO.ejercicio2.constructores;

public class MainAlumno {

    public static void main(String[] args) {
        Alumno alumno = new Alumno(234, "Andres", "Rios", 17);

        System.out.println("el nombre es: " + alumno.getNombre());
        System.out.println(alumno.mayorDeEdad());

    }
}
