package firstExercise;

public class Stock {
    public String symbol;
    public String name;
    public double previousClosingPrice; // stores the stock price for the previous day
    public double currentPrice; // stores price for the current time

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;

    }
}
