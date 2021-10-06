import java.sql.*;
import java.util.Random;

public class IdbcBankDAOimpl implements IdbcBankDAO{
    private Connection connection;

    public IdbcBankDAOimpl() {
        connection = MySqlConnection.getConnection();
    }

    @Override
    public boolean accountNumberGenerated(Accounts accounts) {
        try
        {
            String query = "update accounts set accountNumber = ? where customerId = ?";
            PreparedStatement preparedStatement =connection.prepareStatement(query);
            preparedStatement.setDouble(1,accounts.getAccountNumber());
            preparedStatement.setDouble(2,accounts.getCustomerId());
            int count=preparedStatement.executeUpdate();
            if(count>0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(SQLException exception)
        {
            exception.printStackTrace();
            return false;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean checkAccountBalance(Accounts accounts) {
        try
        {
            String query = "select accountBalance from accounts where customerId = ?";
            PreparedStatement preparedStatement =connection.prepareStatement(query);
            //preparedStatement.setDouble(1,accounts.getAccountNumber());
            preparedStatement.setDouble(1,accounts.getCustomerId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(SQLException exception)
        {
            exception.printStackTrace();
            return false;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean withdraw() {

        try
        {
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select a.accountBalance-t.withdraw from accounts a join accounttransaction t on a.customerId=t.customerId");
            if(resultSet.next())
            {
                return true;
            }
            else {
                return false;
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
            return false;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updatedIntrestBalance(Accounts accounts) {
        try
        {
            String query = "update accounts set updatedIntrestBalance = accountBalance+(accountBalance*0.025) where accountType = ?";
            PreparedStatement preparedStatement =connection.prepareStatement(query);
            preparedStatement.setString(1,accounts.getAccountType());
            int count = preparedStatement.executeUpdate();
            if(count>0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(SQLException exception)
        {
            exception.printStackTrace();
            return false;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updatedIntrestBalanceForPay(Accounts accounts) {
        try
        {
            String query = "update accounts set updatedIntrestBalance = accountBalance where accountType = ?";
            PreparedStatement preparedStatement =connection.prepareStatement(query);
            preparedStatement.setString(1,accounts.getAccountType());
            int count = preparedStatement.executeUpdate();
            if(count>0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(SQLException exception)
        {
            exception.printStackTrace();
            return false;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return false;
        }
    }
    @Override
    public Accounts getCustomerById(int customerId) {
        try
        {
            String query = "select * from accounts where customerId = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDouble(1,customerId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {

                Accounts accounts = new Accounts(resultSet.getDouble("accountNumber"),
                        resultSet.getString("accountType"),resultSet.getString("accountBalance"),
                        resultSet.getDouble("customerId"),resultSet.getString("withdrawType")
                ,resultSet.getString("depositType"),resultSet.getString("updatedIntrestBalance"));
                return accounts;
            }
            else
            {
                return null;
            }
        }
        catch(SQLException exception)
        {
            exception.printStackTrace();
            return null;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }
    public Accounts getAccountTypeByName(String accountType) {
        try
        {
            String query = "select * from accounts where accountType = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,accountType);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {

                Accounts accounts = new Accounts(resultSet.getDouble("accountNumber"),
                        resultSet.getString("accountType"),resultSet.getString("accountBalance"),
                        resultSet.getDouble("customerId"),resultSet.getString("withdrawType")
                        ,resultSet.getString("depositType"),resultSet.getString("updatedIntrestBalance"));
                return accounts;
            }
            else
            {
                return null;
            }
        }
        catch(SQLException exception)
        {
            exception.printStackTrace();
            return null;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }


}
