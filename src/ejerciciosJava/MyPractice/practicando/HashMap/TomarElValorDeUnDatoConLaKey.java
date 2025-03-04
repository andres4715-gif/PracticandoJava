package ejerciciosJava.MyPractice.practicando.HashMap;

import java.util.HashMap;

public class TomarElValorDeUnDatoConLaKey {

    static String seleccionDeCalzado = "tenis adidas 2";

    public static void main(String[] args) {
        HashMap<String, Integer> calzado = new HashMap<>();
        calzado.put("sandaliaReina", 36);
        calzado.put("bota dura", 41);
        calzado.put("bota blanda", 40);
        calzado.put("tenis adidas 2", 37);

        boolean checkingValueData = validarDisponibilidad(calzado, seleccionDeCalzado);
        System.out.println(checkingValueData);
    }

    private static boolean validarDisponibilidad(HashMap data, String tipoCalzado) {
        boolean checkingData = data.containsKey(tipoCalzado);
        return checkingData;
    }
}
