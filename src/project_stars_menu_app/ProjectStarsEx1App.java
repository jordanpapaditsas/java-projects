package project_stars_menu_app;

import java.util.Scanner;

/**
 *    Demonstrates a repetitive menu of 6 options.
 *   Asks the user to choose an option from menu,
 *   then it asks the user again to give a number,
 *   which will print stars ('*') accordingly of his input number.
 *    The program will then print stars ('*'), according
 *   to the user's choice and the user's number input.
 *    If the user chooses option 6. of the menu, then the program
 *    stops running, otherwise if the user gives an input < 1 or
 *    an input > 6, the program will give an "invalid message" and will
 *    prompt the user to give correct inputs again.
 */
public class ProjectStarsEx1App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            printMenu();
            choice = getNextInt("Please choose an option: ");

            if (choiceExit(choice)) {
                System.out.println("Exit program.");
                break;
            }
            if (invalidChoice(choice)) {
                System.out.println("Invalid choice, please choose again...");
                continue;
            }

            getChoice(choice);
        } while (true);
    }

    public static void printMenu() {
        System.out.println("1. Print out stars horizontally: ");
        System.out.println("2. Print out stars vertically: ");
        System.out.println("3. Print out 'n' lines with 'n' stars: ");
        System.out.println("4. Print out 'n' lines with 'n' stars 1 - n (Asc): ");
        System.out.println("5. Print out 'n' lines with 'n' stars n - 1 (Desc): ");
        System.out.println("6. Exit program.");
    }

    public static int getNextInt(String message) {
        System.out.println(message);
        return in.nextInt();
    }

    public static void getChoice(int choice) {
        int starsNum;
        System.out.println("Please provide a num for stars: ");
        starsNum = in.nextInt();

        switch (choice) {
            case 1:
                starsHorizontally(starsNum);
                break;
            case 2:
                starsVertically(starsNum);
                break;
            case 3:
                linesStars(starsNum);
                break;
            case 4:
                starsAsc(starsNum);
                break;
            case 5:
                starsDesc(starsNum);
                break;
            default:
                break;
        }
    }

    public static boolean invalidChoice(int choice) {

        return choice < 1 || choice > 5;
    }

    public static boolean choiceExit(int choice) {

        return choice == 6;
    }

    public static void starsHorizontally(int starsNum) {
        for (int i = 1; i <= starsNum; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void starsVertically(int starsNum) {
        for (int i = 1; i <= starsNum; i++) {
            System.out.println("*");
        }
    }

    public static void linesStars(int starsNum) {
        for (int i = 1; i <= starsNum; i++) {
            starsHorizontally(starsNum);
        }
    }

    public static void starsAsc(int starsNum) {
        for (int i = 1; i <= starsNum; i++) {
            starsHorizontally(i);
        }
    }

    public static void starsDesc(int starsNum) {
       for (int i = 1; i <= starsNum; starsNum--) {
           starsHorizontally(starsNum);
       }
    }
}
