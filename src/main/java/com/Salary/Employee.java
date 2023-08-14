package com.Salary;

abstract class Employee {

    private String name;
    private  double bid;

    public Employee(String name, double bid) {
        this.name = name;
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public double getBid() {
        return bid;
    }

    public abstract double calculateSalary();

    public void showSalary(){
        System.out.println("Employee: " + name);
        System.out.println("Salary is: " + calculateSalary() + " $");
        System.out.println("==========================");
    }
}
