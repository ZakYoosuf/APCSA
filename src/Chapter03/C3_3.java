package Chapter03;

import java.util.Scanner;
import java.util.Random;

/**
 * rock paper scissors game
 *
 * @author Zakarea Yoosuf
 */
public class C3_3 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Scissor (0), rock(1), paper (2): ");
        int x = user_input.nextInt();
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;
        //draws
        if (x == n) {
            switch (x + 0) {
                case 0:
                    System.out.println("The computer is scissors. You are scissors. It is a draw");
                    break;
                case 1:
                    System.out.println("The computer is rock. You are rock. It is a draw");
                    break;
                case 2:
                    System.out.println("The computer is paper. You are paper. It is a draw");
                    break;
            }
        }

        if (x == 0) {
            switch (n + 0) {
                case 1:
                    System.out.println("The computer is rock. You are scissors. you lose");
                    break;
                case 2:
                    System.out.println("The computer is paper. You are scissors. you win");
                    break;

            }
        }
        if (x == 1) {
            switch (n + 0) {
                case 0:
                    System.out.println("The computer is scissors. You are rock. you win");
                    break;
                case 2:
                    System.out.println("The computer is paper. You are rock. you lose");
                    break;

            }

        }
        if (x == 2) {
            switch (n + 0) {
                case 0:
                    System.out.println("The computer is scissors. You are paper. you lose");
                    break;
                case 1:
                    System.out.println("The computer is rock. You are paper. you win");
                    break;

            }
        }

    }
}
