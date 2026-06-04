class Solution {
    public int helper(int i,int j, int[][] g, int[][] dp ){
        if(i==0 && j==0 )  return g[0][0];
        if(i<0 || j < 0) return Integer.MAX_VALUE;
        if(dp[i][j]!=0) return dp[i][j];
        int up  = helper(i-1,j,g,dp);
        int left = helper(i,j-1,g,dp);

        return dp[i][j] = g[i][j]+Math.min(up, left);
    }
    public int minPathSum(int[][] g) {
        int m = g.length;
        int n = g[0].length;
        if(m==1 && n==1) return g[0][0];
        int[][] dp = new int[m][n];
        helper(m-1,n-1,g,dp);
        return dp[m-1][n-1];
    }
}