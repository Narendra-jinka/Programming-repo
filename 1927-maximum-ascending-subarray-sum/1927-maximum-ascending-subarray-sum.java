class Solution {
    public int maxAscendingSum(int[] nums) {
        int n=nums.length;
        int inc=nums[0];
        int max=0;
        
        
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                inc+=nums[i];
            }
            else{
                max=Math.max(max,inc);
                inc=nums[i];
            }
        }

        return Math.max(inc,max);
    }
}