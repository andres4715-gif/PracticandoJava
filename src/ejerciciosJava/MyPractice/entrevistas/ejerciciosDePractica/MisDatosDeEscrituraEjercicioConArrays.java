package MyPractice.entrevistas.ejerciciosDePractica;

public class MisDatosDeEscrituraEjercicioConArrays {

    public static void main(String[] args) {
        int[] puntajeDeLaPrueba = {38, 45, 38, 34, 37, 36, 39, 36, 34, 37};

        System.out.println("La suma de todos los intentos es: " + sumaDeLaData(puntajeDeLaPrueba));
        System.out.println("El promedio de todos los resultados es: " + promedio(puntajeDeLaPrueba));
        System.out.println("El puntaje mayor obtenido es: " + puntajeMasAlto(puntajeDeLaPrueba));
        System.out.println("El puntaje menor obtenido es: " + puntajeMasBajo(puntajeDeLaPrueba));
        System.out.println("La cantidad de intentos con resultados mayores a 45 fueron: " + cantidadDeIntentosMayores45(puntajeDeLaPrueba));
        System.out.println("La cantidad de intentos con resultados menores a 35 fueron: " + validarMenorDe35(puntajeDeLaPrueba));
        System.out.println("Se obtuvieron resultados repetidos?: "+ intentosConMismoResultado(puntajeDeLaPrueba));
    }

    public static int sumaDeLaData(int[] data) {
        int numero = 0;

        for (int i = 0; i < data.length; i++) {
            numero += data[i];
        }
        return numero;
    }

    public static float promedio(int[] data) {
        int numero = 0;
        int paraDividir = data.length;

        for (int i = 0; i < data.length; i++) {
            numero += data[i];
        }
        return numero / paraDividir;
    }

    public static int puntajeMasAlto(int[] data) {
        int mayor = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] > mayor) {
                mayor = data[i];
            }
        }
        return mayor;
    }

    public static int puntajeMasBajo(int[] data) {
        int menor = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] < menor) {
                menor = data[i];
            }
        }
        return menor;
    }

    public static int cantidadDeIntentosMayores45(int[] data) {
        int contadorMayores = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] > 45) {
                contadorMayores++;
            }
        }
        return contadorMayores;
    }

    public static int validarMenorDe35(int[] data) {

        int contadoMenores = 0;

        for (int i = 1; i < data.length; i++) {
            if (data[i] < 35) {
                contadoMenores++;
            }
        }
        return contadoMenores;
    }

    public static boolean intentosConMismoResultado(int[] data) {
        int numero = data[0];
        boolean checkingData = false;
        int contadorRepetidos = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] == numero) {
                contadorRepetidos++;
            }
        }
        if (contadorRepetidos > 0) {
            checkingData = true;
        }
        return checkingData;
    }
}