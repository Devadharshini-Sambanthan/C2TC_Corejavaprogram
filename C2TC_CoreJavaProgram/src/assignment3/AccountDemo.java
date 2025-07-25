package assignment3;

public class AccountDemo {
    public static void main(String[] args) {
        Account savings = new SavingsAccount("Alice", 1000);
        Account checking = new CheckingAccount("Bob", 500);

        Transaction transaction = new Transaction();

        transaction.performTransaction(savings, 200, true);  // Deposit
        transaction.performTransaction(checking, 100, false); // Withdraw

        System.out.println("Total Bank Accounts Created: " + Bank.getTotalAccounts());
    }
}