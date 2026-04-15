/* 
4> 
Chat Message Analyzer
Problem:

Messages stored in List<String>

Tasks:
Count total words
Find most used word
Filter messages containing specific keyword
Sort messages by length
Remove messages shorter than 3 words
   */

import java.util.*;

public class Chats {

    public static void main(String[] args) {

        // Input messages
        List<String> messages = new ArrayList<>(Arrays.asList(
                "Hello how are you",
                "I am fine",
                "Java is great",
                "Hello Java developers",
                "Hi",
                "Java is powerful and Java is popular"
        ));

        // Count total words
        int totalWords = 0;

        // Map to store word frequency
        Map<String, Integer> wordCount = new HashMap<>();

        for (String msg : messages) {

            // Split message into words
            String[] words = msg.split("\\s+");

            // Skip messages shorter than 3 words
            if (words.length < 3) continue;

            // Count words and update frequency map
            for (String word : words) {
                totalWords++;
                word = word.toLowerCase(); // normalize case
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Find most used word
        String mostUsedWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostUsedWord = entry.getKey();
            }
        }

        // Filter messages containing specific keyword
        String keyword = "java";
        List<String> filteredMessages = new ArrayList<>();

        for (String msg : messages) {
            if (msg.toLowerCase().contains(keyword)) {
                filteredMessages.add(msg);
            }
        }

        // Remove messages shorter than 3 words
        messages.removeIf(msg -> msg.split("\\s+").length < 3);

        // Sort messages by length (number of characters)
        messages.sort(Comparator.comparingInt(String::length));

        // Output results
        System.out.println("Total words: " + totalWords);
        System.out.println("Most used word: " + mostUsedWord);

        System.out.println("\nFiltered messages (keyword = " + keyword + "):");
        for (String msg : filteredMessages) {
            System.out.println(msg);
        }

        System.out.println("\nMessages after removing short ones and sorting:");
        for (String msg : messages) {
            System.out.println(msg);
        }
    }
}