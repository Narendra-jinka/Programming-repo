class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int[] cost=new int[s.length()];
        
        // here we are cal the cost to change the each char in s - char in t ....
        for(int i=0;i<s.length();i++){
            cost[i]=Math.abs(s.charAt(i)-t.charAt(i));
        }
        
        //after cal the costs we will find len the longest sub arry which has max len of maxCost .... so we use sliding window
        
        
        
        int i=0,j=0;
        int cursum=0;
        int maxlen=0;
        while(i<cost.length && j<cost.length){
            cursum+=cost[j];
            while(cursum>maxCost){
                cursum-=cost[i];
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        
        return maxlen;
    }
}