package Chapter03;

import java.util.Scanner;

/**
 * Prints the day it is after a certain amount of days
 *
 * @author Zakarea Yoosuf
 */
public class C3_1 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter today's day
        System.out.print("Enter today's day: ");
        int today = input.nextInt();

        //Enter days elepsed since after today for a future day
        System.out.print("Enter number of days elapsed since today: ");
        int days = input.nextInt();
        String twoday = null;
        if (today == 0) {
            twoday = "Sunday";
        }
        if (today == 1) {
            twoday = "Monday";
        }
        if (today == 2) {
            twoday = "Tuesday";
        }
        if (today == 3) {
            twoday = "Wednesday";
        }
        if (today == 4) {
            twoday = "Thursday";
        }
        if (today == 5) {
            twoday = "Friday";
        }
        if (today == 6) {
            twoday = "Saturday";
        }
        String daes = null;
        if (today + days % 7 == 0) {
            daes = "Sunday";
        }
        if (today + days % 7 == 1) {
            daes = "Monday";
        }
        if (today + days % 7 == 2) {
            daes = "Tuesday";
        }
        if (today + days % 7 == 3) {
            daes = "Wednesday";
        }
        if (today + days % 7 == 4) {
            daes = "Thursday";
        }
        if (today + days % 7 == 5) {
            daes = "Friday";
        }
        if (today + days % 7 == 6) {
            daes = "Saturday";
        }
        if (today > 6) {
            System.out.println("Invalid day code");
        } else {
            System.out.println("Today is " + twoday + "and the future day is " + daes);
        }
    }
}
