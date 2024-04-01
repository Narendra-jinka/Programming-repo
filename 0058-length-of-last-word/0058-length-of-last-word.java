class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        int n=str.length;
        if(str[n-1]!=" "){
            return str[n-1].length();
        }
        else{
            n=n-2;
            while(str[n]==" "){
                n--;
            }
            return str[n].length();
        }
    }
}