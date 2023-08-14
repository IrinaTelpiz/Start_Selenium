package com.Salary;

public class Cashier extends Employee{

    private int hours;

    public Cashier(String name, double bid, int hours) {
        super(name, bid);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public double calculateSalary() {
        return getBid() * hours;
    }

}
