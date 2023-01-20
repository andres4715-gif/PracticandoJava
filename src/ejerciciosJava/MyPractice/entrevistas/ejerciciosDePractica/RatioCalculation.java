package ejerciciosJava.MyPractice.entrevistas.ejerciciosDePractica;

public class RatioCalculation {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, -1, -1};

        float contadorPositivos = 0;
        float contadorNegativos = 0;
        float zero = 0;
        float operacionPositivos = 0;
        float operacionNegativos = 0;
        float operacionCeros = 0;

        for(int data : array) {
            if(data > 0) {
                contadorPositivos++;
                operacionPositivos = contadorPositivos/array.length;

            } else if (data < 0){
                contadorNegativos++;
                operacionNegativos = contadorNegativos/array.length;

            } else {
                zero++;
                operacionCeros = zero/array.length;

            }
        }
        System.out.println(String.format("%.6f", operacionPositivos));
        System.out.println(String.format("%.6f", operacionNegativos));
        System.out.println(String.format("%.6f", operacionCeros));
    }
}
