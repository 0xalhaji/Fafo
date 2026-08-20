public class BankAccount
{
    private String accountNumber;
    private String owner;
    private double balance;

    /**
     *  Creates a bank account..
     *
     * @param accountNumber the account number
     *  @param owner the name of the account owner
     *  @param balance the initial account balance
     */

    public BankAccount(String accountNumber, String owner, double balance)
    {
        this.accountNumber = accountNumber;
        this.owner = owner;
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
        if (amount <= balance && amount > 0)
        {
            balance -= amount;
        }
    }
    /**
     * Transfers money from this account to another account
     * 
     * @param otherAccount the receiving account
     * @param amount the amount to transfer
     *
     */

    public void transferTo(BankAccount otherAccount, double amount)
    {
        if (balance >= amount && otherAccount != this && amount > 0)
        {
            otherAccount.deposit(amount);
            balance -= amount;
        }
    }

    /**
     * Deteemines whether this account has more money than another account.
     *
     * @param otherAccount the account to compare with
     * @return true if this account has a greater balance
     */
    public boolean hasMoreMoneyThan(BankAccount otherAccount)
    {
        return this.balance > otherAccount.balance;
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
