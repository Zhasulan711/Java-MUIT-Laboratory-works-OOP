import java.util.Scanner;

public class sixthExercise {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    String result = "";
    String sum = input.map((sum) => {
      word = sum.split();
      if (sum%2==0 ) {
        return null;
      }
      return sum;
    });
    String oddPosition = sum.reduce((odd, position) => {

    })
    // for (int i = 0; i < input.length(); i++) {
    //   if (i % 2 == 0) {
    //     result += input.charAt(i);
    //   }
    // }

    System.out.println("Characters at odd positions: " + result);
  }
}
