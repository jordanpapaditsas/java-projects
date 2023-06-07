package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Demonstrates a repetitive menu of choices.
 * Everytime the user will insert a number (int),
 * between numbers : one to four , he will receive a feedback message
 * of his choice , and the menu will reappear.
 * If the user inserts a number greater than five or
 *  a number less or equal to zero, he will get an
 *  "incorrect choice" feedback, but if the user inserts number
 *  five, then the program will stop and exit.
 */
public class MenuOfChoiceApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choiceInput = 0;

        do {
            System.out.println("Please insert your number of choice: ");
            System.out.println("");
            System.out.println("1. Import");
            System.out.println("2. Deletion");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            choiceInput = in.nextInt();

            if (choiceInput == 1) {
                System.out.println("You chose Import.");
            } else if (choiceInput == 2) {
                System.out.println("You chose Deletion.");
            } else if (choiceInput == 3) {
                System.out.println("You chose Update.");
            } else if (choiceInput == 4) {
                System.out.println("You chose Search.");
            } else if (choiceInput <= 0 || choiceInput > 5) {
                System.out.println("Incorrect Input.");
            }

        } while (choiceInput != 5);

            System.out.println("Exit the Program.");
    }
}

