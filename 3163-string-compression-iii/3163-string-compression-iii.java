class Solution {
    public String compressedString(String word) {
       /* StringBuilder comp = new StringBuilder();
        int i = 0;
        
        while (i < word.length()) {
            char currentChar = word.charAt(i);
            int count = 0;
            
            while (i < word.length() && word.charAt(i) == currentChar && count < 9) {
                count++;
                i++;
            }
            
            
            comp.append(count).append(currentChar);
        }
        
        return comp.toString();*/
        StringBuilder sb = new StringBuilder();
    int i = 0;
    int j = 0;

    while (i < word.length() && j < word.length()) {
        if (j + 1 < word.length() && word.charAt(j) == word.charAt(j + 1) && j - i + 1 < 9) {
            j++;
        } else {
            sb.append(j - i + 1).append(word.charAt(i));
            j++;
            i = j;
        }
    }

    // Final check if the last characters were part of a sequence
    /*if (sb.charAt(sb.length()-1) == word.charAt(j)) {
        int length = sb.length();
        if (sb.charAt(length - 2) != '9') {
            sb.setCharAt(length - 2, (char) (sb.charAt(length - 2) + 1));
        }
        sb.append(1).append(word.charAt(j));
    }*/

    return sb.toString();
    }
}
