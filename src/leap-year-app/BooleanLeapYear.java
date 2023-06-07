package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Demonstrates if a year is a leap year
 * with TRUE/FALSE. Asks the user
 * to input a year (int) , and then
 * it gives us back the results , if the year the user
 * typed , is TRUE for leap year or
 * FALSE for not a leap year.
 */
public class BooleanLeapYear {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean leapYear = false;
        boolean notALeapYear = false;

        System.out.println("Please type Year (int): ");
        year = in.nextInt();

        leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        notALeapYear = (year % 4 == 0) && (year % 100 == 0) || (year % 400 != 0);

        System.out.println("Leap Year: " + leapYear);
    }
}
