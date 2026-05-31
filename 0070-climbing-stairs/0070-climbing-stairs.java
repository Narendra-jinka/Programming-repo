class Solution {
    public int f(int n,int[] dp){
        if(n<0) return 0;
        if(dp[n]!=0) return dp[n];
        int left = f(n-1,dp);
        int right = f(n-2,dp);
        return dp[n] = left+right;
    }
    public int climbStairs(int n) {
        // int[] dp = new int[n+1];
        // dp[0]=1;

        // f(n,dp);

        // return dp[n];\

        int p1 =1;
        int p2 = 1 ; 
        for(int i=2;i<=n;i++){
            int cur = p1+p2;
            p1=p2;
            p2=cur;
        }
        return p2;
        
    }
}