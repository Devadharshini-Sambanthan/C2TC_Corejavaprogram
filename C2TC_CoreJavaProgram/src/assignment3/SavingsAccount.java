package assignment3;

public class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.03;

    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * INTEREST_RATE);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds in Savings Account");
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

