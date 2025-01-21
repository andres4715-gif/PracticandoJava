package ejerciciosJava.MyPractice.practicando.ArrayList;

/*
       Programa Java que lea una serie de valores numéricos enteros desde el teclado y los guarde en un ArrayList de tipo Integer.
       A continuación el programa mostrará por pantalla el número de valores que se han leído, su suma y su media.
       Por último se mostrarán todos los valores leídos, indicando cuántos de ellos son mayores que la media.

       http://puntocomnoesunlenguaje.blogspot.com/2016/02/ejercicios-resueltos-con-arraylist-en-java.html
*/

import java.util.ArrayList;

public class Ejercicio2 {

    static int checkSuma = 0;
    static double media;
    static double operation;

    public static void main(String[] args) {
        ArrayList<Integer> check = Ejercicio2.data();
        System.out.println(check);
        int checkAmount = Ejercicio2.amount(check);
        System.out.println(checkAmount);
        int sumando = Ejercicio2.sumaData(check);
        System.out.println("La suma de los numeros es: " + sumando);
        double media = Ejercicio2.media(check);
        System.out.println("La media de los numeros es: " + media);
        ArrayList<Integer> mayoresDeLaMedia = Ejercicio2.mayoresDelPromedio(check);
        System.out.println("Data mayor que la media: " + mayoresDeLaMedia);
        ArrayList<Integer> menoresDeLaMedia = Ejercicio2.menoresDelPromedio(check);
        System.out.println("Data menor que la media: " + menoresDeLaMedia);
    }

    private static ArrayList<Integer> data() {
        ArrayList<Integer> myDataList = new ArrayList<Integer>();
        myDataList.add(123);
        myDataList.add(12);
        myDataList.add(13);
        myDataList.add(100);

        return myDataList;
    }

    private static int amount(ArrayList<Integer> data) {
        int checkAmount = data.size();
        return checkAmount;
    }

    private static int sumaData(ArrayList<Integer> data) {
        for (int sumando : data) {
            checkSuma += sumando;
        }
        return checkSuma;
    }

    private static double media(ArrayList<Integer> data) {
        for (Integer sumando : data) {
            media += sumando;
            operation = media / data.size();
        }
        return operation;
    }

    private static ArrayList<Integer> mayoresDelPromedio(ArrayList<Integer> data) {
        ArrayList<Integer> mayores = new ArrayList<Integer>();
        for (Integer check : data) {
            if (check > operation) {
                mayores.add(check);
            }
        }
        return mayores;
    }

    private static ArrayList<Integer> menoresDelPromedio(ArrayList<Integer> data) {
        ArrayList<Integer> menores = new ArrayList<Integer>();
        for (Integer check : data) {
            if (check < operation) {
                menores.add(check);
            }
        }
        return menores;
    }
}
