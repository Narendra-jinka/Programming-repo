class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int zind=-1;
        int ind=0;

        while(ind<n){
            if(nums[ind]==0){
                if(zind==-1){
                    zind=ind;
                }
            }
            else{
                if(zind!=-1){
                    nums[zind]=nums[ind];
                    nums[ind]=0;
                    while(nums[zind]!=0){
                        zind++;
                    }
                }
            }
            
            ind++;
        }
        return nums;
    }
}