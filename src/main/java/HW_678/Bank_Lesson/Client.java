package HW_678.Bank_Lesson;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    private List<Account> accounts;

    public Client(String name){
        this.name = name;
        accounts = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
