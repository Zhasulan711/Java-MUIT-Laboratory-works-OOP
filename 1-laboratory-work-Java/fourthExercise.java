import java.util.Scanner;

public class fourthExercise {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите слово: ");
    String word = scanner.nextLine();
    StringBuilder wordConstructor = new StringBuilder(word);

    String reversed = wordConstructor.reverse().toString();
    boolean isPalindrome = word.equals(reversed);
    if (isPalindrome) {
      System.out.println("Слово является палиндромом.");
    } else {
      System.out.println("Слово не является палиндромом.");
    } //level 
    scanner.close();

  // public static boolean isPalindrome(String word) {

  //   for (int i = 0; i < letter.length(); i++) {
  //     if (letter.charAt(i) == letter.charAt(word.length() - i - 1)) {
  //       return true;
  //     } 
  //   }
  //   return false;
  // }
  
}
