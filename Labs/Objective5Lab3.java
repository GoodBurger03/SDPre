public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int userNum;
//Ask for user number
      System.out.println("Please enter a number: ");
      userNum = keyboard.nextInt();
// comparing if number is positive
      if(userNum > 0) {
      System.out.println("The number is positive");
    }  else {
        System.out.println("The number is not positive");
      }


  
  }
}
