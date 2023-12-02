package firstExercise;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("write a symbol of Corporation!");
        String symbol = scanner.next();

        System.out.println("write a name of Corporation!");
        String name = scanner.next();

        Stock stock = new Stock(symbol, name);

        System.out.println("write a previousClosingPrice:");
        stock.previousClosingPrice = scanner.nextDouble();

        System.out.println("write a currentPrice:");
        stock.currentPrice = scanner.nextDouble();

        System.out.printf("your Corporation: %s %s \n", stock.name, stock.symbol);

        double finalSum = stock.getChangePercent();
        System.out.printf("your price-change percentage %f", finalSum);
        
        scanner.close();

    }
}
