package Java110Lab;

public class SavingsAccount extends BankAccount{
    //instance class variables
    private double rate = 2.5;
    private int savingsNumber = 0;
    private String accountNumber;

    /** SavingsAccount() constructor accepts a string and double
     * @param name String for someone's name
     * @param initialAmount double holding the account amount balance
     */
    public SavingsAccount(String name, double initialAmount){
        super(name, initialAmount);
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    /**  Write a copy constructor that creates another savings account for the same person.
     *  It takes the original savings account and an initial balance as parameters.
     *  1. It should call the copy constructor of the superclass
     *  2. Assign the savingsNumber to be one more than the savingsNumber of the original savings account.
     *  3. Then, assign the accountNumber to be the accountNumber of the superclass concatenated with
     *     the hyphen and the savingsNumber of the new account.
     *  @param oldAccount copy of SavingsAccount
     *  @param amount balance amount
     */
    public SavingsAccount(SavingsAccount oldAccount, double amount){
        super((BankAccount)oldAccount, amount);
        savingsNumber += 1;
        accountNumber = super.getAccountNumber() + "-" + oldAccount.savingsNumber;
    }

    /** postInterest() calculate the interest on a balance for one month and adds it to the balance
     *  amount in the super class
     */
    public void postInterest(){
        //interest = balance x rate x time
        /**rate /= 100;
        double interest = (rate / 12) * getBalance();
        super.deposit(interest);*/
        setBalance(getBalance()*(1+rate/100/12));
    }

    /** getAccountNumber() returns the accountNumber associated with the object
     *  @return the number representing the account
     */
    @Override
    public String getAccountNumber(){
        return accountNumber;
    }
}
