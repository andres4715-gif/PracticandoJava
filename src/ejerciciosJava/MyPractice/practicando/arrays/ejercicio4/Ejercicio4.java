package ejerciciosJava.MyPractice.practicando.arrays.ejercicio4;

/*
  desde un array con 10 numeros crear un array nuevo con los numeros pares
*/
public class Ejercicio4 {

    public static void main(String[] args) {
        int[] finalData = {10, 20, 30, 40, 50, 41, 43, 57, 89, 97};

        Model model = MetodosEjercicio4.metodosDel4(finalData);
        System.out.println(model.getNumerosPares());
    }
}
