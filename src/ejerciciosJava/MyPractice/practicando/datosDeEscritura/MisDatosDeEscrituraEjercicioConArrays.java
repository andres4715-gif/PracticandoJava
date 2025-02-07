package ejerciciosJava.MyPractice.practicando.datosDeEscritura;

public class MisDatosDeEscrituraEjercicioConArrays {

    public static void main(String[] args) {
        Inheritance inheritance = new Inheritance();

        int[] data = {38, 45, 38, 34, 37, 36, 39, 36, 34, 37};

        System.out.println("La suma de todos los intentos es: " + inheritance.sumaDeLaData(data));
        System.out.println("El promedio de todos los resultados es: " + inheritance.average(data));
        System.out.println("El puntaje mayor obtenido es: " + inheritance.puntajeMasAlto(data));
        System.out.println("El puntaje menor obtenido es: " + inheritance.puntajeMasBajo(data));
        System.out.println("La cantidad de intentos con resultados mayores a 45 fueron: " + inheritance.cantidadDeIntentosMayores45(data));
        System.out.println("La cantidad de intentos con resultados menores a 35 fueron: " + inheritance.validarMenorDe35(data));
        System.out.println("Se obtuvieron resultados repetidos?: " + inheritance.intentosConMismoResultado(data));
    }
}