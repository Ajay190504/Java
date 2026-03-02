import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = new String("World");
        String s3 = "  Java Programming  ";
        
        // STRING CLASS METHODS

        // 1. length()
        // What it does: Returns total number of characters
        System.out.println("Length: " + s1.length());
        // Output: Length: 5


        // 2. charAt(index)
        // What it does: Returns character at specified index
        System.out.println("Character at index 1: " + s1.charAt(1));
        // Output: Character at index 1: e


        // 3. equals(String)
        // What it does: Compares content (case-sensitive)
        System.out.println("Equals: " + s1.equals("Hello"));
        // Output: Equals: true


        // 4. equalsIgnoreCase(String)
        // What it does: Compares content ignoring case
        System.out.println("Equals Ignore Case: " +
                s1.equalsIgnoreCase("hello"));
        // Output: Equals Ignore Case: true


        // 5. compareTo(String)
        // What it does: Lexicographically compares strings
        System.out.println("CompareTo: " + s1.compareTo("Hel"));
        // Output: CompareTo: 2


        // 6. contains(CharSequence)
        // What it does: Checks if substring exists
        System.out.println("Contains 'ell': " + s1.contains("ell"));
        // Output: Contains 'ell': true


        // 7. startsWith(String)
        // What it does: Checks prefix
        System.out.println("Starts with He: " + s1.startsWith("He"));
        // Output: Starts with He: true


        // 8. endsWith(String)
        // What it does: Checks suffix
        System.out.println("Ends with lo: " + s1.endsWith("lo"));
        // Output: Ends with lo: true


        // 9. indexOf()
        // What it does: Returns first occurrence index
        System.out.println("IndexOf l: " + s1.indexOf('l'));
        // Output: IndexOf l: 2


        // 10. lastIndexOf()
        // What it does: Returns last occurrence index
        System.out.println("LastIndexOf l: " + s1.lastIndexOf('l'));
        // Output: LastIndexOf l: 3


        // 11. substring(beginIndex)
        // What it does: Returns substring from index to end
        System.out.println("Substring(1): " + s1.substring(1));
        // Output: Substring(1): ello


        // 12. substring(beginIndex, endIndex)
        // What it does: Returns substring (end exclusive)
        System.out.println("Substring(1,4): " + s1.substring(1,4));
        // Output: Substring(1,4): ell


        // 13. toUpperCase()
        // What it does: Converts to uppercase
        System.out.println("Uppercase: " + s1.toUpperCase());
        // Output: Uppercase: HELLO


        // 14. toLowerCase()
        // What it does: Converts to lowercase
        System.out.println("Lowercase: " + s1.toLowerCase());
        // Output: Lowercase: hello


        // 15. trim()
        // What it does: Removes leading and trailing spaces
        System.out.println("Trimmed: '" + s3.trim() + "'");
        // Output: Trimmed: 'Java Programming'


        // 16. replace()
        // What it does: Replaces all occurrences of character
        System.out.println("Replace l with x: " +
                s1.replace('l', 'x'));
        // Output: Replace l with x: Hexxo


        // 17. replaceAll(regex, replacement)
        // What it does: Replaces using regex
        System.out.println("ReplaceAll vowels: " +
                s1.replaceAll("[aeiou]", "*"));
        // Output: ReplaceAll vowels: H*ll*


        // 18. split(regex)
        // What it does: Splits string into array
        String sentence = "Java is powerful and simple";
        String[] words = sentence.split(" ");
        System.out.println("Split: " + Arrays.toString(words));
        // Output: Split: [Java, is, powerful, and, simple]


        // 19. join(delimiter, elements)
        // What it does: Joins strings with delimiter
        String joined = String.join("-", "2026", "02", "25");
        System.out.println("Joined: " + joined);
        // Output: Joined: 2026-02-25


        // 20. concat(String)
        // What it does: Concatenates strings
        System.out.println("Concat: " + s1.concat(" ").concat(s2));
        // Output: Concat: Hello World


        // 21. valueOf()
        // What it does: Converts primitive to String
        int num = 100;
        System.out.println("ValueOf: " + String.valueOf(num));
        // Output: ValueOf: 100


        // 22. toCharArray()
        // What it does: Converts string to char array
        char[] arr = s1.toCharArray();
        System.out.println("ToCharArray: " + Arrays.toString(arr));
        // Output: ToCharArray: [H, e, l, l, o]


        // 23. isEmpty()
        // What it does: Checks if string length is 0
        String emptyStr = "";
        System.out.println("IsEmpty: " + emptyStr.isEmpty());
        // Output: IsEmpty: true


        // 24. isBlank() (Java 11+)
        // What it does: Checks if only whitespace
        String blankStr = "   ";
        System.out.println("IsBlank: " + blankStr.isBlank());
        // Output: IsBlank: true


        // 25. matches(regex)
        // What it does: Matches entire string with regex
        String email = "test@gmail.com";
        System.out.println("Matches email: " +
                email.matches("^[a-zA-Z0-9+_.-]+@(.+)$"));
        // Output: Matches email: true


        // 26. format()
        // What it does: Creates formatted string
        String formatted = String.format(
                "Name: %s, Age: %d", "Ajay", 22);
        System.out.println("Formatted: " + formatted);
        // Output: Formatted: Name: Ajay, Age: 22


        // 27. intern()
        // What it does: Returns reference from String Pool
        String a = new String("Java");
        String b = a.intern();
        System.out.println("Intern comparison: " + (b == "Java"));
        // Output: Intern comparison: true


        // 28. subSequence()
        // What it does: Returns subsequence (end exclusive)
        System.out.println("SubSequence: " + s1.subSequence(1,4));
        // Output: SubSequence: ell


        // OBJECT CLASS METHODS
        // 29. hashCode()
        // What it does: Returns hash based on content (String overrides it)
        System.out.println("HashCode s1: " + s1.hashCode());


        // 30. getClass()
        // What it does: Returns runtime class
        System.out.println("Class: " + s1.getClass());
        // Output: Class: class java.lang.String


        // 31. toString()
        // What it does: Returns same string object
        System.out.println("ToString: " + s1.toString());
        // Output: ToString: Hello


        System.out.println("Program Completed");
    }
}