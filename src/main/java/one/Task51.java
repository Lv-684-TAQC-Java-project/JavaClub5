package one;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task51 {
    public static String numberToString(int num) {
        return Integer.toString(num);
    }

    public static void task51() {
        System.out.println("The task is to convert integer to string.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Set parameter:");
            int i = Integer.parseInt(reader.readLine());
            System.out.println("Answer: " + numberToString(i));
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}
