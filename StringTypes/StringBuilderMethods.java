public class StringBuilderMethods {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("World");
        
        // STRINGBUILDER CLASS METHODS
        
        // 1. length()
        // What it does: Returns total number of characters
        System.out.println("Length sb: " + sb.length());
        System.out.println("Length sb2: " + sb2.length());
        // Output:
        // Length sb: 5
        // Length sb2: 5


        // 2. capacity()
        // What it does: Returns current buffer capacity (16 + initial length)
        System.out.println("Capacity: " + sb.capacity());
        // Output: Capacity: 21


        // 3. append()
        // What it does: Adds text at the end
        sb.append(" Java");
        System.out.println("Append: " + sb);
        // Output: Append: Hello Java


        // 4. insert(index, str)
        // What it does: Inserts text at specified index
        sb.insert(5, " Amazing");
        System.out.println("Insert: " + sb);
        // Output: Insert: Hello Amazing Java


        // 5. replace(start, end, str)
        // What it does: Replaces characters from start to end-1
        sb.replace(6, 13, "Super");
        System.out.println("Replace: " + sb);
        // Output: Replace: Hello Super Java


        // 6. delete(start, end)
        // What it does: Deletes characters from start to end-1
        sb.delete(6, 11);
        System.out.println("Delete: " + sb);
        // Output: Delete: Hello Java


        // 7. deleteCharAt(index)
        // What it does: Deletes character at given index
        sb.deleteCharAt(5);
        System.out.println("DeleteCharAt: " + sb);
        // Output: DeleteCharAt: HelloJava


        // 8. reverse()
        // What it does: Reverses the character sequence
        sb.reverse();
        System.out.println("Reverse: " + sb);
        // Output: Reverse: avaJolleH


        // 9. charAt(index)
        // What it does: Returns character at specified index
        System.out.println("CharAt(2): " + sb.charAt(2));
        // Output: CharAt(2): a


        // 10. setCharAt(index, ch)
        // What it does: Replaces character at specified index
        sb.setCharAt(0, 'X');
        System.out.println("SetCharAt: " + sb);
        // Output: SetCharAt: XvaJolleH


        // 11. substring(start)
        // What it does: Returns substring from given index
        System.out.println("Substring(1): " + sb.substring(1));
        // Output: Substring(1): vaJolleH


        // 12. substring(start, end)
        // What it does: Returns substring from start to end-1
        System.out.println("Substring(1,4): " + sb.substring(1,4));
        // Output: Substring(1,4): vaJ


        // 13. indexOf(str)
        // What it does: Returns first occurrence index
        System.out.println("IndexOf 'a': " + sb.indexOf("a"));
        // Output: IndexOf 'a': 2


        // 14. lastIndexOf(str)
        // What it does: Returns last occurrence index
        System.out.println("LastIndexOf 'a': " + sb.lastIndexOf("a"));
        // Output: LastIndexOf 'a': 6


        // 15. ensureCapacity(minCapacity)
        // What it does: Increases capacity if needed
        sb.ensureCapacity(50);
        System.out.println("New Capacity: " + sb.capacity());
        // Output: New Capacity: 50


        // 16. trimToSize()
        // What it does: Trims capacity to current length
        sb.trimToSize();
        System.out.println("TrimToSize Capacity: " + sb.capacity());
        // Output: TrimToSize Capacity: 10


        // 17. setLength(newLength)
        // What it does: Changes the length of buffer
        sb.setLength(5);
        System.out.println("SetLength(5): " + sb);
        // Output: SetLength(5): XvaJo


        // OBJECT CLASS METHODS

        // 18. toString()
        // What it does: Converts StringBuilder to String
        String str = sb.toString();
        System.out.println("Converted to String: " + str);
        // Output: Converted to String: XvaJo


        // 19. equals(Object)
        // What it does: Compares object references (NOT content)
        System.out.println("Equals: " + sb.equals(sb2));
        // Output: Equals: false


        // 20. hashCode()
        // What it does: Returns hash code based on object identity
        System.out.println("HashCode sb: " + sb.hashCode());
        System.out.println("HashCode sb2: " + sb2.hashCode());
        // Output: Different integer values


        // 21. getClass()
        // What it does: Returns runtime class
        System.out.println("Class: " + sb.getClass());
        // Output: Class: class java.lang.StringBuilder

    }
}