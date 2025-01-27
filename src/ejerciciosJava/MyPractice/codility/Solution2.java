package ejerciciosJava.MyPractice.codility;

/*
Se cuenta con una secuencia de caras de moneda debe ser cara y sello representado asi:
Cara = 0
sello = 1
la idea es encontrar la cantidad que hace falta:

ejemplos:
dado el array A:
-> A = [1, 0, 1, 0, 1, 1] debe retornar 1
-> A = [1, 1, 0, 1, 1] debe retornar 2

 */
public class Solution2 {
    public static void main(String[] args) {

        Solution2 sol = new Solution2();
        sol.solution(new int[]{1, 1, 1, 0, 1, 1});
    }

    public void solution(int[] A) {
        int contador =  0;
        if (A[0] == 1) {
            for (int i = 1; i < A.length; i++) {
                if(A[i] == 0) {
                    System.out.println("si");
                } else {
                    contador ++;
                    System.out.println("contador: " + contador);
                }
            }
        }
    }
}

