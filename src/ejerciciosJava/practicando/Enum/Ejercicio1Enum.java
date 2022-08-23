package ejerciciosJava.practicando.Enum;

public class Ejercicio1Enum {

    public enum AuthStateEnum {

        AUTHENTIFIE("authentifié"),
        MAX_AUTHENTIFIE("max authentifié"),
        NOT_AUTHENTIFIE("non authentifié");

        private String value;
        AuthStateEnum(String value) {
            this.value = value;
        }

        String getValue1() {
            return value;
        }
    }
}
