package com.L1;

import HW_678.Bank_Lesson.Account;
import HW_678.Bank_Lesson.Bank_Transactions;
import HW_678.Bank_Lesson.Client;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Bank_System_test {

    Bank_Transactions bank;
    Client client1;
    Client client2;

    @Before
    public void prepareData(){
        bank = new Bank_Transactions();
        client1 = new Client("Ivanov");
        client2 = new Client("Petrova");
    }

    @Test
    public void createClientWithAccountTest(){
//        Bank_Transactions bank = new Bank_Transactions();
//        Client client1 = new Client("Ivanov");
//        Client client2 = new Client("Petrova");
        Account account1 = bank.createAccount(client1,150);
        Account account2 = bank.createAccount(client2,500);
        int initialBalanceCl1 = account1.getBalance();
        int initialBalanceCl2 = account2.getBalance();
        assertEquals("Account balance is different from expected.",150, initialBalanceCl1);
        assertEquals("Account balance is different from expected.",500,initialBalanceCl2);
    }

    @Test
    public void performUnacceptableTransactionTest(){
//        Bank_Transactions bank = new Bank_Transactions();
//        Client client1 = new Client("Ivanov");
//        Client client2 = new Client("Petrova");
        Account account1 = bank.createAccount(client1,150);
        Account account2 = bank.createAccount(client2,500);
        int initialBalanceCl1 = account1.getBalance();
        int initialBalanceCl2 = account2.getBalance();
        bank.performTransaction(account1,account2,200);
        int currentBalanceCl1 = account1.getBalance();
        int currentBalanceCl2 = account2.getBalance();
        assertTrue("Account balance has changed after the sending.",currentBalanceCl1 == initialBalanceCl1);
        assertTrue("Account balance has changed after the receiving.",currentBalanceCl2 == initialBalanceCl2);
    }


    @Test
    public void performTransactionTest(){
//        Bank_Transactions bank = new Bank_Transactions();
//        Client client1 = new Client("Ivanov");
//        Client client2 = new Client("Petrova");
        Account account1 = bank.createAccount(client1,150);
        Account account2 = bank.createAccount(client2,500);
        int initialBalanceCl1 = account1.getBalance();
        int initialBalanceCl2 = account2.getBalance();
        assertEquals("Account balance is different from expected.",150, initialBalanceCl1);
        assertEquals("Account balance is different from expected.",500,initialBalanceCl2);
        int amount = 200;
        bank.performTransaction(account2,account1,amount);
        int currentBalanceCl1 = account1.getBalance();
        int currentBalanceCl2 = account2.getBalance();
        assertTrue("Account balance has not changed after the sending.",currentBalanceCl2 == initialBalanceCl2 - amount);
        assertTrue("Account balance has not changed after the receiving.",currentBalanceCl1 == initialBalanceCl1 + amount);
    }





}
