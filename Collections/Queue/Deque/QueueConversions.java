import java.util.*;

public class QueueConversions {
    public static void main(String[] args) {

        // Create Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(100);
        queue.add(200);
        queue.add(300);

        // Queue -> ArrayList
        ArrayList<Integer> list = new ArrayList<>(queue);

        // Queue -> LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>(queue);

        // Queue -> HashSet
        HashSet<Integer> set = new HashSet<>(queue);

        // Queue -> TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>(queue);

        // Queue -> PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(queue);

        // Queue -> Stack
        Stack<Integer> stack = new Stack<>();
        stack.addAll(queue);

        // ================= TO ARRAYS =================

        // Queue -> Integer[]
        Integer[] wrapperArray = queue.toArray(new Integer[0]);

        // Queue -> int[]
        int[] primitiveArray = queue.stream()
                                   .mapToInt(Integer::intValue)
                                   .toArray();

        System.out.println("Original Queue: " + queue);
    }
}