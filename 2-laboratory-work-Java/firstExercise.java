import java.util.Scanner;

public class firstExercise {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter subtotal");
    double subtotal = Double.parseDouble(scanner.nextLine());

    System.out.println("Enter subtotal");
    double gratuityRate = Double.parseDouble(scanner.nextLine());
    double answer = subtotal + gratuityRate;
    System.out.println(answer);
    scanner.close();
  }
}
