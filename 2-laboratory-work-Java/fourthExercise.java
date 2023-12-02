import java.util.Scanner;

public class fourthExercise {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("today's a day is...");
    int today = Integer.parseInt(scanner.nextLine());

    System.out.println("How many day u need?");
    int dayOfSkip = Integer.parseInt(scanner.nextLine());

    int future = (today + dayOfSkip) % 7;
    String[] days = {
      "Воскресенье",
      "Понедельник",
      "Вторник",
      "Среда",
      "Четверг",
      "Пятница",
      "Суббота",
    };
    String futureDay = days[future];
    System.out.println(futureDay);
  }
}
