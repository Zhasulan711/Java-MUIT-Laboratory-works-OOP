import java.util.Scanner;

public class seventhExercise {

  public static String findCommonPrefix(String str1, String str2) {
    int minLength = Math.min(str1.length(), str2.length());
    StringBuilder commonPrefix = new StringBuilder();

    for (int i = 0; i < minLength; i++) {
      if (str1.charAt(i) == str2.charAt(i)) {
        commonPrefix.append(str1.charAt(i));
      } else {
        break;
      }
    }

    return commonPrefix.toString();
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first string: ");
    String firstString = scanner.nextLine();

    System.out.print("Enter the second string: ");
    String secondString = scanner.nextLine();

    String commonPrefix = findCommonPrefix(firstString, secondString);

    if (!commonPrefix.isEmpty()) {
      System.out.println("The longest common prefix is: " + commonPrefix);
    } else {
      System.out.println("There is no common prefix.");
    }
    scanner.close();
  }
}
