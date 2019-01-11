package Chapter02;

import java.util.Scanner;

/**
 * uses the acceleration, velocity, and time to come up with the new
 * acceleration
 *
 * @author Zakarea Yoosuf
 */
public class C2_1 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insert acceleration: ");
        double v0 = input.nextDouble();

        System.out.print("Insert Velocity: ");
        double v1 = input.nextDouble();

        System.out.print("Insert Time: ");
        double T = input.nextDouble();

        double Acc = (v1 - v0) / T;
        System.out.print("A = " + Acc);

    }
}
