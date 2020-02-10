package Finance;

public class Account {
    private double balance; //Instance Data
    private int accountId; // This needs to be unique
    private static int NEXTID = 100;
    public static final int ROUTING_NUMBER = 12345;//Final Keyword  mean data can not be changed

    public void deposit(double amount)   {
        balance = balance + amount;
    }

    public void withdraw(double amount)  {
        balance = balance - amount;
    }

    public void displayAccountDetails() {
        System.out.println("********Account information");
        System.out.println("ID: " + accountId);
        System.out.println("Balance: " + balance);
        System.out.println("Routing Number: " + ROUTING_NUMBER);
    }

    public void setAccountId(int accountId){
            this.accountId = accountId;}


    public int getNextId (){
        return Account.NEXTID++; //NextID is called within the class

    }


}
