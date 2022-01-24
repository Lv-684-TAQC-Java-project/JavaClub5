package javaclub5.mainClasses;

import java.io.BufferedReader;


import static javaclub5.mainClasses.MainProgram.selectTheme;

public class BasicProgramSelection {
    public static void selectBasicProgram(BufferedReader reader) {
        System.out.println("Select number of Task (1-11) \n 0. Main menu \n 12. exit");
        try {
            int selection = Integer.parseInt(reader.readLine());
            switch (selection) {
                case 0:
                    selectTheme(reader);
                    break;
                case 1:
                    javaclub5.basicprogram.task1.Runner.start(reader);
                    break;
                case 2:
                    javaclub5.basicprogram.task2.Runner.start(reader);
                    break;
                case 3:
                    javaclub5.basicprogram.task3.Runner.start(reader);
                    break;
                case 4:
                    javaclub5.basicprogram.task4.Runner.start(reader);
                    break;
                case 5:
                    System.out.println("Not done yet");
                    //javaclub5.basicprogram.task5.Runner.start(reader);
                    break;
                case 6:
                    System.out.println("Not done yet");
                    //javaclub5.basicprogram.task6.Runner.start(reader);
                    break;
                case 7:
                    javaclub5.basicprogram.task7.Runner.start(reader);
                    break;
                case 8:
                    javaclub5.basicprogram.task8.Runner.start(reader);
                    break;
                case 9:
                    System.out.println("Not done yet");
                    //javaclub5.basicprogram.task9.Runner.start(reader);
                    break;
                case 10:
                    System.out.println("Not done yet");
                    //javaclub5.basicprogram.task10.Runner.start(reader);
                    break;
                case 11:
                    System.out.println("Not done yet");
                    //javaclub5.basicprogram.task11.Runner.start(reader);
                    break;
                case 12:
                    break;
                default:
                    System.out.println("Wrong input");
            }
        }
        catch (Exception e) {
            System.out.println("Wrong input");
            selectTheme(reader);
        }
    }
}
