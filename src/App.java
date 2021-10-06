import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IdbcBankDAO idbcBankDAO = new IdbcBankDAOimpl();
        App app=new App();

        /*System.out.println("**************************************************");
        int customerId = 1;
        app.greet();
        Accounts accounts= idbcBankDAO.getCustomerById(customerId);
        accounts.setAccountNumber(app.generateAccount());
        boolean result = idbcBankDAO.accountNumberGenerated(accounts);
        if(result)
        {
            System.out.println("Account Number is Generated successfully and your Customer Id is " +accounts.getCustomerId());
        }
        System.out.println("*****************************************************************");
        System.out.println();


        System.out.println("*************************Check Balance *************************");
        System.out.println();
        int customerID = 4;
        Accounts accounts1= idbcBankDAO.getCustomerById(customerID);
        accounts1.getAccountBalance();
        boolean result1 =idbcBankDAO.checkAccountBalance(accounts1);
        if(result1)
        {
           System.out.println("Your Balance is " + accounts1.getAccountBalance() + " and your customer id is :: "+accounts1.getCustomerId());
        }
        System.out.println("*****************************************************************");
        System.out.println();

        System.out.println("************************* Updated Intrest Rate For Saving Account ******************************");
        String accountType="Saving";
        Accounts accounts2= idbcBankDAO.getAccountTypeByName(accountType);

        accounts2.getUpdatedIntrestBalance();
        boolean result3 = idbcBankDAO.updatedIntrestBalance(accounts2);
        if(result3)
        {
            System.out.println("Your Updated Account Balance is " +accounts2.getUpdatedIntrestBalance()+" for customer Id :: "+accounts2.getCustomerId());
        }
        System.out.println();
        System.out.println("****************************** Updated Intrest Rate For Pay Account **********************************************");
        System.out.println();
        String accountType1="Pay";
        Accounts accounts3= idbcBankDAO.getAccountTypeByName(accountType1);
        accounts3.getUpdatedIntrestBalance();
        boolean result4=idbcBankDAO.updatedIntrestBalanceForPay(accounts3);

        if(result4)
        {
            System.out.println(" Your Account balance is updated ");
        }
        System.out.println("****************************************************************************");*/
        System.out.println();
        System.out.println("****************************** Withdraw  **********************************************");
        AccountTransaction accountTransaction=new AccountTransaction();
        Accounts accounts=new Accounts();
        idbcBankDAO.withdraw();
        System.out.println("you have withdraw :: "+accountTransaction.getWithdraw());
        System.out.println("Remaining Balance is :: "+accounts.getAccountBalance());



    }
    public void greet()
    {
        System.out.println("Account is Opened Successfully....");
        System.out.println("Thank you for opening an Account in IDBC Bank");
    }
    public double generateAccount()
    {
        int maximumNumber=999999999;
        Random randomAccountNumber = new Random();
        double bankCode = 281;
        double generateAccountNumber = bankCode + randomAccountNumber.nextInt(maximumNumber);
        return generateAccountNumber;
    }
}
