package com.L1;

public class AdminUser extends EmptyUser {
    public AdminUser(String userName, String password) {

        super(userName,password);
        setPermission("elevated");


    }
}
