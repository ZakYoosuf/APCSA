package Chapter04;

import java.util.Scanner;

/**
 * Finds a lot of financial details from the inputs
 *
 * @author Zakarea Yoosuf
 */
public class C4_3 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        double fed, state, hour, rate;
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = input.next();
        System.out.print("Enter the hours worked: ");
        hour = input.nextDouble();
        System.out.print("Enter the hourly wage: $");
        rate = input.nextDouble();
        System.out.print("Enter the federal witholding rate: ");
        fed = input.nextDouble();
        System.out.print("Enter the state witholding rate: ");
        state = input.nextDouble();
        System.out.println("Employee name: " + name);
        System.out.println("Hours Worked: " + hour);
        System.out.println("Pay Rate: " + rate);
        System.out.println("Gross Pay: $" + (hour * rate));
        System.out.println("Deductions: ");
        System.out.println("Federal Withholding (" + (fed * 100) + "%): $" + (hour * rate * fed));
        System.out.println("State Withholding (" + (state * 100) + "%): $" + (hour * rate * state));
        System.out.println("Total Deduction: $" + (hour * rate * fed + hour * rate * state));
        System.out.println("Net Pay: $" + (hour * rate - hour * rate * fed - hour * rate * state));
    }
}
