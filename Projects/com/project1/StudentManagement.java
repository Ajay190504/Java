package com.project1;
import java.util.*;

//Management Class
public class StudentManagement {

 static ArrayList<Student> students = new ArrayList<>();
 static Scanner sc = new Scanner(System.in);

 public static void main(String[] args) {

     while (true) {

         System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
         System.out.println("1) Add Student");
         System.out.println("2) View All Students");
         System.out.println("3) Search Student by ID");
         System.out.println("4) Remove Student by ID");
         System.out.println("5) Update Student");
         System.out.println("6) Exit");
         System.out.print("Enter your choice: ");

         if (!sc.hasNextInt()) {
             System.out.println("Invalid input! Enter a number.");
             sc.next();
             continue;
         }

         int choice = sc.nextInt();

         if (choice == 1) {
             addStudent();
         } 
         else if (choice == 2) {
             viewStudents();
         } 
         else if (choice == 3) {
             searchStudent();
         } 
         else if (choice == 4) {
             removeStudent();
         } 
         else if (choice == 5) {
             updateStudent();
         } 
         else if (choice == 6) {
             System.out.println("Exiting program...");
             sc.close();
             return;
         } 
         else {
             System.out.println("Invalid choice!");
         }
     }
 }

 // Add Student
 public static void addStudent() {

     System.out.print("Enter Student ID: ");
     int id = sc.nextInt();

     // Duplicate check
     for (Student s : students) {
         if (s.getId() == id) {
             System.out.println("Student with this ID already exists!");
             return;
         }
     }

     sc.nextLine();

     System.out.print("Enter Name: ");
     String name = sc.nextLine();

     System.out.print("Enter Age: ");
     int age = sc.nextInt();

     sc.nextLine();

     System.out.print("Enter Course: ");
     String course = sc.nextLine();

     students.add(new Student(id, name, age, course));
     System.out.println("Student added successfully!");
 }

 // View Students
 public static void viewStudents() {

     if (students.isEmpty()) {
         System.out.println("No students available!");
         return;
     }

     for (Student s : students) {
         System.out.println(s);
     }
 }

 // Search Student
 public static void searchStudent() {

     if (students.isEmpty()) {
         System.out.println("No students available!");
         return;
     }

     System.out.print("Enter ID to search: ");
     int id = sc.nextInt();

     for (Student s : students) {
         if (s.getId() == id) {
             System.out.println("Student Found: " + s);
             return;
         }
     }

     System.out.println("Student not found!");
 }

 // Remove Student
 public static void removeStudent() {

     if (students.isEmpty()) {
         System.out.println("No students available!");
         return;
     }

     System.out.print("Enter ID to remove: ");
     int id = sc.nextInt();

     Iterator<Student> it = students.iterator();

     while (it.hasNext()) {
         Student s = it.next();
         if (s.getId() == id) {
             it.remove();
             System.out.println("Student removed successfully!");
             return;
         }
     }

     System.out.println("Student not found!");
 }

 // Update Student
 public static void updateStudent() {

     if (students.isEmpty()) {
         System.out.println("No students available!");
         return;
     }

     System.out.print("Enter ID to update: ");
     int id = sc.nextInt();

     for (Student s : students) {
         if (s.getId() == id) {

             sc.nextLine();

             System.out.print("Enter new Name: ");
             String name = sc.nextLine();

             System.out.print("Enter new Age: ");
             int age = sc.nextInt();

             sc.nextLine();

             System.out.print("Enter new Course: ");
             String course = sc.nextLine();

             s.setName(name);
             s.setAge(age);
             s.setCourse(course);

             System.out.println("Student updated successfully!");
             return;
         }
     }

     System.out.println("Student not found!");
 }
}