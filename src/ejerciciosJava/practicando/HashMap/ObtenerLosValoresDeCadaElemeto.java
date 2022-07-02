package ejerciciosJava.practicando.HashMap;

import java.util.HashMap;

public class ObtenerLosValoresDeCadaElemeto {

    public static void main(String[] args) {

        HashMap<String, Integer> calzado = new HashMap<>();
        int sumaCalzado = 0;

        calzado.put("Liliana", 36);
        calzado.put("Daniel", 41);
        calzado.put("Andres", 40);
        calzado.put("Katherine", 37);

        for (int tallaCalzado : calzado.values()) {
            sumaCalzado = sumaCalzado + tallaCalzado;
        }
        System.out.println("la suma de todo el calzado es: " + sumaCalzado);

        int contador = 1;
        for (String nombres : calzado.keySet()) {
            System.out.println(nombres + contador);
            contador ++;
        }
    }
}
