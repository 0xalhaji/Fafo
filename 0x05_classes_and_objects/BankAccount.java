public class BankAccount
{
    private String accountHolder;
    private double balance;

    /**
     *  Creates a bank with an account holder and initial balance.
     *
     *  @param accountHolder the name of the account owner
     *  @param balance the initial account balance
     */

    public BankAccount(String accountHolder, double balance)
    {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    /**
     * Deposits money into the account.
     *
     * @param amount the amount to deposit
     */

    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
        }
    }

    /**
     * Withdraws money if sufficient funds are available.
     *
     * @param amount the amount to withdraw
     */

    public void withdraw(double amount)
    {
        if (!(amount > balance) && amount > 0)
        {
            balance -= amount;
        }
    }
    /**
     * Returns the current account balance.
     *
     * @return the current balance
     */
    public double getBalance()
    {
        return balance;
    }
}
