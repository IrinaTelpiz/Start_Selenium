package com.Salary;

public class Salary_Main {
    public static void main(String[] args) {

        Manager man1 = new Manager("Ivan Ivanov", 43.0, 78, 500);
        Cashier cash1 = new Cashier("Maria Petrova", 24.0, 65);

        man1.showSalary();
        cash1.showSalary();

    }
}
