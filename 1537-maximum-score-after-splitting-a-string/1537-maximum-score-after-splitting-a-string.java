class Solution {
    public int maxScore(String s) {
        int max=0;
        int o1=0;
        for(char c:s.toCharArray()){
            if(c!='0'){
                o1+=1;
            } 
        }
        
        int z0=0; 
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                z0=z0+1;
            }else{
                o1-=1;
            }
            int sum=z0+o1;
            max=Math.max(max,sum);

        }
        return max;     

    }
}