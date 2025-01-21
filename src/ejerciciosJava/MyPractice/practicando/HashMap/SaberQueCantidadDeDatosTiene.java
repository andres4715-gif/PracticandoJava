package ejerciciosJava.MyPractice.practicando.HashMap;

import java.util.HashMap;

public class SaberQueCantidadDeDatosTiene {

    public static void main(String[] args) {
        HashMap<String, Integer> calzado = new HashMap<>();
        calzado.put("Liliana", 36);
        calzado.put("Daniel", 41);
        calzado.put("Andres", 40);
        calzado.put("Katherine", 37);
        calzado.put("Liliana", 36);
        calzado.put("Daniel", 41);
        calzado.put("Andres", 40);
        calzado.put("Katherine", 37);

        int cantidadDatos = calzado.size();
        System.out.println(cantidadDatos);
    }
}
