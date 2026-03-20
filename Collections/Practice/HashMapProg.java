import java.util.HashMap;
import java.util.Scanner;

public class HashMapProg {
    public static void main(String[] args) {
        
        // Creating a HashMap of RollNo as keys and Name as String values
         HashMap<Integer, String> hashMap = new HashMap<>();
         Scanner sc = new Scanner(System.in);

         // Adding elements to the HashMap
         System.out.println("Enter the number of elements you want to add:");
         int n = sc.nextInt();
         sc.nextLine();

         System.out.println("Enter the RollNo and Name:");
         for (int i = 0; i < n; i++) {
             int rollNo = sc.nextInt();
             sc.nextLine();
             String name = sc.nextLine();
             hashMap.put(rollNo, name);
         }

         // Using for-each loop to display the elements in the HashMap
         System.out.println("Elements in the HashMap:");
         for (Integer key : hashMap.keySet()) {
               System.out.println("RollNo: " + key + ", Name: " + hashMap.get(key));
            }

         // Display keys and valuse using entrySet() method
         System.out.println("Elements in the HashMap using entrySet():");
         for (HashMap.Entry<Integer, String> entry : hashMap.entrySet()) {
               System.out.println("RollNo: " + entry.getKey() + ", Name: " + entry.getValue());
            }

         // Get a value based on a key
         System.out.println("Enter the RollNo to retrieve the Name:");
         int getKey = sc.nextInt();
         System.out.println("Name for RollNo " + getKey + ": " + hashMap.get(getKey));

         // Check whether a key exists in the HashMap
         System.out.println("Enter the RollNo to check if it exists:");
         int checkKey = sc.nextInt();
         System.out.println("Does RollNo " + checkKey + " exist? " + hashMap.containsKey(checkKey));

         // Check whether a value exists in the HashMap
         System.out.println("Enter the Name to check if it exists:");
         sc.nextLine();
         String checkValue = sc.nextLine();
         System.out.println("Does Name " + checkValue + " exist? " + hashMap.containsValue(checkValue));

         // Find the total number of elements in the HashMap
         System.out.println("Total number of elements in the HashMap: " + hashMap.size());

         // Removing an element from the HashMap
         System.out.println("Enter the RollNo of the element to remove:");
         int removeKey = sc.nextInt();
         hashMap.remove(removeKey);

         // Remove an entry from the HashMap using entrySet() method
         System.out.println("Enter the RollNo of the element to remove using entrySet():");
         int removeEntryKey = sc.nextInt();
         hashMap.entrySet().removeIf(entry -> entry.getKey().equals(removeEntryKey));
    }
}