package com.Salary;

class Manager extends Employee {

    private int hours;
    private double bonus;

    public Manager(String name, double bid, int hours, double bonus) {
        super(name, bid);
        this.hours = hours;
        this.bonus = bonus;
    }

    public int getHours() {
        return hours;
    }

    public double getBonus() {
        return bonus;
    }

    public double calculateSalary() {
        return getBid() * hours + bonus;
    }
}
