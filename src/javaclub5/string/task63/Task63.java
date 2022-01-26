package javaclub5.string.task63;

import java.util.Locale;
import java.util.Scanner;

public class Task63 {
    public static String getInitials(String fullName) {
    fullName=fullName.toUpperCase(Locale.ROOT);
    int idxLastWhitespace = fullName.indexOf(' ');
    return fullName.substring(0, 1) +"."+ fullName.substring(idxLastWhitespace + 1, idxLastWhitespace + 2);
}
    public static void main(Scanner sc) {

        try {
            System.out.println("Enter your full name:");
            String x= sc.nextLine();
            System.out.println("Your initials are:"+getInitials(x));
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }

}
