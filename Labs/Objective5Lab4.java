public class Objective5Lab4 {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int userNum;
//Ask for user number
      System.out.println("Please enter a number: ");
      userNum = keyboard.nextInt();
// comparing if number is even
      if(userNum % 2 == 0) {
      System.out.println("The number is even");
    }  else {
        System.out.println("The number is odd");
      }
  }
}
