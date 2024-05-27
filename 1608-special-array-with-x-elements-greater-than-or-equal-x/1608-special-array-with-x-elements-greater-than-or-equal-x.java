class Solution {
    public boolean helper(int k,int[] nums){
        int count=0;
        for(int i:nums){
            if(k<=i){
                count++;
            }
        }
        return count==k ? true:false;
    }
    public int specialArray(int[] nums) {
        
        int n=nums.length;
        int max=-1;
        for(int i:nums){
            if(max<i) max=i;
        }
        
       
        int k=-1;
        for(int i=0;i<=max;i++){
            if(helper(i,nums)){
                k=i;
                break;
            }
        }
        return k;
    }
}