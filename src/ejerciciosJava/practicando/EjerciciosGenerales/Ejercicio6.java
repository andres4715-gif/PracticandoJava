package ejerciciosJava.practicando.EjerciciosGenerales;

public class Ejercicio6 {

    /*
          Realiza el programa en JAVA tal que dado como dato el sueldo de un trabajador, le aplique un
          aumento del 15% si su sueldo es inferior a $1000 y 12% en caso contrario. Imprima
          el nuevo sueldo del trabajador.

          Dato: SUE (variable de tipo real que representa el sueldo del trabajador).
    */

    public static void main(String[] args) {

        int SUE = 1001;

        if(SUE < 1000) {
            System.out.println(SUE + SUE * 0.15);
        } else {
            System.out.println(SUE + SUE * 0.12);
        }
    }
}
