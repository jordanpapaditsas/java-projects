package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Demonstrates a program, that
 * asks the user for a num input.
 * Then the program prints out '*' Stars
 * accordingly by the users input, as
 * n till 1.
 *
 */
public class StarsHalfPyramidDesc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Please input a num: ");
        num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
