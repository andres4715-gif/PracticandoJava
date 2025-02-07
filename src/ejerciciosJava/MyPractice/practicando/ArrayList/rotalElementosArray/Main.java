package ejerciciosJava.MyPractice.practicando.ArrayList.rotalElementosArray;

import java.util.ArrayList;
import java.util.List;

/*
    Rotar los elementos de un ArrayList en Java
    Metodo para desplazar todos los componentes de un Array un lugar a la derecha.
    El último elemento pasará a la primera posición.
    Ejemplo, si el Array original contiene los siguientes valores: [15, 22, 4, 56, 71, 10, 2]

    Se realizarán los siguientes desplazamientos:
    De forma que el contenido final de Array sea este:
    [2, 15, 22, 4, 56, 71, 10]
*/

public class Main {
    public static void main(String[] args) {

        List<Integer> dataList = new ArrayList<>(List.of(15, 22, 4, 56, 71, 10, 2));

        System.out.println("Original List: " + dataList);
        Models listaDeNumeros = MetodosParaRotar.metodosLista(dataList);
        System.out.println(listaDeNumeros.getOrdenarLista());
    }
}
