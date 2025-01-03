class Solution {
    public int waysToSplitArray(int[] nums) {
        long ts=0;
        for(int i:nums){
            ts+=i;
        }
        int count=0;
        long ls=0;
        for(int i=0;i<nums.length-1;i++){
            ls+=nums[i];
            long rs = ts-ls;
            if(ls>=rs) count++;
        }

        return count;

    }
}