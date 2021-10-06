public class AccountTransaction {
    private double transactionId;
    private String transactionDate;
    private double withdraw;
    private double deposit;
    private double customerId;



    public AccountTransaction(double transactionId, String transactionDate, double withdraw, double deposit, double customerId) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.withdraw = withdraw;
        this.deposit = deposit;
        this.customerId = customerId;

    }
    public AccountTransaction()
    {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.withdraw = withdraw;
        this.deposit = deposit;
        this.customerId = customerId;
    }

    public double getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(double transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getCustomerId() {
        return customerId;
    }

    public void setCustomerId(double customerId) {
        this.customerId = customerId;
    }


}
