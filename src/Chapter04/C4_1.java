package Chapter04;

import java.util.Scanner;

/**
 * Uses a code to tell what class someone is in
 *
 * @author Zakarea Yoosuf
 */
public class C4_1 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        String choice, first = "NO";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 characters: ");
        choice = input.next();
        if (choice.charAt(0) == 'M' || choice.charAt(0) == 'C' || choice.charAt(0) == 'I') {
            switch (choice.charAt(0)) {
                case 'M':
                    first = "Mathematics ";
                    break;
                case 'C':
                    first = "Computer Science ";
                    break;
                case 'I':
                    first = "Information Technology ";
                    break;
            }
            switch (choice.charAt(1)) {
                case '1':
                    System.out.println(first + "Freshman");
                    break;
                case '2':
                    System.out.println(first + "Sophomore");
                    break;
                case '3':
                    System.out.println(first + "Junior");
                    break;
                case '4':
                    System.out.println(first + "Senior");
                    break;
                default:
                    System.out.println(first + "Invalid input");
                    break;
            }
        } else {
            System.out.println("Invalid Input");
        }

    }
}
