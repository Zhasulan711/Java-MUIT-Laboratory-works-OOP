import java.util.Scanner;
public class firstExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("write \n");
        String name = scanner.nextLine();
        System.out.printf("+---+ \n");
        System.out.printf("! %s i \n", name);
        System.out.printf("+---+ \n");
    }
}