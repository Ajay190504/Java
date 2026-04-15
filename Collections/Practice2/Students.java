/* 1> Problem Statement:

You are building a system for an institute.

You have a list of student names (ArrayList<String>)
Perform following operations:
 Tasks:
Remove duplicate names
Sort names alphabetically
Find names starting with a vowel
Count frequency of each name
Find the longest name
Convert all names to uppercase

 */

import java.util.ArrayList;

public class Students {

    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Ajay");
        studentNames.add("Sujay");
        studentNames.add("Danny");
        studentNames.add("Sujay");
        studentNames.add("Rohit");

        // Remove duplicate names
        ArrayList<String> uniqueNames = new ArrayList<>();
        for (String name : studentNames) {
            if (!uniqueNames.contains(name)) {
                uniqueNames.add(name);
            }
        }
        for (String name : uniqueNames) {
            System.out.println(name);
        }

        // Sort names alphabetically ascending order
        uniqueNames.sort((a, b) -> a.compareTo(b));
        for (String name : uniqueNames) {
            System.out.println(name);
        }

        // Sort names alphabetically descending order
        uniqueNames.sort((a, b) -> b.compareTo(a));
        for (String name : uniqueNames) {
            System.out.println(name);
        }

        // Find names starting with a vowel
        ArrayList<String> namesStartingWithVowel = new ArrayList<>();
        for (String name : uniqueNames) {
            if (name != null && !name.isEmpty()) {
                char ch = Character.toLowerCase(name.charAt(0));

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    namesStartingWithVowel.add(name);
                }
            }
        }

        // Count frequency of each name
        for (String name : uniqueNames) {
            int frequency = 0;
            for (String originalName : studentNames) {
                if (originalName.equals(name)) {
                    frequency++;
                }
            }
            System.out.println(name + ": " + frequency);
        }

        // Find the longest name
        String longestName = "";
        for (String name : uniqueNames) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }

        // Convert all names to uppercase
        ArrayList<String> uppercaseNames = new ArrayList<>();
        for (String name : uniqueNames) {
            uppercaseNames.add(name.toUpperCase());
        }

        // Output results
        System.out.println("Unique Names: " + uniqueNames);
        System.out.println("Sorted Names: " + uniqueNames);
        System.out.println("Names Starting with a Vowel: " + namesStartingWithVowel);
        System.out.println("Longest Name: " + longestName);
        System.out.println("Uppercase Names: " + uppercaseNames);
    }
}
