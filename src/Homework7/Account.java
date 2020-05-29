package Homework7;

public class Account {

static int accountNum = 1000;
    double balance;
    double amount;

    String ssn;
    String accType;
    int customerAcc;
    int[] allAccount = new int[5];
    int accCount = 1;




public void newAccount(String accType, double amount){
    if (accCount>0 && accCount<=5) {


        if (accType.equalsIgnoreCase("Saving") || accType.equalsIgnoreCase("Checking")) {
            this.accType = accType;
            //accCount = ++accountNum;
            System.out.println("Congratulations! New account created.\nAccount number:  " + accountNum);
        } else {
            System.out.println("Invalid account type");
        }
        if (amount <= 1000) {
            System.out.println("Minimum deposit is $1000, please talk to a banker");
        } else {
            this.amount = amount;
            balance += amount;
            System.out.println("Amount in the account: $" + balance + "\n");
        }
        allAccount[accCount]=++accountNum;
    }
    //

}
    public double deposit(double amount) {
        if (amount > 0) {
            balance=balance+accCount+ amount;
            System.out.println("Amount in the account: $" + balance);
        } else {
            System.out.println("Invalid amount to deposit -> " + amount);
        }
        return balance;

    }

    public double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance=balance+accCount+ amount;
            System.out.println("Amount in the account: $" + balance);
        } else {
            System.out.println("Invalid amount to withdraw -> " + amount);
        }
        return balance;
    }

}


