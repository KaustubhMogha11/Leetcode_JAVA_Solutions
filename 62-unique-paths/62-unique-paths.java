class Solution {
    public int uniquePaths(int m, int n) {
     
        int dp[][]=new int[m+1][n+1];
        return uniquePaths(m,n,0,0,dp);
    }
      public int uniquePaths(int m, int n,int i, int j,int dp[][]){
          
          if(dp[i][j]!=0)
          {
              return dp[i][j];
          }
         
          if(i==m-1 && j==n-1)
          {
              dp[i][j]=1;
              return dp[i][j];
          }
          
          if(i>=m || j>=n)
          {
              dp[i][j]=0;
              return dp[i][j];
          }
          
          int left=uniquePaths(m,n,i,j+1,dp);
           int right=uniquePaths(m,n,i+1,j,dp);
          
          dp[i][j]=left+right;
          
          return dp[i][j];
      }
    
}