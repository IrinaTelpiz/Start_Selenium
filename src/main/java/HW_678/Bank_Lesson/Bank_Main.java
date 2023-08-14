package HW_678.Bank_Lesson;



public class Bank_Main {
    public static void main(String[] args) {

        Bank_Transactions bank = new Bank_Transactions();

        Client client1 = new Client("Ivanov");
        Client client2 = new Client("Petrova");
        Account account1 = bank.createAccount(client1,150);
        Account account2 = bank.createAccount(client2,500);
        bank.generateAccountReport(account1);
        System.out.println();
        bank.generateAccountReport(account2);
        bank.performTransaction(account1,account1,200);
        System.out.println();
        bank.generateAccountReport(account1);
        System.out.println();
        bank.generateAccountReport(account2);





    }
}
