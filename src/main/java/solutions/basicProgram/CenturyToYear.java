package solutions.basicProgram;

import program.helper.Helper;
import solutions.Executable;

public class CenturyToYear implements Executable {
    int year;
    public static int century(int number) {
        if(number < 0)
        {
            System.out.println("Invalid number");
            return -1;
        }
        else if(number % 100==0)
        {
            return number/100;
        }
        else
        {
            return number/100 + 1;
        }
    }

    public void getData()
    {
        System.out.print("Enter a year: ");
        this.year = Helper.getInt(10000);

    }


    @Override
    public void execute() {
        getData();
        System.out.println("It's a "+century(this.year)+" century");
    }
}
