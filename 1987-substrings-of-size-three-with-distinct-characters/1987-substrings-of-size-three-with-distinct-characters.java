


class Solution {
    public int countGoodSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            String substring = s.substring(i, i + 3);
            if (substring.chars().distinct().count() == 3) {
                ans++;
            }
        }
        return ans;
    }
}