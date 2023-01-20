package ejerciciosJava.MyPractice.entrevistas.ejerciciosDePractica;

public class TimeConversion {

    public static void main(String[] args) {
        String newAmHoraAm;
        // String hora = "08:01:45PM";
        String hora = "12:01:00AM";

        if(hora.contains("PM")) {
            String horas = hora.substring(0, 2);
            int newHoras = (Integer.parseInt(horas)) + 12;

            String minutosAndSeconds = hora.substring(2,8);
            String numberAsString = Integer.toString(newHoras);
            String result = String.join("",numberAsString,minutosAndSeconds);
            System.out.println(result);
        } else if(hora.contains("AM")) {
            String minutosAndSeconds = hora.substring(2,8);
            newAmHoraAm = hora.substring(0, 2);

            if(newAmHoraAm.contains("12")) {
                newAmHoraAm = "00";
            }

            String result = String.join("",newAmHoraAm,minutosAndSeconds);
            System.out.println(result);
        }
    }
}
