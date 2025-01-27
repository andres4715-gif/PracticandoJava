package ejerciciosJava.MyPractice.practicando.arrays.ejercicio2;

public class Ejercicio2 {

    public static Model model(int[] array) {
        int totalOperaciones = operationResult(array);
        return new Model(totalOperaciones);
    }

    private static int operationResult(int[] array) {
        int sumaPares = 0, contPares = 0, sumaImpares = 0, contImpares = 0;
        int mediaPares, mediaImpares;
        for (int num : array) {
            if (num % 2 == 0) {
                sumaPares += num;
                contPares++;
            } else {
                sumaImpares += num;
                contImpares++;
            }
        }
        System.out.println("Suma pares: " + sumaPares);
        System.out.println("Suma impares: " + sumaImpares);
        mediaPares = (sumaPares / contPares);
        mediaImpares = (sumaImpares / contImpares);
        System.out.println("La media de los pares es: " + mediaPares);
        System.out.println("La media de los impares es: " + mediaImpares);
        return sumaPares;
    }
}

