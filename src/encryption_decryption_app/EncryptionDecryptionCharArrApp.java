package encryption_decryption_app;

import java.util.Scanner;

/**
 * This program demonstrates encryption and decryption of
 *  a String, given by the user input.
 */
public class EncryptionDecryptionCharArrApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stringGivenForEncryption;
        String decryptedString;

        System.out.println("Encryption Program starts!");

        System.out.println("Please provide the String you want to encrypt: ");
        stringGivenForEncryption = getString(in);

        System.out.println("Encryption has been successful.");
        System.out.println("Encrypted String: " + encryption(stringGivenForEncryption));

        decryptedString = decryption(stringGivenForEncryption);

        System.out.println();

        System.out.println("Decryption has been successful.");
        System.out.println("Decrypted String: " + decryptedString);

        System.out.println();

        System.out.println("Thank you for your time using our program, have a nice day!");

        in.close();
    }

    public static String encryption(String s) {
        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
        return new String (array);
    }

    public static String decryption(String s) {
        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            array[i]--;
        }
        return s;
    }

    public static String getString(Scanner in) {
        return in.nextLine();
    }
}

