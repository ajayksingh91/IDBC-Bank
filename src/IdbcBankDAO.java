public interface IdbcBankDAO {
    boolean accountNumberGenerated(Accounts accounts);
    Accounts getCustomerById(int customerId);
    boolean checkAccountBalance(Accounts accounts);
    boolean withdraw();
    boolean updatedIntrestBalance(Accounts accounts);
    Accounts getAccountTypeByName(String accountType);
    boolean updatedIntrestBalanceForPay(Accounts accounts);

}
