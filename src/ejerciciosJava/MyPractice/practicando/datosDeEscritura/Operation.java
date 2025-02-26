package ejerciciosJava.MyPractice.practicando.datosDeEscritura;

public class Operation {
  protected int sum(int[] data) {
    int totalSum = 0;
    for (int key : data) {
      totalSum += key;
    }
    return totalSum;
  }

  protected float average(int[] data) {
    int numberOfData = data.length;
    float myData3 = 0;
    for (float myData : data) {
      myData3 += myData;
    }
    return (myData3 / numberOfData);
  }

  protected int maxPoint(int[] data) {
    int max = data[0];

    for (int i = 1; i < data.length; i++) {
      if (data[i] > max) {
        max = data[i];
      }
    }
    return max;
  }

  int min(int[] data) {
    int min = data[0];

    for (int i = 1; i < data.length; i++) {
      if (data[i] < min) {
        min = data[i];
      }
    }
    return min;
  }

  int maxCountAvg(int[] data) {
    int intMaxCount = 0;
    for (int i = 1; i < data.length; i++) {
      if (data[i] > average(data)) {
        intMaxCount++;
      }
    }
    return intMaxCount;
  }

  int minCountAvg(int[] data) {
    int intMinCount = 0;

    for (int i = 1; i < data.length; i++) {
      if (data[i] < average(data)) {
        intMinCount++;
      }
    }
    return intMinCount;
  }

  boolean repeatedNumbers(int[] data) {
    int num = data[0];
    boolean checkingData = false;
    int repeatedCount = 0;
    for (int i = 1; i < data.length; i++) {
      if (data[i] == num) {
        repeatedCount++;
      }
    }
    if (repeatedCount > 0) {
      checkingData = true;
    }
    return checkingData;
  }
}
