package ejerciciosJava.practicando.hashSet;

import java.util.HashSet;

public class HashsetEjercicio3_objetos {

    public static void main(String[] args) {

        // create a HashSet
        HashSet<Persona> hs = new HashSet<Persona>();
        hs.add(new Persona("Andres", 78));
        hs.add(new Persona("Andres", 78));
        hs.add(new Persona("Andres", 78));
        hs.add(new Persona("Camilo", 5));
        hs.add(new Persona("Stevan", 65));
        hs.add(new Persona("Liliana", 45));

        for (Persona checkList : hs) {
            System.out.println(checkList.getNombre());
        }
    }
}
