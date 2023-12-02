import java.text.SimpleDateFormat; //https://www.javatpoint.com/java-simpledateformat
import java.util.Date; //https://www.tutorialspoint.com/java/java_date_time.htm
import java.util.Scanner; 
import java.util.TimeZone; //https://docs.oracle.com/javase/8/docs/api/java/util/TimeZone.html

public class ShowCurrentTime {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the time zone offset to GMT:  ");
    int offset = scanner.nextInt();

    String timeZoneId = "GMT" + (offset >= 0 ? "+" : "") + offset; // если например число 5 положитительное добавляется GMT+5, если отрицательное -5 то GMT-5;

    TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); //https://www.geeksforgeeks.org/timezone-gettimezone-method-in-java-with-examples/

    Date currentTime = new Date();           
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss"); //Здесь создается объект SimpleDateFormat с указанным форматом "HH:mm:ss", который будет использоваться для форматирования времени. //https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
    sdf.setTimeZone(timeZone); //Затем устанавливается временная зона для этого форматтера с использованием объекта timeZone.


    System.out.println("Время: " + sdf.format(currentTime)); //https://javarush.com/quests/lectures/questmultithreading.level02.lecture06
  
    scanner.close();
  }
}
