package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Demonstrates a repetitive menu of choices.
 * Everytime the user will insert a number (int),
 * between numbers : one to four , he will receive a feedback message
 * of his choice , and the menu will reappear.
 * If the user inserts a number greater than five or
 *  a number less than zero, he will get an
 *  "incorrect choice" feedback, but if the user inserts number
 *  five, then the program will stop and exit.
 */
public class MenuOfChoiceNewApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Please provide a number of your choice: ");
            System.out.println("1. Import.");
            System.out.println("2. Deletion.");
            System.out.println("3. Update.");
            System.out.println("4. Search.");
            System.out.println("5. Exit.");
            choice = in.nextInt();

            if (choice == 5) {
                System.out.println("Program is closing.");
                break;
            } if (choice < 0 || choice > 5) {
                System.out.println("Invalid number please type again.");
                continue;
            }
            if (choice == 1) {
                System.out.println("Thank you for choosing import.");
            } else if (choice == 2) {
                System.out.println("Thank you for choosing deletion.");
            } else if (choice == 3) {
                System.out.println("Thank you for choosing update.");
            } else if (choice == 4) {
                System.out.println("Thank you for choosing search.");
            }
        }
    }
}
