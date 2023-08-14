package com.L1;

public class InvalidPassword extends Exception{
    String pass;

    InvalidPassword(String pass){
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "The password " + pass + " is incorrect";
    }
}
