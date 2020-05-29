package Homework7;

public class BankMain {
    public static void main(String[] args) {


    Customer c1 = new Customer("John","Doe","222-33-4444",1200,"Saving");
    c1.newAccount("checking",1001);
    c1.miniStatement();

    //c1.deposit(100);
    //c1.withdraw(480);
    //c1.newAccount("saving", 1230);

}
}