package conversion_temp_app;

import java.util.Scanner;

/**
 *  Demonstrates Dates, with the
 *  use of Modulo Operation at the variable Year.
 */
public class PrintDateApp {

    public static void main(String[] args) {
        // Declaring and initializing our variables
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        // Executing commands
        System.out.println("Type Date: ");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt() % 100;

        // Printing results
        System.out.printf("%02d/%02d/%02d%n", day, month, year);
    }
}
