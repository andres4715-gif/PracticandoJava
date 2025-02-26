package ejerciciosJava.MyPractice.practicando.datosDeEscritura;

public class MisDatosDeEscrituraEjercicioConArrays {

  public static void main(String[] args) {
    Inheritance inheritance = new Inheritance();

    int[] dataList = {38, 45, 38, 34, 37, 36, 39, 36, 34, 37};

    System.out.println("🚀 --- Total sum: " + inheritance.sum(dataList));
    System.out.println("🚀 --- AVG: " + inheritance.average(dataList));
    System.out.println("🚀 --- Max: " + inheritance.maxPoint(dataList));
    System.out.println("🚀 --- Min: " + inheritance.min(dataList));
    System.out.println("🚀 --- Max count: " + inheritance.maxCountAvg(dataList));
    System.out.println("🚀 --- Min count: " + inheritance.minCountAvg(dataList));
    System.out.println("🚀 --- repeated numbers: " + inheritance.repeatedNumbers(dataList));
  }
}