package Chapter02;

import java.util.Scanner;

/**
 * Finds the interest based off of milage and prices
 *
 * @author Zakarea Yoosuf
 */
public class C2_3 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the price per gallon?");
        double gasprice = input.nextDouble();
        System.out.println("What is the miles per gallon?");
        double gasefficiency = input.nextDouble();
        System.out.println("What is the interest rate?");
        double Distance = input.nextDouble();
        double cost = Distance * gasprice / gasefficiency;
        System.out.println("The interest is: " + cost);

    }
}
