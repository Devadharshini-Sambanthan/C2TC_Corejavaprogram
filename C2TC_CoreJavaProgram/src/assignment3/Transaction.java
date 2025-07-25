package assignment3;

public final class Transaction {
    private final double transactionFee = 10.0;

    public final void performTransaction(Account acc, double amount, boolean isDeposit) {
        System.out.println("Processing Transaction...");
        if (isDeposit) {
            acc.deposit(amount);
            acc.withdraw(transactionFee);  // Apply fee after deposit
        } else {
            acc.withdraw(amount + transactionFee);  // Apply fee with withdrawal
        }
        System.out.println("Transaction Complete.");
        acc.displayInfo();
        System.out.println();
    }
}
