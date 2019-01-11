package Chapter02;

import java.util.Scanner;

/**
 * Prints out the balance times an interest rate
 *
 * @author Zakarea Yoosuf
 */
public class C2_2 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the balance?");
        double balance = input.nextDouble();
        System.out.println("What is the interest rate?");
        double interestrate = input.nextDouble();
        double interest = balance * interestrate / 1200;
        System.out.println("The interest is: " + interest);

    }
}
