import java.util.Scanner;
public class fifthExercise{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число (1-15): ");
        int numberOfLines = scanner.nextInt();
        scanner.close();

        for (int i=1; i<=numberOfLines; i++)
        {
            for (int j=1; j<=numberOfLines-i; j++) {
                System.out.print("  ");
            }


            for (int j =i; j>= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j =2; j <=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
