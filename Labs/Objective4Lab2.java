import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    //TODO prompt the user to get input for all of the above int variables.
    System.out.println("Enter a number for num1: ");
    num1 = keyboard.nextInt();
    System.out.println("Enter a number for num2: ");
    num2 = keyboard.nextInt();
    System.out.println("Enter a number for num3: ");
    num3 = keyboard.nextInt();

    //TODO prompt the user to get input for all of the above double variables.
    System.out.println("Enter a double number for dub1: ");
    dub1 = keyboard.nextDouble();
    System.out.println("Enter a double number for dub2: ");
    dub2 = keyboard.nextDouble();
    System.out.println("Enter a double number for dub3: ");
    dub3 = keyboard.nextDouble();
    //TODO print the three ints and their sum.
    System.out.println("The sum of " + " " + num1 + " " + "+" + " " +  num2 + " " + "+" + " " + num3 + " " + "=" + " " + (num1 + num2 + num3));
    //TODO print the three doubles and their sum.
    System.out.println("The sum of " + " " + dub1 + " " + "+" + " " + dub2 + " " + "+" + " " + dub3 + " " + "=" + (dub1 + dub2 + dub3));

  }

}
