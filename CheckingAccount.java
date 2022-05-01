package Java110Lab;

public class CheckingAccount extends BankAccount{
    private final static double FEE = 0.15;

    /** CheckingAccount() constructor accepts a string for name and double for balance amount
     * @param name of person
     * @param initialAmount balance amount
     */
    public CheckingAccount(String name, double initialAmount){
        super(name, initialAmount);
        setAccountNumber(getAccountNumber() + "-10");
    }

    /** Allows you to remove money from the account if enough money is available,
     *  returns true if the transaction was completed, returns false if there was not enough money.
     *  @param amount The amount to withdraw from the account.
     *  @return True if there were sufficient funds to complete the transaction, false otherwise.
     */
    @Override
    public boolean withdraw(double amount)
    {
        return super.withdraw(amount + FEE);
    }
}
