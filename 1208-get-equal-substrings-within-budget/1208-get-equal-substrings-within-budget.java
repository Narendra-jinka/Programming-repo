class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int[] cost=new int[s.length()];
        for(int i=0;i<s.length();i++){
            cost[i]=Math.abs(s.charAt(i)-t.charAt(i));
        }
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