package preonboardingexercises;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

    //    welcomeUser();

        completeTheSentence();

    }

    public static void welcomeUser() {
        //print welcome message
        System.out.println("Welcome to my workstation");
        //ask user to input name
        System.out.println("Please enter your name: ");
        //get user's input
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        //print welcome message with user's name
        System.out.println("Welcome " + userName );
        scanner.close();
    }

    public static void completeTheSentence() {
        System.out.println("Enter the season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String seasonOfTheYear = scanner.nextLine();
        System.out.println("Pick a whole number: ");
        int wholeNumber = scanner.nextInt();
        System.out.println("Input an adjective that comes to mind: ");
        String adjective = scanner.nextLine();
        System.out.println("On a " + adjective + " " + seasonOfTheYear + " day, I drink a minimum of " + wholeNumber + " cups of coffee.");
    }
}
