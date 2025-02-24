public class MethodReturnTypes {

  public static void main(String[] args) {
      displayWelcomeMessage(); // Call the welcome message method

      // Declare variables
      int value1 = 20;
      int value2 = 30;

      // Call calculateAverage method
      double result = calculateAverage(value1, value2);

      // Print the result
      System.out.println("The average is: " + result);
  }

  // Method to display a welcome message
  public static void displayWelcomeMessage() {
      System.out.println("Welcome to our program!");
  }

  // Method to calculate the average of two numbers
  public static double calculateAverage(int num1, int num2) {
      return (num1 + num2) / 2.0; // Correct calculation
  }
}