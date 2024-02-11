//Write a program that counts the number of vowels in a sentence.

package CountUniqueVowels;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountUniqueVowels {
    public static void main(String[] args) {
        // Get input sentence from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().trim();

        //Here Call the countUniqueVowels function to count unique vowels
        int numberOfVowels = countUniqueVowels(sentence);

        //Here Display the result
        System.out.println("Number of unique vowels in the sentence: " + numberOfVowels);

        //Here Close the scanner
        scanner.close();
    }

    // Function to count unique vowels in a given sentence
    public static int countUniqueVowels(String sentence) {
        Set<Character> uniqueVowels = new HashSet<>();

        // Convert the sentence to lowercase to make the comparison case-insensitive
        sentence = sentence.toLowerCase();

        // Loop through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            // Check if the character is a vowel
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                uniqueVowels.add(currentChar);
            }
        }

        return uniqueVowels.size();
    }
}
