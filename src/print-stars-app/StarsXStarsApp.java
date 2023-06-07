package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Demonstrates a program, that asks
 * the user to give a num, prints '*' stars
 * accordingly the users input, as
 *  n x n.
 */
public class StarsXStarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Please input a num: ");
        num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
