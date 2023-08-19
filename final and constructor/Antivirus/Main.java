class Antivirus {
    private final String PRODUCT_KEY = "201901";
    private boolean isActivated;

    public Antivirus() {
        isActivated = false;
    }

    public void processTransaction(Transaction transaction) {
        if (transaction.isTransactionApproved()) {
            if (transaction.getProductKey().equals(PRODUCT_KEY)) {
                isActivated = true;
                System.out.println("Antivirus activated for purchased client.");
            } else {
                isActivated = false;
                System.out.println("Invalid product key.");
            }
        } else {
            isActivated = false;
            System.out.println("Transaction is not done - please pay first to activate product key.");
        }
    }

    public void scan() {
        if (isActivated) {
            System.out.println("Scanning for viruses...");
        } else {
            System.out.println("Upgrade to activate full scanning feature.");
        }
    }
}

class Transaction {
    private boolean isApproved;
    private String productKey;

    public Transaction(boolean isApproved, String productKey) {
        this.isApproved = isApproved;
        this.productKey = productKey;
    }

    public boolean isTransactionApproved() {
        return isApproved;
    }

    public String getProductKey() {
        return productKey;
    }
}

public class Main {
    public static void main(String[] args) {
        Antivirus antivirus = new Antivirus();

        // Case 1: Successful transaction with valid product key
        Transaction transaction1 = new Transaction(true, "201901");
        antivirus.processTransaction(transaction1);
        antivirus.scan(); // Activated scanning for purchased client

        // Case 2: Successful transaction with invalid product key
        Transaction transaction2 = new Transaction(true, "67890");
        antivirus.processTransaction(transaction2);
        antivirus.scan(); // Invalid product key

        // Case 3: Failed transaction
        Transaction transaction3 = new Transaction(false, "201901");
        antivirus.processTransaction(transaction3);
        antivirus.scan(); // Transaction not done
    }
}
