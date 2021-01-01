import java.util.Scanner;

public class Objective4Lab1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String fname = "";
        String lname = "";
        String favoriteAnimal = "";
        String favoriteFood = "";
        String favoriteSong = "";

        //TODO prompt the user to get input for all of the String variables.
        System.out.println("Enter your first name: ");
        fname = keyboard.next();
        System.out.println("Enter your Last name: ");
        lname = keyboard.next();
        System.out.println("Enter your favorite animal: ");
        favoriteAnimal = keyboard.next();
        System.out.println("Enter your favorite food: ");
        favoriteFood = keyboard.next();
        System.out.println("Enter your favorite song: ");
        favoriteSong = keyboard.next();
        System.out.println("My name is " + fname + " " + lname);
        System.out.println("My favorite animal is the " + favoriteAnimal);
        System.out.println("My favorite food is " + favoriteFood);
        System.out.println("My favorite song is " + favoriteSong);
        //TODO print the output formatted to look like the expected output using String concatenation.

    }
}
