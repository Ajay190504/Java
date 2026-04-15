import java.util.*;

public class LinkedListConversions {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30));

        // ================= TO OTHER COLLECTIONS =================

        // LinkedList -> ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(list);

        // LinkedList -> HashSet
        HashSet<Integer> hashSet = new HashSet<>(list);

        // LinkedList -> LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(list);

        // LinkedList -> TreeSet (sorted)
        TreeSet<Integer> treeSet = new TreeSet<>(list);

        // LinkedList -> Queue
        Queue<Integer> queue = new LinkedList<>(list);

        // LinkedList -> PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(list);

        // LinkedList -> Stack
        Stack<Integer> stack = new Stack<>();
        stack.addAll(list);

        // ================= TO ARRAYS =================

        // LinkedList -> Integer[]
        Integer[] wrapperArray = list.toArray(new Integer[0]);

        // LinkedList -> int[]
        int[] primitiveArray = list.stream()
                                  .mapToInt(Integer::intValue)
                                  .toArray();

        System.out.println("Original LinkedList: " + list);
    }
}