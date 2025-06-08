class Solution {
    
    
        public int countGoodSubstrings(String s) {
        int res = 0;
        int length = s.length();
        for(int i = 2; i < length; i++){
            char ch1 = s.charAt(i-2);
            char ch2 = s.charAt(i-1);
            char ch3 = s.charAt(i);
            if(ch1 != ch2 && ch2 != ch3 && ch3 != ch1) res++;
        }
        return res;        
    }
}