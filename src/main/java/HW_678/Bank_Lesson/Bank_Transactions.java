package HW_678.Bank_Lesson;



import java.util.ArrayList;
import java.util.List;


public class Bank_Transactions  {

    private List<Client> clients;
    private List<Account> accounts;


    public Bank_Transactions(){
        clients = new ArrayList<>();
        accounts = new ArrayList<>();

    }

    public Account createAccount(Client client, int balance){
        Account account = new Account(client,balance);
        accounts.add(account);
        client.getAccounts().add(account);
        return account;
    }

    public void performTransaction(Account sender, Account reciever, int amount){
        if (sender.withdraw(amount)){
            reciever.deposit(amount);
            System.out.println("Successful transaction!");
        } else {
            System.out.println("Transaction failed. Insufficient funds");
        }
    }

    public void generateAccountReport(Account account){
        System.out.println("Account report");
        System.out.println("===============");
        System.out.println("Account ID: " + account.getAccountNumber());
        System.out.println("Current balance: " + account.getBalance());
    }

}
