package thirdExercise;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1, 1000.0); // id:1, balance: 1000.0
        CheckingAccount checkingAccount = new CheckingAccount(2, 1500.0, 500.0); // id: 2, balance: 1500.0,
                                                                                 // overdraftLimit: 500.0
        SavingsAccounts savingsAccount = new SavingsAccounts(3, 2000.0); // id: 3, balance 2000.0

        account1.deposit(200.0); // amount 200.0
        account1.withdraw(300.0); // amount 300.0

        checkingAccount.deposit(200.0); // amount 200.0
        checkingAccount.withdraw(2300.0); // amount 2300.0
        System.out.println("Checking Account Баланс: " + checkingAccount.getBalance());
        System.out.println("Checking Account Ежемесячный процент: " + checkingAccount.getMonthlyInterest());

        savingsAccount.deposit(300.0); // amount 300.0
        savingsAccount.withdraw(2500.0); //amount 2500.0
        System.out.println("Savings Account Баланс: " + savingsAccount.getBalance());
        System.out.println("Savings Account Ежемесячный процент: " + savingsAccount.getMonthlyInterest());
    }

}
