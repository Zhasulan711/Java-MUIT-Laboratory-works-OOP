package thirdExercise;

import java.util.Scanner;

public class DataAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dataset dataset = new Dataset();

        while (true) {
            System.out.print("Enter a number (Q for ending): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                double value = Double.parseDouble(input);
                dataset.addValue(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid data type. (Q for exit)");
            }
        }

        System.out.println("Average = " + dataset.getAverage());
        System.out.println("Maximum = " + dataset.getMax());
        scanner.close();
    }
}
