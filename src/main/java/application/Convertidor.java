package applications;
import java.util.Scanner;

public class Convertidor {
    static void main(String[] args) {
        Scanner Grade = new Scanner(System.in);
        System.out.println("Ingresa los grados que quieras convertir:");

        int grados = Grade.nextInt();
        System.out.println("Ingresa la unidad (C, F o K):");
        String unidad = Grade.next().toUpperCase();

        if (unidad.equals("C")) {
            // Primera operación: Convertir a Fahrenheit
            double fahrenheit = (grados * 9.0 / 5.0) + 32;
            System.out.println(grados + " °C son: " + fahrenheit + " °F");
            // Segunda operación: Convertir a Kelvin
            double kelvin = grados + 273.15;
            System.out.println(grados + " °C son: " + kelvin + " °K ");
            } else if (unidad.equals("F")) {
                // Primera operación: Convertir a Celsius
                double celsius = (grados - 32) * 5.0 / 9.0;
                System.out.println(grados + " °F son: " + celsius + " °C");
                // Segunda operación: Convertir a Kelvin
                double kelvin = (grados - 32) * 5.0 / 9.0 + 273.15;
                System.out.println(grados + " °F son: " + kelvin + " °K ");
            } else if (unidad.equals("K")) {
                // Primera operación: Convertir a Celsius
                double celsius = grados - 273.15;
                System.out.println(grados + " °K son: " + celsius + " °C");
                // Segunda operación: Convertir a Fahrenheit
                double fahrenheit = (grados - 273.15) * 9.0 / 5.0 + 32;
                System.out.println(grados + " °K son: " + fahrenheit + " °F ");
        }

    }
}