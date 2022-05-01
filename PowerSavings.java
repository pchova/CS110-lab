package Java110Lab;
//** from savings account: offers a higher interest rate
// but penalty for early withdrawal
public class PowerSavings extends SavingsAccount{
    //penalty accessed for early withdrawal
    public final double PENALTY = 2.5;

    private double rate = 0.05;
    //no penality if account is mature
    private int tillMatured;

    private int monthsSinceCreation;

    public PowerSavings(String name, double initialAmount, int tillMatured){
        super(name, initialAmount);
        this.tillMatured = tillMatured;
        monthsSinceCreation = 0;
    }

    /** Add a method that increments the elapsed months and applies
     *  the interest for that month
     */
    public void elapsedMonths(){
        monthsSinceCreation++;
        postInterest();
    }

    /** getTillMatured() returns int
     * @return int
     */
    public int getTillMatured(){
        return tillMatured;
    }

    /** getMonthsSinceCreation returns int
     * @return int
     */
    public int getMonthsSinceCreation(){
        return monthsSinceCreation;
    }

    /** setTillMatured() sets int variable
     * @param tm
     */
    public void setTillMatured(int tm){
        tillMatured = tm;
    }

    /** setMonthsSinceCreation() sets int
     * @param sm
     */
    public void setMonthsSinceCreation(int sm){
        monthsSinceCreation = sm;
    }

    /** withdraw() returns amount or amount + penalty
     * @param amount The amount to withdraw from the account.
     * @return with fee or without
     */
    @Override
    public boolean withdraw(double amount)
    {
        if (monthsSinceCreation <= tillMatured)
            return super.withdraw(amount + PENALTY);
        else
            return super.withdraw(amount);
    }

    /** toString method to accurately represent a Power Savings account
     *  @return a string to represents Power Savings object
     */
    public String toString(){
        return String.format("Account Number %s belonging to %s\nInitial Balance: %.2f" +
                        "\nMonths Since Creation: %s\nMonths till Matured: %s",
                getAccountNumber(), getOwner(), getBalance(), getMonthsSinceCreation(), getTillMatured());
    }

}
