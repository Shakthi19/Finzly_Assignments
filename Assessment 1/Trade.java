class Trade {
    private static int tradeCount = 0;
    private int tradeNumber;
    private String currencyPair;
    private String customerName;
    private double amount;
    private double rate;
    private boolean isBooked;

    public Trade(String currencyPair, String customerName, double amount, double rate) {
        this.tradeNumber = ++tradeCount;
        this.currencyPair = currencyPair;
        this.customerName = customerName;
        this.amount = amount;
        this.rate = rate;
        this.isBooked = false;
    }

    public int getTradeNumber() {
        return tradeNumber;
    }

    public String getCurrencyPair() {
        return currencyPair;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }

    public double getRate() {
        return rate;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookTrade() {
        isBooked = true;
    }

    @Override
    public String toString() {
        return tradeNumber + " " + currencyPair + " " + customerName + " INR" + amount + " " + rate;
    }
}
