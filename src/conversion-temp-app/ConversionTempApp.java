package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 *  Demonstrates conversion from temperature Fahrenheit,
 *  into temperature Celsius.
 */
public class ConversionTempApp {

    public static void main(String[] args) {

        // Declaring and initializing variables
        Scanner in = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;

        // Executing commands
        System.out.println("Input temperature in Fahrenheit degrees" + "\u00B0" + ":");
        fahrenheit = in.nextInt();

        celsius = 5 * (fahrenheit - 32) / 9;

        // Printing results
        System.out.printf("Degrees in Celsius: %d\u00B0%n", fahrenheit, celsius);
    }
}
