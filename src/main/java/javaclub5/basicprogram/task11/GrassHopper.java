package javaclub5.basicprogram.task11;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * GrassHooper
 *
 * @author Mysakovych Maksym
 */

public class GrassHopper {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        start(reader);
    }

    public static void start(BufferedReader reader) {
        System.out.println("Input temperature in Fahrenheit");
        try {
            int fahrenheitTemperature = Integer.parseInt(reader.readLine());
            System.out.print(weatherInfo(fahrenheitTemperature));

        } catch (IOException e) {
            System.out.println("Wrong input");
        }
    }

    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        System.out.printf("Temperature is: %.2f C\n", c);
        if (c < 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        return (temperature - 32) * ((double)5/9);
    }

}
