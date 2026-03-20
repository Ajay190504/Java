package com.project2;
import java.util.*;

//Management Class
public class BankManagement {

 static HashMap<Integer, Account> accounts = new HashMap<>();
 static Scanner sc = new Scanner(System.in);

 public static void main(String[] args) {

     while (true) {

         System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
         System.out.println("1) Add Account");
         System.out.println("2) View All Accounts");
         System.out.println("3) Search Account");
         System.out.println("4) Deposit");
         System.out.println("5) Withdraw");
         System.out.println("6) Remove Account");
         System.out.println("7) Exit");
         System.out.print("Enter your choice: ");

         if (!sc.hasNextInt()) {
             System.out.println("Invalid input! Enter a number.");
             sc.next();
             continue;
         }

         int choice = sc.nextInt();

         if (choice == 1) {
             addAccount();
         } 
         else if (choice == 2) {
             viewAccounts();
         } 
         else if (choice == 3) {
             searchAccount();
         } 
         else if (choice == 4) {
             depositMoney();
         } 
         else if (choice == 5) {
             withdrawMoney();
         } 
         else if (choice == 6) {
             removeAccount();
         } 
         else if (choice == 7) {
             System.out.println("Exiting program...");
             sc.close();
             return;
         } 
         else {
             System.out.println("Invalid choice!");
         }
     }
 }

 // Add Account
 public static void addAccount() {

     System.out.print("Enter Account Number: ");
     int accNo = sc.nextInt();

     if (accounts.containsKey(accNo)) {
         System.out.println("Account already exists!");
         return;
     }

     sc.nextLine();

     System.out.print("Enter Name: ");
     String name = sc.nextLine();

     System.out.print("Enter Initial Balance: ");
     double balance = sc.nextDouble();

     if (balance < 0) {
         System.out.println("Balance cannot be negative!");
         return;
     }

     accounts.put(accNo, new Account(accNo, name, balance));
     System.out.println("Account created successfully!");
 }

 // View All Accounts
 public static void viewAccounts() {

     if (accounts.isEmpty()) {
         System.out.println("No accounts available!");
         return;
     }

     for (Account acc : accounts.values()) {
         System.out.println(acc);
     }
 }

 // Search Account
 public static void searchAccount() {

     if (accounts.isEmpty()) {
         System.out.println("No accounts available!");
         return;
     }

     System.out.print("Enter Account Number: ");
     int accNo = sc.nextInt();

     Account acc = accounts.get(accNo);

     if (acc != null) {
         System.out.println("Account Found: " + acc);
     } else {
         System.out.println("Account not found!");
     }
 }

 // Deposit
 public static void depositMoney() {

     System.out.print("Enter Account Number: ");
     int accNo = sc.nextInt();

     Account acc = accounts.get(accNo);

     if (acc == null) {
         System.out.println("Account not found!");
         return;
     }

     System.out.print("Enter Amount to Deposit: ");
     double amount = sc.nextDouble();

     if (amount <= 0) {
         System.out.println("Invalid amount!");
         return;
     }

     acc.deposit(amount);
     System.out.println("Deposit successful! Updated Balance: " + acc.getBalance());
 }

 // Withdraw
 public static void withdrawMoney() {

     System.out.print("Enter Account Number: ");
     int accNo = sc.nextInt();

     Account acc = accounts.get(accNo);

     if (acc == null) {
         System.out.println("Account not found!");
         return;
     }

     System.out.print("Enter Amount to Withdraw: ");
     double amount = sc.nextDouble();

     if (amount <= 0) {
         System.out.println("Invalid amount!");
         return;
     }

     if (acc.withdraw(amount)) {
         System.out.println("Withdrawal successful! Remaining Balance: " + acc.getBalance());
     } else {
         System.out.println("Insufficient balance!");
     }
 }

 // Remove Account
 public static void removeAccount() {

     System.out.print("Enter Account Number: ");
     int accNo = sc.nextInt();

     if (accounts.remove(accNo) != null) {
         System.out.println("Account removed successfully!");
     } else {
         System.out.println("Account not found!");
     }
 }
}