public class Accounts {
    private double accountNumber;
    private String accountType;
    private String accountBalance;
    private double customerId;
    private String withdrawType;
    private String depositType;
    private String updatedIntrestBalance;


    public Accounts(double accountNumber, String accountType, String accountBalance, double customerId, String withdrawType, String depositType, String updatedIntrestBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
        this.customerId = customerId;
        this.withdrawType = withdrawType;
        this.depositType = depositType;
        this.updatedIntrestBalance = updatedIntrestBalance;
    }
    public Accounts()
    {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
        this.customerId = customerId;
        this.withdrawType = withdrawType;
        this.depositType = depositType;
        this.updatedIntrestBalance = updatedIntrestBalance;
    }
    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getCustomerId() {
        return customerId;
    }

    public void setCustomerId(double customerId) {
        this.customerId = customerId;
    }

    public String getWithdrawType() {
        return withdrawType;
    }

    public void setWithdrawType(String withdrawType) {
        this.withdrawType = withdrawType;
    }

    public String getDepositType() {
        return depositType;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType;
    }

    public String getUpdatedIntrestBalance() {
        return updatedIntrestBalance;
    }

    public void setUpdatedIntrestBalance(String updatedIntrestBalance) {
        this.updatedIntrestBalance = updatedIntrestBalance;
    }
}
