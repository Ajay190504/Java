public class StringBufferMethods {

    public static void main(String[] args) throws CloneNotSupportedException {

        StringBuffer sbf = new StringBuffer("Hello");
        StringBuffer sbf2 = new StringBuffer("Hello");
        
     // STRINGBUFFER CLASS METHODS
        // 1. length()
        // Returns total number of characters
        System.out.println("Length: " + sbf.length());
        // Output: Length: 5


        // 2. capacity()
        // Returns current buffer capacity (default 16 + length)
        System.out.println("Capacity: " + sbf.capacity());
        // Output: Capacity: 21


        // 3. append()
        // Adds text at the end
        sbf.append(" Java");
        System.out.println("Append: " + sbf);
        // Output: Append: Hello Java


        // 4. insert(index, str)
        // Inserts text at specified index
        sbf.insert(5, " Super");
        System.out.println("Insert: " + sbf);
        // Output: Insert: Hello Super Java


        // 5. replace(start, end, str)
        // Replaces characters from start to end-1
        sbf.replace(6, 11, "Mega");
        System.out.println("Replace: " + sbf);
        // Output: Replace: Hello Mega Java


        // 6. delete(start, end)
        // Deletes characters from start to end-1
        sbf.delete(6, 11);
        System.out.println("Delete: " + sbf);
        // Output: Delete: Hello Java


        // 7. deleteCharAt(index)
        // Deletes character at given index
        sbf.deleteCharAt(5);
        System.out.println("DeleteCharAt: " + sbf);
        // Output: DeleteCharAt: HelloJava


        // 8. reverse()
        // Reverses the character sequence
        sbf.reverse();
        System.out.println("Reverse: " + sbf);
        // Output: Reverse: avaJolleH


        // 9. charAt(index)
        // Returns character at specified index
        System.out.println("CharAt(2): " + sbf.charAt(2));
        // Output: CharAt(2): a


        // 10. setCharAt(index, ch)
        // Replaces character at specified index
        sbf.setCharAt(0, 'Y');
        System.out.println("SetCharAt: " + sbf);
        // Output: SetCharAt: YvaJolleH


        // 11. substring(start, end)
        // Returns substring (as String)
        System.out.println("Substring(1,4): " + sbf.substring(1,4));
        // Output: Substring(1,4): vaJ


        // 12. indexOf(str)
        // Returns first occurrence index
        System.out.println("IndexOf 'a': " + sbf.indexOf("a"));
        // Output: IndexOf 'a': 2


        // 13. lastIndexOf(str)
        // Returns last occurrence index
        System.out.println("LastIndexOf 'a': " + sbf.lastIndexOf("a"));
        // Output: LastIndexOf 'a': 6


        // 14. subSequence(start, end)
        // Returns subsequence (CharSequence)
        System.out.println("SubSequence(1,4): " + sbf.subSequence(1,4));
        // Output: SubSequence(1,4): vaJ


        // 15. ensureCapacity(minCapacity)
        // Increases capacity if required
        sbf.ensureCapacity(60);
        System.out.println("New Capacity: " + sbf.capacity());
        // Output: New Capacity: 60


        // 16. trimToSize()
        // Trims capacity to current length
        sbf.trimToSize();
        System.out.println("TrimToSize Capacity: " + sbf.capacity());
        // Output: TrimToSize Capacity: 10


        // 17. setLength(newLength)
        // Changes length of buffer
        sbf.setLength(5);
        System.out.println("SetLength(5): " + sbf);
        // Output: SetLength(5): YvaJo


        // 18. compareTo()
        // Lexicographically compares two StringBuffers
        System.out.println("CompareTo: " + sbf.compareTo(sbf2));
        // Output: Non-zero value (based on comparison)


        // OBJECT CLASS METHODS

        // 19. toString()
        // Converts StringBuffer to String
        String result = sbf.toString();
        System.out.println("Converted to String: " + result);
        // Output: Converted to String: YvaJo


        // 20. equals(Object)
        // Compares object references (NOT content)
        System.out.println("Equals: " + sbf.equals(sbf2));
        // Output: Equals: false


        // 21. hashCode()
        // Returns hash code based on object identity
        System.out.println("HashCode sbf: " + sbf.hashCode());
        System.out.println("HashCode sbf2: " + sbf2.hashCode());
        // Output: Different integer values


        // 22. getClass()
        // Returns runtime class
        System.out.println("Class: " + sbf.getClass());
        // Output: Class: class java.lang.StringBuffer




    }
}