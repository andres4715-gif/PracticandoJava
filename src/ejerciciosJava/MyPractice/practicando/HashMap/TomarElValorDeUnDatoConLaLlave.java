package ejerciciosJava.MyPractice.practicando.HashMap;

import java.util.HashMap;

public class TomarElValorDeUnDatoConLaLlave {

    public static void main(String[] args) {
        HashMap<String, Integer> calzado = new HashMap<String, Integer>();
        calzado.put("Liliana", 36);
        calzado.put("Daniel", 41);
        calzado.put("Andres", 40);

        System.out.println(calzado.get("Andres"));
    }
}

