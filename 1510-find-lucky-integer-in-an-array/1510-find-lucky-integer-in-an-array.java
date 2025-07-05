class Solution {
    public int findLucky(int[] arr) {
        int[] ans = new int[501];
        for(int i:arr){
            ans[i] = ans[i]+1;
        }
        int res=-1;
        for(int i=1;i<501;i++){
           if (ans[i]==i) res=i;
        }
        return res;
    }
}