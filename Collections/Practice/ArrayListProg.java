import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListProg {
    public static void main(String[] args) {

        //Creating an ArrayList of Integer type
        ArrayList<Integer> arrlst = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to add:");
        int n = sc.nextInt();
        
        // Adding elements to the ArrayList
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arrlst.add(sc.nextInt());
        }
        
      
        // Using for-each loop to display the elements in the ArrayList
        for (int element : arrlst) {
            System.out.println(element);
        }
        

      //   Adding an element at a specific index
         System.out.println("Enter the index and element to add:");
         int index = sc.nextInt();
         int element = sc.nextInt();
         arrlst.add(index, element);

      //  Removing an element from the ArrayList
         System.out.println("Enter the index of the element to remove:");
         int removeIndex = sc.nextInt();
         arrlst.remove(removeIndex);

      // Check whether the arraylist is empty or not
         System.out.println("Is the ArrayList empty? " + arrlst.isEmpty());

      // Get the size of the ArrayList
         System.out.println("Size of the ArrayList: " + arrlst.size());

      // Get an element at a specific index
         System.out.println("Enter the index of the element to retrieve:");
         int getIndex = sc.nextInt();
         System.out.println("Element at index " + getIndex + ": " + arrlst.get(getIndex));

         

        sc.close();
    }
}