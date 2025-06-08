class Solution {
    public String makeSmallestPalindrome(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        StringBuilder sb = new StringBuilder(s);
        while(i<j){
            char start = sb.charAt(i);
            char end = sb.charAt(j);
            
            if(start!=end){
                if(start < end){
                    sb.setCharAt(j,start);
                }
                else{
                    sb.setCharAt(i,end);
                }
            }
            i++;j--;
        }
        return sb.toString();
    }
}