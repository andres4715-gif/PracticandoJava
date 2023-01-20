package MyPractice.entrevistas.ejerciciosDePractica;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;

public class MisDatosDeEscrituraEjercicioConListas {

    public static void main(String[] args) {
        int[] puntajeDeLaPrueba = {38, 45, 38, 34, 37, 36, 39, 36, 34, 37};

        List<Integer> list = Arrays.asList(ArrayUtils.toObject(puntajeDeLaPrueba));

        System.out.println("La suma de todos los intentos es: " + sumaDeLaData(list));
        System.out.println("El promedio de todos los resultados es: " + promedio(list));
        System.out.println("El puntaje mayor obtenido es: " + puntajeMasAlto(list));
        System.out.println("El puntaje menor obtenido es: " + puntajeMasBajo(list));
        System.out.println("La cantidad de intentos con resultados mayores a 45 fueron: " + cantidadDeIntentosMayores45(list));
        System.out.println("La cantidad de intentos con resultados menores a 35 fueron: " + validarMenorDe35(list));
        System.out.println("Se obtuvieron resultados repetidos?: " + intentosConMismoResultado(list));
    }

    public static int sumaDeLaData(List<Integer> data) {
        int suma = 0;
        for (int datos : data) {
            suma += datos;
        }
        return suma;
    }

    public static float promedio(List<Integer> data) {
        int totaDatos = data.size();
        float promedio;
        int suma = 0;
        for (int datos : data) {
            suma += datos;
        }
        promedio = (suma / totaDatos);
        return promedio;
    }

    public static int puntajeMasAlto(List<Integer> data) {
        int max = data.get(0);

        for (int datos : data) {
            if (datos > max) {
                max = datos;
            }
        }
        return max;
    }

    public static int puntajeMasBajo(List<Integer> data) {
        int menor = data.get(0);

        for (int datoMenor : data) {
            if (datoMenor < menor) {
                menor = datoMenor;
            }
        }
        return menor;
    }

    public static int cantidadDeIntentosMayores45(List<Integer> data) {
        int contadorDeDatos = 0;

        for (int datos : data) {
            if (datos > 45) {
                contadorDeDatos++;
            }
        }
        return contadorDeDatos;
    }

    public static int validarMenorDe35(List<Integer> data) {
        int contadorIntentosMenoresDe35 = 0;

        for (int datos : data) {
            if (datos < 35) {
                contadorIntentosMenoresDe35++;
            }
        }
        return contadorIntentosMenoresDe35;
    }

    public static boolean intentosConMismoResultado(List<Integer> data) {
        boolean datosRepetidos = false;
        int checking = data.get(0);
        int contadorDeDatosRepetidos = 0;

        for(int myData : data) {
            if(myData == checking) {
                contadorDeDatosRepetidos++;
            }
        }
        if(contadorDeDatosRepetidos > 0) {
            datosRepetidos = true;
        }
        return datosRepetidos;
    }
}