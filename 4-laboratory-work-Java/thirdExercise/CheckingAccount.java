package thirdExercise;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount() {
        super();
        overdraftLimit = 0.0;
    }

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (amount <= (getBalance() + overdraftLimit)) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Превышен лимит");
        }
    }
}
