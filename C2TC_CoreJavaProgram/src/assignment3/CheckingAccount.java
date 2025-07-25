package assignment3;

public class CheckingAccount extends Account {
    private static final double OVERDRAFT_LIMIT = -500.0;

    public CheckingAccount(String name, double initialBalance) {
        super(name, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if ((balance - amount) >= OVERDRAFT_LIMIT)
            balance -= amount;
        else
            System.out.println("Overdraft limit exceeded in Checking Account");
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
