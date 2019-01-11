package Chapter03;

import java.util.Scanner;

/**
 * Finds if a 3 digit thing is a palindrome
 *
 * @author Zakarea Yoosuf
 */
public class C3_2 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter a 3 digit number");
        int x = user_input.nextInt();

        if (x / 100 == x % 10) {
            System.out.println(x + " is a palindrome");
        } else {
            System.out.println(x + " is not a palindrome");
        }
    }
}
