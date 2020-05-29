package Homework7;

public class Customer extends Account {
    String name;
    String lastName;
    Account accounts;

    public Customer(String name,String lastName, String ssn,double amount, String accType) {

        this.name = name;
        this.lastName = lastName;
        this.ssn = ssn;
        if (accType.equalsIgnoreCase("Saving") || accType.equalsIgnoreCase("Checking")) {
            this.accType = accType;
            //customerAcc = ++accountNum;
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

    public void openNewAccount (String accType, double amount){
        accounts.newAccount(accType,amount);
    }

    public void depositMoney (double amount){
        accounts.deposit(amount);
    }

    public void withdrawMoney (double amount){
        accounts.withdraw(amount);

    }

    public void miniStatement() {
        for (int i = 0; i< allAccount.length ; i++) {
            if (allAccount[i] != 0) {
                System.out.println("Name: " + name + "\nLast Name: " + lastName + "\nSSN: " + ssn +
                                   "\nBalance: $" + balance);

            }
        }
   /*     System.out.println("Name: " + name + "\nLast Name: " + lastName + "\nSSN: " + ssn +
                "\nAccount Num: " + accountNum +
                "\nBalance: $" + balance + "Account number: "+ accCount);*/
    }

}
