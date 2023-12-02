package Bank;

import Bank.Account;
import Bank.Currency;
import Bank.CurrencyAccount;
import Bank.SavingsAccount;
import Bank.Bank;

public class index {
    public static void main(String[] args) {
        Account account = new Account(1); // Создаем счет

        account.deposit(1000); // Внесение денег на счет

        account.withdraw(500); // Снятие денег со счета

        Currency usdCurrency = new Currency("USD", 1.0); // Создаем валюту

        CurrencyAccount currencyAccount = new CurrencyAccount(2); // Создаем счет в валюте

        currencyAccount.convertSumToCurrency(1000, usdCurrency); // Конвертация суммы в валюту

        SavingsAccount savingsAccount = new SavingsAccount(3, 5.0); // Создаем сберегательный счет

        savingsAccount.addInterest(); // Начисление процентов

        Bank bank = new Bank(); // Создаем банк

        bank.openAccount(account); // Открытие счета в банке
        bank.openAccount(currencyAccount);
        bank.openAccount(savingsAccount);

        bank.closeAccount(account); // Закрытие счета в банке

        bank.updateAccounts(); // Обновление счетов в банке

        bank.serializeAccounts("bank.ser"); // Сериализация и десериализация банка
        Bank deserializedBank = Bank.deserializeAccounts("bank.ser");

        System.out.println("Deserialized Bank Accounts:"); // Вывод информации о счетах
        for (Account acc : deserializedBank.getAccounts()) {
            System.out.println("Account Number: " + acc.getAccountNumber() + ", Balance: " + acc.getBalance());
        }
    }
}
