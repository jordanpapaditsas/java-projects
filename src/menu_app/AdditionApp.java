package menu_app;

import java.util.Scanner;

/**
 *  Demonstrates a mathematical operation.
 */

public class AdditionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Δήλωση και αρχικοποίηση των μεταβλητών
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Εντολές
        num1 = in.nextInt();
        num2 = in.nextInt();


        sum = num1 + num2;

        // Eκτύπωση των αποτελεσμάτων
        System.out.println("Το αποτέλεσμα της πρόσθεσης είναι ίσο με: \n" + sum);
    }
}
