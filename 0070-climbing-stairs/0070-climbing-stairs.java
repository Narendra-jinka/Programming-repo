class Solution {
    private static int f(int ind,int[] dp){
        if (ind <= 1) return 1;
        
        if(dp[ind]!=-1) return dp[ind];
        
        return dp[ind]=f(ind-1,dp)+f(ind-2,dp);
    }
    public int climbStairs(int n) {
        /*int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];*/
        
        if(n<=1) return 1;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        f(n,dp);
        return dp[n];
        
        
    }    
}