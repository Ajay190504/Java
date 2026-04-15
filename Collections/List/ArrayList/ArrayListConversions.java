import java.util.*;

public class ArrayListConversions {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2));

        // ================= TO OTHER COLLECTIONS =================

        // ArrayList -> LinkedList (List to List)
        LinkedList<Integer> linkedList = new LinkedList<>(list);

        // ArrayList -> HashSet (removes duplicates, no order)
        HashSet<Integer> hashSet = new HashSet<>(list);

        // ArrayList -> LinkedHashSet (removes duplicates, keeps insertion order)
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(list);

        // ArrayList -> TreeSet (removes duplicates, sorts elements)
        TreeSet<Integer> treeSet = new TreeSet<>(list);

        // ArrayList -> Queue (LinkedList used as Queue)
        Queue<Integer> queue = new LinkedList<>(list);

        // ArrayList -> PriorityQueue (natural ordering)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(list);

        // ArrayList -> Stack (manual add)
        Stack<Integer> stack = new Stack<>();
        stack.addAll(list);

        // ================= TO ARRAYS =================

        // ArrayList -> Integer[] (Wrapper array)
        Integer[] wrapperArray = list.toArray(new Integer[0]);

        // ArrayList -> int[] (Primitive array using Stream API)
        int[] primitiveArray = list.stream()
                                   .mapToInt(Integer::intValue) // unboxing Integer -> int
                                   .toArray();

        // ================= OUTPUT =================
        System.out.println("Original ArrayList: " + list);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("Queue: " + queue);
        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Stack: " + stack);
        System.out.println("Integer[]: " + Arrays.toString(wrapperArray));
        System.out.println("int[]: " + Arrays.toString(primitiveArray));
    }
}