import java.util.*;

public class StackConversions {
    public static void main(String[] args) {

        // Create Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Stack -> ArrayList
        ArrayList<Integer> list = new ArrayList<>(stack);

        // Stack -> LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>(stack);

        // Stack -> HashSet
        HashSet<Integer> set = new HashSet<>(stack);

        // Stack -> TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>(stack);

        // Stack -> Queue
        Queue<Integer> queue = new LinkedList<>(stack);

        // Stack -> PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(stack);

        // ================= TO ARRAYS =================

        // Stack -> Integer[]
        Integer[] wrapperArray = stack.toArray(new Integer[0]);

        // Stack -> int[]
        int[] primitiveArray = stack.stream()
                                   .mapToInt(Integer::intValue)
                                   .toArray();

        System.out.println("Original Stack: " + stack);
    }
}