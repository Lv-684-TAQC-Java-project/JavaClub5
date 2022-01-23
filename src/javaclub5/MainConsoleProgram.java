package javaclub5;

import javaclub5.basicprogram.task1.Task1;
import javaclub5.basicprogram.task2.Task2;

import java.util.Scanner;

public class MainConsoleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taskNumber;
        while (true) {
            try {
                System.out.println("Select task (1-72):");
                taskNumber = Integer.parseInt(scanner.nextLine());
                if (taskNumber < 1 || taskNumber > 72) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("Number incorrect!");
            }
        }

        switch (taskNumber) {
            case 1 :
                Task1.start(scanner);
            case 2 :
                Task2.start(scanner);
        }
    }
}

