import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: $" + balance;
    }
}

public class BankApplication {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBank Account Management System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Check Balance");
            System.out.println("5. List All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    createAccount(accounts, scanner);
                    break;
                case 2:
                    depositFunds(accounts, scanner);
                    break;
                case 3:
                    withdrawFunds(accounts, scanner);
                    break;
                case 4:
                    checkBalance(accounts, scanner);
                    break;
                case 5:
                    listAllAccounts(accounts);
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void createAccount(List<BankAccount> accounts, Scanner scanner) {
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Account Holder's Name: ");
        String accountHolder = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountNumber, accountHolder, initialBalance);
        accounts.add(account);
        System.out.println("Account created successfully.");
    }

    private static void depositFunds(List<BankAccount> accounts, Scanner scanner) {
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter Deposit Amount: ");
        double depositAmount = scanner.nextDouble();

        BankAccount account = findAccount(accounts, accountNumber);
        if (account != null) {
            account.deposit(depositAmount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void withdrawFunds(List<BankAccount> accounts, Scanner scanner) {
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter Withdrawal Amount: ");
        double withdrawalAmount = scanner.nextDouble();

        BankAccount account = findAccount(accounts, accountNumber);
        if (account != null) {
            account.withdraw(withdrawalAmount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void checkBalance(List<BankAccount> accounts, Scanner scanner) {
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();

        BankAccount account = findAccount(accounts, accountNumber);
        if (account != null) {
            System.out.println("Account Balance: $" + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void listAllAccounts(List<BankAccount> accounts) {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
        } else {
            System.out.println("List of Bank Accounts:");
            for (BankAccount account : accounts) {
                System.out.println(account);
            }
        }
    }

    private static BankAccount findAccount(List<BankAccount> accounts, int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}
