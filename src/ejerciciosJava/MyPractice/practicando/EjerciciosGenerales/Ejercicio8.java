package ejerciciosJava.MyPractice.practicando.EjerciciosGenerales;

import java.util.ArrayList;

public class Ejercicio8 {

    /*
         Dado como datos las calificaciones de 15 alumnos de la materia de fundamentos de programación,
         realiza un programa en JAVA que obtenga lo siguiente:
-        Promedio general
-        Imprima las calificaciones en orden inverso
    */

    public static void main(String[] args) {
        ArrayList<Double> myData = new ArrayList<Double>();
        double calificaciones[] = {4.0, 2.0, 3.0, 4.3, 5.7, 5.9, 7.1, 2.8, 6.8, 9.0, 7.8, 8.9, 9.8, 7.7, 8};
        double suma = 0;
        double media = 0;
        int cantidadNotas = calificaciones.length;

        for (double data : calificaciones) {
            suma += data;
            media = (suma / cantidadNotas);
        }

        for (int i = calificaciones.length -1; i >= 0; i--) {
            myData.add(calificaciones[i]);
        }
        System.out.println("La media de todos los alumnos es: " + media);
        System.out.println(myData);
    }
}
