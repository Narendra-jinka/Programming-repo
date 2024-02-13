class Solution {
    public String firstPalindrome(String[] words) {
        String res="";
        for(String s:words ){
            StringBuilder sb=new StringBuilder(s);
            sb.reverse();
            if(s.equals(sb.toString())){
                res=s;
                break;
            }
        }
        return res;
    }
}