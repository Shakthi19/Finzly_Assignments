import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForeignExchangeTrading {
    private static final double USD_TO_INR_RATE = 66.00;
    private static final List<Trade> trades = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nOptions:");
            System.out.println("1. Book Trade");
            System.out.println("2. Print Trades");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookTrade();
                    break;
                case 2:
                    printTrades();
                    break;
                case 3:
                    exitProgram();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        } while (choice != 3);
    }

    private static void bookTrade() {
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter Currency Pair (e.g., USDINR): ");
        String currencyPair = scanner.nextLine();

        System.out.print("Enter amount to transfer in USD: ");
        double usdAmount = scanner.nextDouble();

        System.out.print("Do you want to get Rate (Yes/No): ");
        scanner.nextLine(); // Consume the newline character
        String getRateChoice = scanner.nextLine();

        if (currencyPair.equals("USDINR") && getRateChoice.equalsIgnoreCase("Yes")) {
            double inrAmount = usdAmount * USD_TO_INR_RATE;
            Trade trade = new Trade(currencyPair, customerName, inrAmount, USD_TO_INR_RATE);
            trades.add(trade);
            trade.bookTrade();

            System.out.println("You are transferring INR " + (int) inrAmount + " to " + customerName +
                    ". Assuming that rate was " + USD_TO_INR_RATE + ")");
            System.out.println("Trade for USDINR has been booked with rate " + USD_TO_INR_RATE +
                    ". The amount of Rs " + (int) inrAmount + " will be transferred in 2 working days to " + customerName);
        } else {
            System.out.println("Invalid input. You can only book trades for USDINR with rate information.");
        }
    }

    private static void printTrades() {
        System.out.println("\nTradeNo CurrencyPair CustomerName Amount Rate");
        for (Trade trade : trades) {
            System.out.println(trade);
        }
    }

    private static void exitProgram() {
        System.out.print("Do you really want to exit (y/n): ");
        scanner.nextLine(); // Consume the newline character
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("Y")) {
            System.out.println("Bye! Have a good day.");
            System.exit(0);
        }
    }
}
