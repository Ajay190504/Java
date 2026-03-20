import java.util.*;

public class CollectionsAllMethods {

    public static void main(String[] args) {

        // ---------------------------------------------------------
        // BASIC COLLECTION CREATION
        // ---------------------------------------------------------

        List<Integer> list = new ArrayList<>();

        // addAll(Collection<? super T> c, T... elements)
        // c → target collection, elements → values to be added
        Collections.addAll(list, 40, 10, 30, 20, 50);

        System.out.println("Original List: " + list);


        // ---------------------------------------------------------
        // SORTING AND ORDERING METHODS
        // ---------------------------------------------------------

        // sort(List<T> list)
        // list → collection to be sorted (ascending order)
        Collections.sort(list);
        System.out.println("Ascending Sort: " + list);

        // sort(List<T> list, Comparator<? super T> c)
        // list → collection, c → comparator (defines order)
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Sort: " + list);

        // reverseOrder()
        // returns Comparator for descending order

        // reverse(List<?> list)
        // list → collection whose elements are reversed
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // shuffle(List<?> list)
        // list → collection to randomize
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        // rotate(List<?> list, int distance)
        // list → collection, distance → positions to rotate
        Collections.rotate(list, 2);
        System.out.println("Rotated List: " + list);

        // swap(List<?> list, int i, int j)
        // list → collection, i & j → indexes to swap
        Collections.swap(list, 0, 3);
        System.out.println("After Swap: " + list);


        // ---------------------------------------------------------
        // SEARCHING AND STATISTICS
        // ---------------------------------------------------------

        Collections.sort(list);

        // binarySearch(List<? extends Comparable<? super T>> list, T key)
        // list → sorted collection, key → element to search
        int index = Collections.binarySearch(list, 30);
        System.out.println("Index of 30: " + index);

        // max(Collection<? extends T> coll)
        // coll → collection to find maximum element
        int max = Collections.max(list);
        System.out.println("Maximum Element: " + max);

        // min(Collection<? extends T> coll)
        // coll → collection to find minimum element
        int min = Collections.min(list);
        System.out.println("Minimum Element: " + min);

        // frequency(Collection<?> c, Object o)
        // c → collection, o → element to count
        list.add(20);
        list.add(20);
        int freq = Collections.frequency(list, 20);
        System.out.println("Frequency of 20: " + freq);

        // disjoint(Collection<?> c1, Collection<?> c2)
        // c1, c2 → collections to compare
        List<Integer> list2 = Arrays.asList(100, 200, 300);
        boolean disjoint = Collections.disjoint(list, list2);
        System.out.println("Collections Disjoint: " + disjoint);


        // ---------------------------------------------------------
        // MODIFICATION METHODS
        // ---------------------------------------------------------

        // replaceAll(List<T> list, T oldVal, T newVal)
        // list → collection, oldVal → value to replace, newVal → new value
        Collections.replaceAll(list, 20, 99);
        System.out.println("After replaceAll: " + list);

        // fill(List<? super T> list, T obj)
        // list → collection, obj → value to fill
        List<Integer> fillList = new ArrayList<>(Arrays.asList(1,2,3,4));
        Collections.fill(fillList, 0);
        System.out.println("After fill(): " + fillList);

        // copy(List<? super T> dest, List<? extends T> src)
        // dest → destination list, src → source list
        List<Integer> src = Arrays.asList(7,8,9);
        List<Integer> dest = new ArrayList<>(Arrays.asList(0,0,0));

        Collections.copy(dest, src);
        System.out.println("After copy(): " + dest);


        // ---------------------------------------------------------
        // IMMUTABLE COLLECTION FACTORY METHODS
        // ---------------------------------------------------------

        // emptyList()
        // returns immutable empty List
        List<String> emptyList = Collections.emptyList();

        // emptySet()
        // returns immutable empty Set
        Set<String> emptySet = Collections.emptySet();

        // emptyMap()
        // returns immutable empty Map
        Map<String,Integer> emptyMap = Collections.emptyMap();

        System.out.println("Empty List: " + emptyList);
        System.out.println("Empty Set: " + emptySet);
        System.out.println("Empty Map: " + emptyMap);


        // singleton(T o)
        // o → single element
        Set<String> singletonSet = Collections.singleton("Java");

        // singletonList(T o)
        // o → single element
        List<String> singletonList = Collections.singletonList("AI");

        // singletonMap(K key, V value)
        // key → map key, value → map value
        Map<String,Integer> singletonMap = Collections.singletonMap("Age",25);

        System.out.println("Singleton Set: " + singletonSet);
        System.out.println("Singleton List: " + singletonList);
        System.out.println("Singleton Map: " + singletonMap);


        // nCopies(int n, T o)
        // n → number of copies, o → element to repeat
        List<String> copies = Collections.nCopies(5, "Hello");

        System.out.println("nCopies List: " + copies);


        // ---------------------------------------------------------
        // UNMODIFIABLE COLLECTION WRAPPERS
        // ---------------------------------------------------------

        List<Integer> modifiableList = new ArrayList<>(Arrays.asList(1,2,3));

        // unmodifiableList(List<? extends T> list)
        // list → original collection
        List<Integer> unmodifiableList = Collections.unmodifiableList(modifiableList);

        Set<Integer> modifiableSet = new HashSet<>(Arrays.asList(10,20,30));

        // unmodifiableSet(Set<? extends T> s)
        // s → original set
        Set<Integer> unmodifiableSet = Collections.unmodifiableSet(modifiableSet);

        Map<Integer,String> modifiableMap = new HashMap<>();
        modifiableMap.put(1,"A");
        modifiableMap.put(2,"B");

        // unmodifiableMap(Map<? extends K, ? extends V> m)
        // m → original map
        Map<Integer,String> unmodifiableMap = Collections.unmodifiableMap(modifiableMap);

        System.out.println("Unmodifiable List: " + unmodifiableList);
        System.out.println("Unmodifiable Set: " + unmodifiableSet);
        System.out.println("Unmodifiable Map: " + unmodifiableMap);


        // ---------------------------------------------------------
        // SYNCHRONIZED COLLECTION WRAPPERS (THREAD SAFE)
        // ---------------------------------------------------------

        // synchronizedList(List<T> list)
        // list → original list
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.add(10);
        syncList.add(20);

        // synchronizedSet(Set<T> s)
        // s → original set
        Set<Integer> syncSet = Collections.synchronizedSet(new HashSet<>());
        syncSet.add(5);
        syncSet.add(15);

        // synchronizedMap(Map<K,V> m)
        // m → original map
        Map<Integer,String> syncMap = Collections.synchronizedMap(new HashMap<>());
        syncMap.put(1,"One");
        syncMap.put(2,"Two");

        System.out.println("Synchronized List: " + syncList);
        System.out.println("Synchronized Set: " + syncSet);
        System.out.println("Synchronized Map: " + syncMap);


        // ---------------------------------------------------------
        // ENUMERATION UTILITIES
        // ---------------------------------------------------------

        Vector<String> vector = new Vector<>();

        vector.add("A");
        vector.add("B");
        vector.add("C");

        // enumeration(Collection<T> c)
        // c → collection to convert into Enumeration
        Enumeration<String> e = Collections.enumeration(vector);

        System.out.print("Enumeration elements: ");

        while(e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }

        System.out.println();

        // list(Enumeration<T> e)
        // e → enumeration to convert into List
        Enumeration<String> e2 = vector.elements();

        List<String> enumList = Collections.list(e2);

        System.out.println("List from Enumeration: " + enumList);

    }
}