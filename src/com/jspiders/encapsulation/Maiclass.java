package com.jspiders.encapsulation;

class Account{
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}
public class Maiclass {
    public static void main(String[] args) {
        System.out.println("Program starts...");
        Account a1 = new Account();
        double balance = a1.getBalance();
        System.out.println("Balance is: " + balance);
        a1.setBalance(1000);
        balance = a1.getBalance();
        System.out.println("Balance is: " + balance);
        System.out.println("Program ends...");
    }
}
