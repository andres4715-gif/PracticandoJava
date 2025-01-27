package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio3;

import java.util.ArrayList;
import java.util.List;

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

public class Main {
    public static void main(String[] args) {

        List<Integer> data = new ArrayList<Integer>();
        data.add(15);
        data.add(22);
        data.add(4);
        data.add(56);
        data.add(71);
        data.add(10);
        data.add(2);

        ListaDeNumeros listaDeNumeros = Ejercicio3.metodosLista(data);
        System.out.println(listaDeNumeros.getOrdenarLista());
    }
}
