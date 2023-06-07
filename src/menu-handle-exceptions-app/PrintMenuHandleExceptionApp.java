package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * Demonstrates a program with 3 methods, first method prints out a menu of
 * 5 choices with a printMenu() method.
 * Second one is indicating the choice that it will receive from the user input (Scanner)
 * getChoice(), and if the user gives an invalid input (non integer)
 * it will have to handle it with state-testing method (hasNextInt()).
 * Third method is going to be a printChoice method, which it will be
 * printing out the choice of the user input (Scanner). If the
 * choice will not  be between 1 and 5, then the method will throw
 * an IllegalArgumentException.
 * Additionally, the program will have to be modified, to interact with
 * the user through an appropriate feedback message.
 */
public class PrintMenuHandleExceptionApp {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        printMenu();

        while (true) {
            choice = getChoice(in);
            // Recovering the IllegalArgumentException through try { body } catch.
            try {
                printChoice(choice);
                break;
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                System.out.println("Please provide a valid choice between 1 and 5.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("1.Start Program");
        System.out.println("2.Pause Program");
        System.out.println("3.Update Program");
        System.out.println("4.Delete Program");
        System.out.println("5.Exit Program");
    }

    public static int getChoice(Scanner in) {
        int choice;
        System.out.println("Please choose an option: ");

        while (true) {
            // Validates if the choice is valid / invalid.
            if (in.hasNextInt()) {
                choice = in.nextInt();
                if (choice < 1 || choice > 5) {
                    System.out.println("Invalid choice: Enter a valid choice: ");
                }
                break;
            } else {
                in.nextLine();
                System.out.println("Invalid input.. Please insert an int: ");
            }
        }
        return choice;
    }

    public static void printChoice(int choice) throws IllegalArgumentException {
        if (choice < 1 || choice > 5)

            // Throws the exception.
            throw new IllegalArgumentException ("Incorrect choice. Choice out of bounds.");
        switch (choice) {
            case 1:
                System.out.println("Starting program!");
                break;
            case 2:
                System.out.println("Pausing program.");
                break;
            case 3:
                System.out.println("Updating program!!");
                break;
            case 4:
                System.out.println("Deleting program.. :(");
                break;
            case 5:
                System.out.println("Exiting program..We will miss you..");
            default:
                break;
        }
    }
}