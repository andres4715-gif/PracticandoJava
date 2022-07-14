package ejerciciosJava.practicando.EjerciciosGenerales;

public class Ejercicio5 {

    /*
            Realiza el programa en JAVA tal que dado como datos la matrícula y 5 calificaciones de un alumno;
            imprima la matrícula, el promedio y la palabra “aprobado” si el alumno tiene un promedio mayor o igual que 6,
            y la palabra “no aprobado” en caso contrario.
            Datos: MAT, CAL1, CAL2, CAL3, CAL4, CAL5
            Donde: MAT es una variable entera que representa la matrícula del alumno.
            CAL1, CAL2, CAL3, CAL4 y CAL5 son variables de tipo real que representan las 5 calificaciones del alumno
    */

    public static void main(String[] args) {
        int MAT = 0;
        double suma = 0;
        double[] calificaciones = {4.5, 9.0, 8.5, 10, 6.5};
        int numeroDatos = calificaciones.length;
        double media;

        for(double data : calificaciones) {
            suma += data;
        }
        media = suma / numeroDatos;
        if(MAT == 0 && media >= 6) {
            System.out.println("El promedio es: " + media + " Aprobado");
        } else {
            System.out.println("no aprobado");
        }
    }
}
