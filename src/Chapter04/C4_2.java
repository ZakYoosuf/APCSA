package Chapter04;

import java.util.Scanner;

/**
 * Checks if something is s substring
 *
 * @author Zakarea Yoosuf
 */
public class C4_2 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        String choice, choice2;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        choice = input.next();
        System.out.print("Enter another string: ");
        choice2 = input.next();
        if (choice.contains(choice2)) {
            System.out.println(choice2 + " is a substring of " + choice + ".");
        } else {
            System.out.println(choice2 + " is a substring of " + choice + ".");
        }

    }
}
