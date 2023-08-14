package HW_678.Bank;

public class Bank_System {
    public static void main(String[] args) {


        Banking_Transactions tr1 = new Banking_Transactions("1111 2222 3333 4444",500);
        Banking_Transactions tr2 = new Banking_Transactions();
        Bank_Clients cl1 = new Bank_Clients("1111 2222 3333 4444",500,"Popov Anatolii","0 785 777 42","str. Avenue, 126");
        Bank_Clients cl2 = new Bank_Clients();


        tr1.showMenu();


        System.out.println("Show details about the client: ");
        System.out.println("=======================================");
        cl1.displayClientInfo();

    }
}
