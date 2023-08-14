package HW_678.Bank_Lesson;

public class Account {

    private static int nextAccountNumber = 1;
    private int accountNumber;
    private int balance;
    private Client client;

     Account(Client client, int balance){
        this.client = client;
        this.balance = balance;
        this.accountNumber = nextAccountNumber++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Client getClient(){
        return client;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public boolean withdraw(int amount){
        if (amount <= balance){
            balance -= amount;
            return true;
        }
        return false;
    }
}
