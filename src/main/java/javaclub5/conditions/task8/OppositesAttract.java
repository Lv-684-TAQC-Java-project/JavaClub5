package javaclub5.conditions.task8;

import java.util.Scanner;

/**
 * Timmy & Sarah think they are in love, but around where they live,
 * they will only know once they pick a flower each.
 * If one of the flowers has an even number of petals and the other has an odd number of petals
 * it means they are in love.
 * Write a function that will take the number of petals of each flower
 * and return true if they are in love and false if they aren't.
 *
 * @author Popova Anna
 */
public class OppositesAttract {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("In this game if you have even number of petals, you are not in love," +
                " but if odd than you are.");
        System.out.println("Girl enters her amount of petals: ");
        int flower1 = sc.nextInt();
        System.out.println("Boy enters his amount of petals: ");
        int flower2 = sc.nextInt();

        if (!isLove(flower1, flower2)) {
            System.out.println("You are not in Love!");
        } else {
            System.out.println("You are in Love!");
        }

    }

    public static boolean isLove(int flower1, int flower2) {
        return flower1 != flower2;
    }
}
