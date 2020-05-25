package Homework7;

public class Account {

static int accountNum = 1000;
    double balance;
    double amount;
    String name;
    String lastName;
    String ssn;
    String accType;
    int customerAcc;




public void newAccount(String accType, double amount){




     if (accType.equalsIgnoreCase("Saving") || accType.equalsIgnoreCase("Checking")){
        this.accType=accType;
    customerAcc=++accountNum;
         System.out.println("Congratulations! New account created.\nAccount number:  " + customerAcc);
    }else{
    System.out.println("Invalid account type");
    }
    if (amount <= 1000) {
        System.out.println("Minimum deposit is $1000, please talk to a banker");
    }else {
        this.amount = amount;
        balance += amount;
        System.out.println("Amount in the account: $" + balance);
    }



}



}


