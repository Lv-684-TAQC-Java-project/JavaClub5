package solutions.strings;

import program.helper.Helper;
import solutions.Executable;

import java.util.Arrays;

public class AbbreviateATwoWordName implements Executable {

    public static String abbrevName(String name) {
        String[] initials = name.split(" ");
        name = String.valueOf(Character.toUpperCase(initials[0].charAt(0))) + "." +
                String.valueOf(Character.toUpperCase(initials[1].charAt(0)));
        return name;
    }

    @Override
    public void execute() {
        System.out.println("Takes name like this Mark Avrelij" +
                "\nAnd returns initials M.A");
        System.out.println("Name: ");
        String s1 = Helper.getWord();
        System.out.println("Surname: ");
        String s2 = Helper.getWord();
        s1 = abbrevName(s1 +" "+ s2);
        System.out.println("Result is: " +s1);

    }
}
