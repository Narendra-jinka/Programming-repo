import java.util.ArrayList;
import java.util.List;

class Solution {
     
    // Method to check if a given string is a palindrome
    boolean check(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    // Recursive method to find palindromic partitions
    public void getPal(String s, int start, ArrayList<ArrayList<String>> res, ArrayList<String> cur) {
        if (start == s.length()) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            String subStr = s.substring(start, end + 1);
            if (check(subStr)) {
                cur.add(subStr);
                getPal(s, end + 1, res, cur);
                cur.remove(cur.size() - 1);
            }
        }
    }

  
    public List<List<String>> partition(String s) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        getPal(s, 0, res, new ArrayList<String>());
        return new ArrayList<>(res);
    }

    
}
