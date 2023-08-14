package com.L1;

public class EmptyUser {

    private String userName;
    private String password;
    private String permission;

    EmptyUser(){
        userName = "username";
        password = "password";
    }

    EmptyUser(String name, String pwd){
        userName = name;
        password = pwd;
    }


    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }


    public String getInfo(String attempt) throws InvalidPassword {
        if (attempt.equals(getPassword())){
            return "userName=" + userName + ", password=" + password + ", permission=" + permission;
        } else {
            throw new InvalidPassword(attempt);
        }
    }
}
