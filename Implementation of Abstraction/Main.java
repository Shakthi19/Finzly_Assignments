public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("A001", "Shakthi", 1000, 5);
        CheckingAccount checkingAccount = new CheckingAccount("A002", "Sri", 5000, 500);

        // Deposit and Withdrawal operations
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);

        checkingAccount.deposit(100);
        checkingAccount.withdraw(2500);

        // Adding interest to savings account
        savingsAccount.addInterest();

        // Displaying account details and balances
        System.out.println("Savings Account:");
        System.out.println("Account Holder: " + savingsAccount.getAccountHolderName());
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: $" + savingsAccount.getBalance());

        System.out.println("\nChecking Account:");
        System.out.println("Account Holder: " + checkingAccount.getAccountHolderName());
        System.out.println("Account Number: " + checkingAccount.getAccountNumber());
        System.out.println("Balance: $" + checkingAccount.getBalance());
    }
}
