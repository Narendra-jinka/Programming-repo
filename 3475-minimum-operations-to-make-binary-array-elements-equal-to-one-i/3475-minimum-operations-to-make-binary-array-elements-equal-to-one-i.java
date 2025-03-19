class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        int len=nums.length;
        int i=0;
        while (i<len-2){
            if (nums[i]==0){
                c++;
                for (int j=i;j<i+3;j++){
                    if (nums[j]==0){
                        nums[j]=1;
                    }
                    else{
                        nums[j]=0;
                    }
                }
            }
            i++;
        }
        for (int k=len-2;k<len;k++){
            if (nums[k]==0){
                return -1;
            }
        }
        return c;
    }
}