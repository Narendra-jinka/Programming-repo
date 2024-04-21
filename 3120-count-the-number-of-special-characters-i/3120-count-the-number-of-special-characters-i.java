import java.util.HashSet;

class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        
        
        for (char c : word.toCharArray()) {
            set.add(c);
        }
        for(char c:word.toCharArray()){
            if(Character.isLowerCase(c) && set.contains(Character.toUpperCase(c))){
                count++;
                set.remove(Character.toUpperCase(c));
            }
        }
        return count;
    }
}
