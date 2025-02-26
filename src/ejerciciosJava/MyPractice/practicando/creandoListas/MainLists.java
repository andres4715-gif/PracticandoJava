package ejerciciosJava.MyPractice.practicando.creandoListas;

import java.util.List;

public class MainLists {
  public static void main(String[] args) {
    int[] numbers = {189, 265, 332, 465, 58, 65, 74432, 856, 9545, 1043, 909};

    List<Integer> myFinalData = ArrayToList.arrayToList(numbers);
    List<Integer> newData = myFinalData.stream()
      .filter(x -> x > 400)
      .map(x -> x + 200)
      .toList();
    System.out.println(newData);
  }
}
