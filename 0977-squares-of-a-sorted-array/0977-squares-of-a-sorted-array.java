class Solution {
    public int[] sortedSquares(int[] nums) {
       /* for(int i=0;i<nums.length;i++){
            nums[i]=(nums[i]*nums[i]);
        }
        Arrays.sort(nums);
        return nums;*/
        int j=nums.length-1,i=0;
        int[] res=new int[nums.length];
        int k=nums.length-1;
        while(j>=i){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                res[k]=(nums[i]*nums[i]);
                k--;i++;
            }
            else{
                res[k]=(nums[j]*nums[j]);
                k--;j--;
            }
        }
        return res;
        
    }
}