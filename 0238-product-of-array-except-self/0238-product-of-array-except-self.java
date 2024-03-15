class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int countOfNulls = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                countOfNulls++;
            }else
                product*=nums[i];
        }

        int[] res = new int[nums.length];
        if(countOfNulls==0){
            for(int i=0;i<nums.length;i++){
                res[i] = product/nums[i];
            }
        }else if(countOfNulls==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    res[i]=product;
                }
            }
        }
        
        return res;
    }
}