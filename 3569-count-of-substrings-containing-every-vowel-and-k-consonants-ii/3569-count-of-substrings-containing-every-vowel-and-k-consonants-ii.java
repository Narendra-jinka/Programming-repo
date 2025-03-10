import java.util.HashMap;
import java.util.Map;

class Solution {
    // Helper function to count substrings with at most k consonants
    public long count(String word, int k) {
        if (k < 0) {
            return 0;
        }

        // Renaming variables: consonants -> consonantsCount, left pointer -> leftIndex, answer -> result
        Map<Character, Integer> vowelMap = new HashMap<>();
        int consonantsCount = 0;
        int leftIndex = 0;
        long result = 0;
        String vowels = "aeiou"; // vowel -> vowels for readability
        int wordLength = word.length();

        // Sliding window loop using rightIndex
        for (int rightIndex = 0; rightIndex < word.length(); rightIndex++) {
            char currentChar = word.charAt(rightIndex);

            // Check if current character is a vowel
            if (vowels.indexOf(currentChar) >= 0) {
                vowelMap.put(currentChar, vowelMap.getOrDefault(currentChar, 0) + 1);
            } else {
                // It's a consonant, so increment consonants count
                consonantsCount++;
            }

            // Check if the window has at least k consonants and contains all vowels
            while (consonantsCount >= k &&
                   vowelMap.getOrDefault('a', 0) > 0 &&
                   vowelMap.getOrDefault('e', 0) > 0 &&
                   vowelMap.getOrDefault('i', 0) > 0 &&
                   vowelMap.getOrDefault('o', 0) > 0 &&
                   vowelMap.getOrDefault('u', 0) > 0) {

                // Count all valid substrings from current window position
                result += (wordLength - rightIndex);

                // Move the leftIndex to shrink the window and update consonants or vowels accordingly
                char leftChar = word.charAt(leftIndex);

                if (vowels.indexOf(leftChar) >= 0) {
                    vowelMap.put(leftChar, vowelMap.get(leftChar) - 1);
                } else {
                    // Decrement consonantsCount when a consonant moves out of the window
                    consonantsCount--;
                }

                // Move the leftIndex pointer forward
                leftIndex++;
            }
        }

        return result;
    }

    // Function to count substrings with exactly k consonants and all vowels
    public long countOfSubstrings(String word, int k) {
        // count substrings with at most k consonants
        long substringsWithKConsonants = count(word, k);

        // count substrings with at most (k + 1) consonants
        long substringsWithKPlusOneConsonants = count(word, k + 1);

        // Subtract to get the count of substrings with exactly k consonants
        return substringsWithKConsonants - substringsWithKPlusOneConsonants;
    }
}
