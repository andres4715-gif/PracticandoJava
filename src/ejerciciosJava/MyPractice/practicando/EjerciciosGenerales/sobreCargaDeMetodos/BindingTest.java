package ejerciciosJava.MyPractice.practicando.EjerciciosGenerales.sobreCargaDeMetodos;

public class BindingTest {

    public static void main(String[] args) {
        Padre p = new Hijo();
        p.metodoEstatico();

        Hijo h = new Hijo();
        h.metodoEstatico();
    }
}
