package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *  Demonstrates if a year will be
 *  a leap year or not.
 *  Asks the user to type a year (int),
 *  and our program will start running.
 *  After the checkup , prints out if
 *  the year that user typed, is a leap year, or
 *  not.
 */
public class YearLeapNotAppealApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;

        System.out.println("Please insert a year (int): ");
        year = in.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.printf("Year: %d, is a leap year.", year);
        } else if (year % 400 == 0) {
            System.out.printf("Year: %d, is a leap year.", year);
        } else {
            System.out.printf("Year: %d, is not a leap year.", year);
        }
    }
}