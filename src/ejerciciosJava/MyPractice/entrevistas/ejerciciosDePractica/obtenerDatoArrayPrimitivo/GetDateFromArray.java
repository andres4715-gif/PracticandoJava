package ejerciciosJava.MyPractice.entrevistas.ejerciciosDePractica.obtenerDatoArrayPrimitivo;

public class GetDateFromArray {
    // Obtener n data de un array primitivo
    public static void main(String[] args) {
        Operation operation = new Operation();

        int[] array = {1, 2, 3, 4, 5};

        int value = Operation.getValueFromPrimitiveArray(operation.finalData(array), 1);
        System.out.println(value);
    }
}
