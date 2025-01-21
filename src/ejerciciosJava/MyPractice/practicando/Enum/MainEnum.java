package ejerciciosJava.MyPractice.practicando.Enum;

import static ejerciciosJava.MyPractice.practicando.Enum.Ejercicio1Enum.*;

public class MainEnum {

    public static void main(String[] args) {

        String obteniendoValorDelEnum = AuthStateEnum.MAX_AUTHENTIFIE.getValue1();
        System.out.println(obteniendoValorDelEnum);
    }
}
