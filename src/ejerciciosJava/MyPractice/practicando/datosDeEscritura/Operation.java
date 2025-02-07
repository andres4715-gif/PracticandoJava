package ejerciciosJava.MyPractice.practicando.datosDeEscritura;

public class Operation {
    protected int sumaDeLaData(int[] data) {
        int myData2 = 0;
        for (int key : data) {
            myData2 += key;
        }
        return myData2;
    }

    protected float average(int[] data) {
        int amountOfData = data.length;
        float myData3 = 0;
        for (float myData : data) {
            myData3 += myData;
        }
        float finalData = (myData3 / amountOfData);
        return finalData;
    }

    protected int puntajeMasAlto(int[] data) {
        int mayor = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] > mayor) {
                mayor = data[i];
            }
        }
        return mayor;
    }

    int puntajeMasBajo(int[] data) {
        int menor = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] < menor) {
                menor = data[i];
            }
        }
        return menor;
    }

    int cantidadDeIntentosMayores45(int[] data) {
        int contadorMayores = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] > 45) {
                contadorMayores++;
            }
        }
        return contadorMayores;
    }

    int validarMenorDe35(int[] data) {

        int contadoMenores = 0;

        for (int i = 1; i < data.length; i++) {
            if (data[i] < 35) {
                contadoMenores++;
            }
        }
        return contadoMenores;
    }

    boolean intentosConMismoResultado(int[] data) {
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
