import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        
        // Edge case: if words array is empty, return an empty result
        if (words.length == 0) {
            return result;
        }

        // Initialize an array to store the minimum frequency of each character (26 lowercase letters)
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        // Process each word
        for (String word : words) {
            // Initialize an array to store the frequency of characters in the current word
            int[] charCount = new int[26];
            for (char c : word.toCharArray()) {
                charCount[c - 'a']++;
            }

            // Update the minFreq array to keep the minimum frequency of each character
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charCount[i]);
            }
        }

        // Collect the common characters based on the minimum frequency array
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }

        return result;
    }

    
}
