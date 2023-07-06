package test;

public class Main {

    public static void main(String[] args) {
        ISpeakable alice = new Cat("Alice");
        ISpeakable bob = new Dog("Voron");
        ISpeakable georgia = new Cat("Gianna");

        alice.speak();
        bob.speak();
        georgia.speak();





    }
}
