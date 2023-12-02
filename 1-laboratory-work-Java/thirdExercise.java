import java.io.Console;

public class thirdExercise {

  public static void main(String[] args) {
    Console console = System.console();

    console.printf("Quadratic Equation Solver\n");
    double a = Double.parseDouble(
      console.readLine("Enter the coefficient a: \n")
    );
    double b = Double.parseDouble(
      console.readLine("Enter the coefficient b: \n")
    );
    console.printf("Enter the coefficient c: ");
    double c = Double.parseDouble(
      console.readLine("Enter the coefficient c: \n")
    );

    double discriminant = b * b - 4 * a * c;

    if (discriminant < 0) {
      console.printf("The quadratic equation has complex roots.\n");
    } else if (discriminant == 0) {
      double root = -b / (2 * a);
      console.printf("The quadratic equation has one real root: %f\n", root);
      console.printf("The quadratic equation has one real root:" + root + ":");
    } else {
      double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
      double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
      console.printf(
        "The quadratic equation has two real roots: %f and %f\n",
        root1,
        root2
      );
    }
  }
}
