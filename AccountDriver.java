package Java110Lab;
public class AccountDriver {
    public static void main(String[] args) {
        double put_in = 500;
        double take_out = 1000;
        String money;
        String money_in;
        String money_out;
        boolean completed;

        //	Test the CheckingAccount class.
        CheckingAccount myCheckingAccount = new CheckingAccount("Benjamin Franklin", 1000);

        System.out.println("Account Number " + myCheckingAccount.getAccountNumber()
                + "	belonging to " + myCheckingAccount.getOwner());

        money = String.format("%.2f", myCheckingAccount.getBalance());
        System.out.println("Initial balance = $" + money);

        myCheckingAccount.deposit(put_in);

        money_in = String.format("%.2f", put_in);
        money = String.format("%.2f", myCheckingAccount.getBalance());

        System.out.println("After deposit of $" + money_in + ", balance = $" + money);

        completed = myCheckingAccount.withdraw(take_out);
        money_out = String.format("%.2f", take_out);
        money = String.format("%.2f", myCheckingAccount.getBalance());

        if (completed) {
            System.out.println("After withdrawal of $" + money_out + ", balance = $" + money);
        } else {
            System.out.println("Insufficient funds to " + "withdraw $" + money_out + ", balance = $" + money);
        }

        System.out.println();

        //	Test the SavingsAccount class.
        SavingsAccount yourAccount =new SavingsAccount("William Shakespeare", 400);
        System.out.println("Account Number " + yourAccount.getAccountNumber() + " belonging to " + yourAccount.getOwner());
        money = String.format("%.2f", yourAccount.getBalance());
        System.out.println("Initial balance = $" + money);
        yourAccount.deposit(put_in);
        money_in = String.format("%.2f", put_in);
        money = String.format("%.2f", yourAccount.getBalance());
        System.out.println("After deposit of $" + money_in + ", balance = $" + money);
        completed = yourAccount.withdraw(take_out);
        money_out = String.format("%.2f", take_out);
        money = String.format("%.2f", yourAccount.getBalance());

        if (completed) {
            System.out.println("After withdrawal of $" + money_out + ", balance = $" + money);
        } else {
            System.out.println("Insufficient funds " + "to withdraw $" + money_out + ", balance = $" + money);
        }

        yourAccount.postInterest();
        money = String.format("%.2f", yourAccount.getBalance());
        System.out.println("After monthly interest " + "has been posted, " + "balance = $" + money);
        System.out.println();

        //	Test the copy constructor of the SavingsAccount class.
        SavingsAccount secondAccount = new SavingsAccount(yourAccount, 5);

        System.out.println("Account Number " + secondAccount.getAccountNumber() + "	belonging to " + secondAccount.getOwner());
        money = String.format("%.2f", secondAccount.getBalance());
        System.out.println("Initial balance = $" + money);

        secondAccount.deposit(put_in);
        money_in = String.format("%.2f", put_in);
        money = String.format("%.2f", secondAccount.getBalance());

        System.out.println("After deposit of $" + money_in + ", balance = $" + money);

        secondAccount.withdraw(take_out);
        money_out = String.format("%.2f", take_out);
        money	= String.format("%.2f", secondAccount.getBalance());

        if (completed) {
            System.out.println("After withdrawal of $" + money_out + ", balance = $" + money);
        } else {
            System.out.println("Insufficient funds " + "to withdraw $" + money_out + ", balance = $" + money);
        }

        System.out.println();

        //	Test to make sure new accounts are numbered correctly.
        CheckingAccount yourCheckingAccount = new CheckingAccount("Issac Newton", 5000);
        System.out.println("Account Number " + yourCheckingAccount. getAccountNumber() + " belonging to " + yourCheckingAccount.getOwner());

        //Testings the Power Savings Account class
        System.out.println();
        //PowerSavings ps = new PowerSavings("Polina Chetnikova", 450.2, 2);
        //System.out.println(ps.toString());
        PowerSavings ps = new PowerSavings("Jackie Horton",500.00,4);
        System.out.println(ps);
        ps.withdraw(50);
        System.out.println(ps);
        ps.elapsedMonths();
        System.out.println(ps);
        ps.elapsedMonths();
        ps.elapsedMonths();
        ps.elapsedMonths();
        System.out.println(ps);
        ps.withdraw(100);
        System.out.println(ps);

        /** Create an array of 3 BankAccount object references. Create one each of a CheckingAccount object,
         *  SavingsAccount object and PowerSavings object and put them into the array. The accounts are in your name and
         *  have a starting balance of $1000. You choose any other values needed.
         */
        //create Bank Account objects
        CheckingAccount checking = new CheckingAccount("Polina Chetnikova", 1000.00);
        SavingsAccount savings = new SavingsAccount("Polina Chetnikova", 1000.00);
        PowerSavings power = new PowerSavings("Polina Chetnikova", 1000.00, 4);

        //create a BankAccount array and add the objects into the array
        BankAccount [] accounts = new BankAccount[3];
        accounts[0] = checking;
        accounts[1] = savings;
        accounts[2] = power;

        /** Use a for loop to step through the array and apply the withdraw() method to each object, withdrawing $100.
         */
        for(int i = 0; i < 3; i++){
            accounts[i].withdraw(100.00);
        }
        /** Use a 2nd for loop to step through the array and display the balances.
         *  How do you explain 3 different outputs?
         */
        for(BankAccount acc : accounts){
            int count=0;
            System.out.println(String.format("Account Balance for account #%s: %.2f", count, acc.getBalance()));
            count++;
        }
    }
}
