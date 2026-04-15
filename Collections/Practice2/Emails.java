/* 3> Email Management System
 Problem:

You have a list of emails.

Tasks:
Remove duplicate emails
Validate emails (must contain @ and .)
Group emails by domain (gmail, yahoo, etc.)
Count how many users per domain
Sort emails by domain name
   */

import java.util.*;

public class Emails {

    // Method to validate email using regex
    public static boolean isValidEmail(String email) {

        // Return false if null
        if (email == null) return false;

        // Regex for standard email validation
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }
    
    public static void main(String[] args) {

        // Input list with duplicates and invalid emails
        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "user2@yahoo.com",
                "user3@gmail.com",
                "user1@gmail.com",   // duplicate
                "invalidemail.com",  // invalid
                "@gmail.com",        // invalid
                "user4@outlook.com",
                "user5@yahoo.com",
                "user@@gmail.com"    // invalid
        );

        // Remove duplicates using HashSet
        Set<String> uniqueEmails = new HashSet<>(emails);

        // Store only valid emails
        List<String> validEmails = new ArrayList<>();

        for (String email : uniqueEmails) {
            if (isValidEmail(email)) { // validate using regex
                validEmails.add(email);
            }
        }

        // Map to group emails by domain
        Map<String, List<String>> domainMap = new HashMap<>();

        for (String email : validEmails) {

            // Extract domain from email (after '@')
            String domain = email.substring(email.indexOf("@") + 1);

            // Initialize list if domain not present
            domainMap.putIfAbsent(domain, new ArrayList<>());

            // Add email to its domain group
            domainMap.get(domain).add(email);
        }

        // Display count of users per domain
        System.out.println("User count per domain:");
        for (Map.Entry<String, List<String>> entry : domainMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue().size());
        }

        // Sort emails based on domain name
        validEmails.sort(Comparator.comparing(
                e -> e.substring(e.indexOf("@") + 1)
        ));

        // Print sorted emails
        System.out.println("\nSorted Emails by Domain:");
        for (String email : validEmails) {
            System.out.println(email);
        }
    }

    
}