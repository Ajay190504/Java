package com.project2;

//POJO Class
public class Account {
 private int accNo;
 private String name;
 private double balance;

 public Account(int accNo, String name, double balance) {
     this.accNo = accNo;
     this.name = name;
     this.balance = balance;
 }

 public int getAccNo() {
     return accNo;
 }

 public double getBalance() {
     return balance;
 }

 public void deposit(double amount) {
     balance += amount;
 }

 public boolean withdraw(double amount) {
     if (amount > balance) {
         return false;
     }
     balance -= amount;
     return true;
 }

 public String toString() {
     return "AccNo: " + accNo + ", Name: " + name + ", Balance: " + balance;
 }
}