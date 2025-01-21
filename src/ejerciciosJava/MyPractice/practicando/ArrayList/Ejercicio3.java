package ejerciciosJava.MyPractice.practicando.ArrayList;

/*

Rotar los elementos de un ArrayList en Java
Método para desplazar todos los componentes de un Array un lugar a la derecha. El último elemento pasará a la primera posición.
Ejemplo, si el Array original contiene los siguientes valores:

15
22
4
56
71
10
2

Se realizarán los siguientes desplazamientos:

De forma que el contenido final de Array sea este:

2
15
22
4
56
71
10

*/

import java.util.ArrayList;

public class Ejercicio3 {

    public static void main(String[] args) {
        ArrayList<Integer> myData = data();
        int hi = myData.get(myData.size() - 1);
        myData.remove(myData.size() - 1);
        myData.add(0, hi);
        System.out.println(myData);
    }

    private static ArrayList<Integer> data() {
        ArrayList<Integer> data = new ArrayList<Integer>();
        data.add(15);
        data.add(22);
        data.add(4);
        data.add(56);
        data.add(71);
        data.add(10);
        data.add(2);
        return data;
    }
}
