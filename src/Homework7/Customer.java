package Homework7;

public class Customer extends Account {

    public Customer(String name,String lastName, String ssn,double amount, String accType) {

        this.name = name;
        this.lastName = lastName;
        this.ssn = ssn;
        this.accType=accType;

        if (amount <= 1000) {
            System.out.println("Minimum deposit is $1000, please talk to a banker");
        }else {
            this.amount = amount;
            balance += amount;
        }
        customerAcc=++accountNum;


    }
    public double deposit(double amount) {
        if (amount > 0) {
            balance+=amount;
            System.out.println("Amount in the account: $" + balance);
        } else {
            System.out.println("Invalid amount to deposit -> " + amount);
        }
        return balance;
    }

    public double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance-=amount;
            System.out.println("Amount in the account: $" + balance);
        } else {
            System.out.println("Invalid amount to withdraw -> " + amount);
        }
        return balance;
    }
    public void miniStatement() {
        System.out.println("Name: " + name + "\nLast Name: " + lastName + "\nSSN: " + ssn +
                "\nAccount Num: " + accountNum +
                "\nBalance: $" + balance);
    }

}
