import java.util.Scanner;
public class secondExercise {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("write");
      int score = scanner.nextInt();

      if(score<50) {
        System.out.println("F");
      }
      else if(score>=50 && score<=65){
        System.out.println("C");
      }
      else if(score>=66 && score<=80){
        System.out.println("B");
      }
      else if(score>=81 && score<=100){
        System.out.println("A");
      }
      else {
        System.out.println("that grade not");
      }
    }
}
