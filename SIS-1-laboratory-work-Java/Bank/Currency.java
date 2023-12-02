package Bank;

import java.io.Serializable;

import java.io.Serializable;

public class Currency implements Serializable {
    private double exchangeRate;
    private String code;

    public Currency(String code, double exchangeRate) {
        this.code = code;
        this.exchangeRate = exchangeRate;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public String getCode() {
        return code;
    }
}
