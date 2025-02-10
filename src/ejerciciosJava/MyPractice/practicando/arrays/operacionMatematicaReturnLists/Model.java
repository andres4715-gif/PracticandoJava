package ejerciciosJava.MyPractice.practicando.arrays.operacionMatematicaReturnLists;

import java.util.List;

public class Model {

    private final List<Integer> numerosPares;

    public Model(List<Integer> numerosPares) {
        this.numerosPares = numerosPares;
    }

    public List<Integer> getNumerosPares() {
        return numerosPares;
    }
}
