package print_stars_app;

import java.util.Scanner;

/**
 * Demonstrates a program, that
 * the user will insert a num, and the
 * program will print stars '*' Vertically
 * accordingly of the user's input.
 */
public class StarsVerticalApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Please input a num: ");
        num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("*");
        }
    }
}
