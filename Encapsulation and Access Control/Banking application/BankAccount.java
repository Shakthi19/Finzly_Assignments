public class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(String accountNumber, double initialBalance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("211719104", 6000.0, "Sri");

        System.out.println("Account holder: " + account.getOwnerName());
        System.out.println("Account number: " + account.getAccountNumber());

        System.out.println("Initial balance: " + account.getBalance());
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0);
    }
}
