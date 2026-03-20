import java.util.HashSet;
import java.util.Scanner;
public class HashSetProg {
    public static void main(String[] args) {
        
        // Creating a HashSet of String type
        HashSet<String> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        // Adding elements to the HashSet
        System.out.println("Enter the number of elements you want to add:");
         int n = sc.nextInt();
         sc.nextLine();

         System.out.println("Enter the elements:");
         for (int i = 0; i < n; i++) {
             hashSet.add(sc.nextLine());
         }

         // Using for-each loop to display the elements in the HashSet
         System.out.println("Elements in the HashSet:");
         for (String element : hashSet) {
               System.out.println(element);
            }

         // Removing an element from the HashSet
         System.out.println("Enter the element to remove:");
         String removeElement = sc.nextLine();
         hashSet.remove(removeElement);

         // Find the total number of elements in the HashSet
         System.out.println("Total number of elements in the HashSet: " + hashSet.size());

         //
    }
}  