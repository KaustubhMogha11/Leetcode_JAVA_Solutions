class Solution {
    public int uniquePaths(int m, int n) {
        
        int dp[][]=new int[m][n];
        
    return ans(m,n,dp,0,0);
    }
    
    public int ans(int m,int n,int[][] dp,int i,int j){
        
        if(i==m-1 && j==n-1)
            return 1;
        if(i>=m || j>=n)
            return 0;
        if(dp[i][j]!=0)
            return dp[i][j];
        
        int opt1=ans(m,n,dp,i+1,j);
        int opt2=ans(m,n,dp,i,j+1);
        
        dp[i][j]=opt1+opt2;
        return dp[i][j];
    }
}