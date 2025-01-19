package ejerciciosJava.MyPractice.entrevistas.POO.ejercicio2.constructores;

public class MainAlumno {

    public static void main(String[] args) {
        Alumno alumno = new Alumno(234, "Andres", "Rios", 40);

        System.out.println("El id del alumno es: " + alumno.getId());
        System.out.println("el nombre es: " + alumno.getNombre());
        System.out.println(alumno.mayorDeEdad(18));
        alumno.gettingFakeData(3, 6);
        System.out.println(alumno.mayoriaEdad(18));
    }
}
