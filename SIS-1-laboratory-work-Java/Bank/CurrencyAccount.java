package Bank;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class CurrencyAccount extends Account implements Serializable {
    private final Map<String, Double> balanceInCurrency;

    public CurrencyAccount(int accountNumber) {
        super(accountNumber);
        balanceInCurrency = new HashMap<>();
    }

    public void convertSumToCurrency(double sum, Currency currency) {
        double convertedAmount = sum / currency.getExchangeRate();
        String currencyCode = currency.getCode();
        if (balanceInCurrency.containsKey(currencyCode)) {
            balanceInCurrency.put(currencyCode, balanceInCurrency.get(currencyCode) + convertedAmount);
        } else {
            balanceInCurrency.put(currencyCode, convertedAmount);
        }
    }

    public void convertSumFromCurrency(double sum, Currency currency) {
        double convertedAmount = sum * currency.getExchangeRate();
        String currencyCode = currency.getCode();
        if (balanceInCurrency.containsKey(currencyCode)) {
            balanceInCurrency.put(currencyCode, balanceInCurrency.get(currencyCode) - convertedAmount);
        } else {
            balanceInCurrency.put(currencyCode, -convertedAmount);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Currency Account (Account Number: ");
        sb.append(getAccountNumber()).append(")\n");

        for (Map.Entry<String, Double> entry : balanceInCurrency.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }

        return sb.toString();
    }
}

