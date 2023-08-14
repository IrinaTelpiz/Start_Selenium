package HW_678.Bank;


public class Bank_Clients extends Banking_Transactions {

    private String clientName;
    private String clientPhone;
    private String clientAddress;



    Bank_Clients(){
        super();
    }

    Bank_Clients(String accNum, int bal, String name, String phone, String address){
        super(accNum, bal);
        clientName = name;
        clientPhone = phone;
        clientAddress = address;
    }

    String getClientName() {
        return clientName;
    }
    void setClientName(String name) {
        clientName = name;
    }

    String getClientPhone(){
        return clientPhone;
    }
    void setClientPhone(String phone){
        clientPhone = phone;
    }
    String getClientAddress(){
        return clientAddress;
    }
    void setClientAddress(String address){
        clientAddress = address;
    }

    void displayClientInfo(){
        System.out.println("Account number is: " + getAccountNumber() + "\nClient name is: " + clientName + "\nClient phone is: " + clientPhone + "\nClient addrees is: " + clientAddress);
    }




}
