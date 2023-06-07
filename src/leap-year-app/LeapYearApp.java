package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *  Demonstrates if a year will be
 *  a leap year or not.
 *  Asks the user to type a year (int),
 *  and the program will start running.
 *  After the checkup , prints out if
 *  the year that the user typed, is a leap year, or
 *  not.
 */
public class LeapYearApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;

        System.out.println("Please insert a Year (int): ");
        year = in.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + "," + " " + "is a leap year.");
                } else {
                    System.out.println(year + "," + " " + "is not a leap year.");
                }
            } else {
                System.out.println(year + "," + " " + "is a leap year.");
            }
        } else {
            System.out.println(year + "," + " " + "is not a leap year.");
        }
    }
}
