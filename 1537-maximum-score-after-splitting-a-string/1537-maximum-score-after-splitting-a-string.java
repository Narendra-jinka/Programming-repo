class Solution {
    public int maxScore(String s) {
       int max=0;
       int one=0;
       for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0') one++;
       } 
       int zero=0;
       for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)=='0'){
            zero++;
            int k= zero+one;
            max =Math.max(k,max);
        }
        else{
            one--;
            int k=zero+one;
            max=Math.max(k,max);
        }
       }
       return max;
    }
}