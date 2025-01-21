package ejerciciosJava.MyPractice.practicando;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GettingDataFormPropertiesFile {

    public static void main(String[] args) {
        Properties prop = new Properties();
        try {
            // Load the properties file
            prop.load(new FileInputStream("src/resources/data.properties"));


            // Access the properties
            String url = prop.getProperty("ta.data.link");
            String user = prop.getProperty("ta.data.user.existing");
            String password = prop.getProperty("ta.data.password.existing");

            // Use the properties
            System.out.println("URL: " + url);
            System.out.println("USER: " + user);
            System.out.println("PASSWORD: " + password);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
