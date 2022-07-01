package ejerciciosJava.practicando.arrays;

public class Ejercicio3 {

    /*
        Programa que lee por teclado la nota de los alumnos de una clase y calcula la nota media del grupo. También muestra los alumnos con notas superiores a la media. El número de alumnos se lee por teclado.
        Este programa utiliza un array de elementos de tipo double que contendrá las notas de los alumnos.
        El tamaño del array será el número de alumnos de la clase, por lo tanto primero se pedirá por teclado el número de alumnos y a continuación se creará el array.
        Se realizan 3 recorridos sobre el array, el primero para asignar a cada elemento las notas introducidas por teclado, el segundo para sumarlas y calcular la media y el tercero para mostrar los alumnos con notas superiores a la media.
     */

    // link: http://puntocomnoesunlenguaje.blogspot.com/2012/08/arrays-en-java-ejercicios-basicos-2.html


    static double[] notas = {8.5, 5.6, 10, 9.8, 5.9, 8.5, 5.6, 10, 9.8, 5.9};
    static double mediaDeLasNotasDelosAlumnos;
    static int cantidadDeAlumnosConNotasMayoresAlPromedio = 0;

    public static void main(String[] args) {
        mediaDeLasNotasDelosAlumnos = notasAlumnos(notas);
        cantidadDeAlumnosConNotasMayoresAlPromedio = catidadAlumnosConNotasMayoresAlPromedio(notas);

        System.out.println("La media de todas las notas de los alunos es: " + mediaDeLasNotasDelosAlumnos);
        System.out.println("La cantidad de alumnos con nota mayor a la media es: " + cantidadDeAlumnosConNotasMayoresAlPromedio);
    }

    private static double notasAlumnos(double[] notasAlumnos) {
        double sumaDeNotasAlumnos = 0;
        int cantidadAlumnos = 0;

        double mediaDeLasNotasDeLosAlumnos;
        for (double nota : notasAlumnos) {
            sumaDeNotasAlumnos += nota;
            cantidadAlumnos++;
        }
        mediaDeLasNotasDeLosAlumnos = (sumaDeNotasAlumnos / cantidadAlumnos);
        return mediaDeLasNotasDeLosAlumnos;
    }

    private static int catidadAlumnosConNotasMayoresAlPromedio(double[] notas) {
        int contadorAlumnosConNotasMayores = 0;

        for (double goodNotas : notas) {
            if (goodNotas >= mediaDeLasNotasDelosAlumnos) {
                contadorAlumnosConNotasMayores++;
            }
        }
        return contadorAlumnosConNotasMayores;
    }
}
