class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set=new HashSet<>();
        
        int ans=0;
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                ans++;
            }
            else{
                set.add(c);
            }
        }
        
        if(!set.isEmpty()) return (ans*2)+1;
        return ans*2;
        
    }
}