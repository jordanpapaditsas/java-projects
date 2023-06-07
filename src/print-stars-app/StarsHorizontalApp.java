package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 *  Demonstrates a program, that
 *  the user will insert a num, and the
 *  program will print stars '*' horizontally
 *  accordingly of the user's input.
 */
public class StarsHorizontalApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Please input a num: ");
        num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
    }
}
