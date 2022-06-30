class Solution {
    public int uniquePaths(int m, int n) {
        
        int dp[][]=new int[m][n];
        
        return uniquePaths(m-1,n-1,dp);
    }
    
      public int uniquePaths(int m, int n,int[][] dp) {
          
       if(m==0 && n==0)
       {
           return 1;
       }
          if(m<0 || n<0)
          {
              return 0;
          }
          
          if(dp[m][n]!=0)
          {
              return dp[m][n];
          }
          
        int down= uniquePaths(m-1,n,dp);
          int right= uniquePaths(m,n-1,dp);
          
          return dp[m][n]=down+right;
          
          
          
      }
}