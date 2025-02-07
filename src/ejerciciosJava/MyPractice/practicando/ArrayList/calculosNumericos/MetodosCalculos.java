package ejerciciosJava.MyPractice.practicando.ArrayList.calculosNumericos;

import java.util.ArrayList;
import java.util.List;

public class MetodosCalculos {

    public static Models calculandoDatos(List<Integer> data) {
        List<Integer> getData = dataList(data);
        int getAmount = amount(data);
        int getSumaData = sumaData(data);
        double getMedia = media(data);
        List<Integer> getMayorDelPromedio = mayoresDelPromedio(data);
        List<Integer> getMenorDelPromedio = menoresDelPromedio(data);

        return new Models(getData, getAmount, getSumaData, getMedia, getMayorDelPromedio, getMenorDelPromedio);
    }

    protected static List<Integer> dataList(List<Integer> data) {
        return data;
    }

    private static int amount(List<Integer> data) {
        int checkAmount = data.size();
        return checkAmount;
    }

    private static int sumaData(List<Integer> data) {
        int checkSuma = 0;
        for (int sumando : data) {
            checkSuma += sumando;
        }
        return checkSuma;
    }

    private static double media(List<Integer> data) {
        double media = 0;
        for (Integer sumando : data) {
            media += sumando;
        }
        return media / data.size();
    }

    private static List<Integer> mayoresDelPromedio(List<Integer> data) {
        List<Integer> mayores = new ArrayList<Integer>();
        double operation = 0;
        for (int check : data) {
            if (check > operation) {
                mayores.add(check);
            }
        }
        return mayores;
    }

    private static List<Integer> menoresDelPromedio(List<Integer> data) {
        List<Integer> menores = new ArrayList<Integer>();
        double operation = 0;
        for (int check : data) {
            if (check < operation) {
                menores.add(check);
            }
        }
        return menores;
    }
}
