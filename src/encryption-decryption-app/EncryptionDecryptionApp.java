package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 *  Demonstrates a program, that encrypts and
 *  decrypts a String given by the user, by
 *  replacing it with the next ASCII character.
 */
public class EncryptionDecryptionApp {

    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);

        str = getString("Please provide a string for encryption / decryption: ", in);

        encryption(str);
        System.out.println(str + " " + "Encrypted: " + encryption(str));

        decryption(str);
        System.out.println(str + " " + "Decrypted: " + decryption(str));
    }

    public static String encryption(String s) {
        // Using StringBuilder class from Java
        StringBuilder encryption = new StringBuilder();

        // Traversing and replacing each char with the next ASCII char.
        for (int i = 0; i < s.length(); i++) {
            char enc = (char)(s.charAt(i) + 1);
//            encryption.append(Integer.toString(enc));  Encryption into integer.
            encryption.append(enc);
        }
        return encryption.toString();
    }

    public static String decryption(String s) {
        // Using StringBuilder class from Java
        StringBuilder decryption = new StringBuilder();

        // Traversing and replacing each char with the previous ASCII char.
        for (int i = 0; i < s.length(); i++) {
            char dec = (char)(s.charAt(i) - 1);
//            decryption.append(Integer.toString(dec));  Decryption into integer.
            decryption.append(dec);
        }
        return decryption.toString();
    }

    public static String getString(String inputString, Scanner in) {
        System.out.println(inputString);
        return in.nextLine();
    }
}
