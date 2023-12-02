package thirdExercise;

public class SavingsAccounts extends Account{
    public SavingsAccounts() {
        super();
    }

    public SavingsAccounts(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Недостаточно средств.");
        }
    }
}