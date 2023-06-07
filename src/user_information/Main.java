package user_information;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        User user = new User(1, "Doctor", "Strange");
        UserCredentials information = new UserCredentials(1, "Marvel", "MarvelOverDC");
        int inputUserId;
        int counter = 3;

        System.out.println("Please enter ID for verification: ");

       try {
           inputUserId = in.nextInt();

           while (counter > 0) {
               if (user.getId() != inputUserId) {
                   System.out.println("UserID incorrect! Please try again... Remaining tries(" + counter + ")");
                   inputUserId = in.nextInt();
                   counter--;
               } else if (user.getId() == inputUserId) {
                   System.out.println("UserID: " + user.getId() + "\n" + "Firstname: " + user.getFirstname() + "\n" +
                           "Lastname: " + user.getLastname() + "\n" + "UserID : " + information.getId() + "\n" +
                           "Username: " + information.getUsername() + "\n" + "Password: " + information.getPassword());
                   break;
               }
           }

           if (counter == 0) {
               System.out.println("Too many incorrect tries, your account is locked.");
           }

       } catch(InputMismatchException e){
           e.printStackTrace();
           throw e;
       }
    }
}
