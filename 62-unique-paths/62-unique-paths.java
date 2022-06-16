class Solution {
    public int uniquePaths(int m, int n) {
   
        int dp[][]=new int[m+1][n+1];
        
        for(int i=1;i<=m;i++)
            for(int j=1;j<=n;j++)
            {
                if(i==1 || j==1)
                    dp[i][j]=1;
                else
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        
        return dp[m][n];
       
//         int dp[][]=new int[m][n];
        
//         return uniquePaths(m,n,0,0,dp);
//       }
    
//       public int uniquePaths(int m, int n, int i, int j, int[][] dp) {
          
//           if(i>=m || j>=n)
//           {
//               return 0;
//           }
//           if(i==m-1 || j==n-1)
//           {
//               return 1;
//           }
          
//           if(dp[i][j]!=0)
//           {
//               return dp[i][j];
//           }
          
//           int right= uniquePaths(m,n,i,j+1,dp);
//           int down= uniquePaths(m,n,i+1,j,dp);
          
//           return dp[i][j]=right+down;
          
      }
    
}