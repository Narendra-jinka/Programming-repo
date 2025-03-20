class Solution {

    public int helper(int ind,int[] nums,int[] dp){
        if(ind==0) return nums[0];
        if(ind < 0 ) return 0;
        if(dp[ind]!=-1) return dp[ind];
        int pic = nums[ind] + helper(ind-2,nums,dp);
        int notpic = 0+helper(ind-1,nums,dp);

        return dp[ind] = Math.max(pic,notpic);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp = new int[n];
        // for(int i=0;i<n;i++){
        //     dp[i]=-1;
        // }
        //Memorization ; 
        // return helper(n-1,nums,dp);

        dp[0]=nums[0];
        for(int i=1;i<n;i++){
            int pic = nums[i] +((i>1) ? dp[i-2] : 0);
            int notpic = dp[i-1];
            dp[i]=Math.max(pic,notpic);
        }

        return dp[n-1];
    }
}