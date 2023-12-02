package Bank;

import java.io.*;
import java.util.Vector;

public class Bank implements Serializable {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void closeAccount(Account account) {
        accounts.remove(account);
    }

    public void updateAccounts() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                SavingsAccount savingsAccount = (SavingsAccount) account;
                savingsAccount.addInterest();
            }
            else if (account instanceof CurrencyAccount) {
                CurrencyAccount currencyAccount = (CurrencyAccount) account;
                currencyAccount.convertSumToCurrency(1000, new Currency("USD", 1.0));
            }
        }
    }

    public void serializeAccounts(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Bank deserializeAccounts(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Bank) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Vector<Account> getAccounts() {
        return accounts;
    }
}
