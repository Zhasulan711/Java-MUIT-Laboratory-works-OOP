import java.io.Console;

public class fifthExercise {

  public static void main(String[] args) {
    Console console = System.console();

    int num1 = Integer.parseInt(console.readLine("Enter the first number: \n"));

    int num2 = Integer.parseInt(
      console.readLine("Enter the second number: \n")
    );

    int product = num1 * num2;

    console.printf("The product of %d and %d is: %d \n", num1, num2, product);
  }
}
