class Solution {
    public String reverseWords(String s) {
        int i=0;
        int j=0;
        
        StringBuilder sb = new StringBuilder();
        s=s.trim();
        int n=s.length();
        while(j<n){
            if(s.charAt(j)==' '){
                if(i!=j){
                    sb.insert(0," "+s.substring(i,j));
                    i=j+1;
                }
                else{
                    i++;
                }
               
            }
            j++; 
        }
        sb.insert(0,s.substring(i,n));
        return sb.toString();
    }
}