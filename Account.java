/* Coded by Sabbir Ahmed %035170112 */
public class Account{
    private double balance;

        // constructor
        public Account(double initialBalance){
            // ensure initialBalance > 0.0
            // if not it is initialised to 0.0

            if(initialBalance > 0.0)
                balance = initialBalance;
        }
        // credit account
        public void credit(double amount){
            balance += amount;
        }
        // debit account
        public boolean debit(double amount){
            // ensure sufficient funds
            if(amount > balance)
                return false;

            balance -= amount;
            return true;
        }
        // get balance
        public double getBalance(){
            return balance;
        }
    }


