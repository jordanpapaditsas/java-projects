package print_stars_app;

import java.util.Scanner;

/**
 * Demonstrates a program, that
 * asks the user for a num input.
 * Then the program prints out '*' Stars
 * accordingly by the users input, as
 *  1 till n.
 */
public class StarsHalfPyramidAsc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert a num: ");
        num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
