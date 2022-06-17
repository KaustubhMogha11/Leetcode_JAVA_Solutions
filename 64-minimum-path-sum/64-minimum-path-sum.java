class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        
//         dp[m-1][n-1]=grid[m-1][n-1];
        
//         for(int i=m-2;i>=0;i--)
//         {
//             dp[i][n-1]=grid[i][n-1]+dp[i+1][n-1];
//         }
        
//          for(int j=n-2;j>=0;j--)
//         {
//             dp[m-1][j]=grid[m-1][j]+dp[m-1][j+1];
//         }
        
//         for(int i=m-2; i>=0;i--)
//         {
//             for(int j=n-2;j>=0;j--)
//             {
//                 dp[i][j]=Math.min(dp[i+1][j],dp[i][j+1])+grid[i][j];
//             }
//         }
        
//         return dp[0][0];
        
        return minPathSum(grid,m,n,dp,0,0);
    }
     public int minPathSum(int[][] grid,int m, int n, int[][] dp, int i, int j){
         
         if(i>=m || j>=n)
         {
            return Integer.MAX_VALUE;
         }
         
         if(i==m-1 && j==n-1)
         {
             return dp[i][j]=grid[i][j];
         }
         
         if(dp[i][j]!=0)
         {
             return dp[i][j];
         }
         
         int opt1=minPathSum(grid,m,n,dp,i+1,j);
         int opt2=minPathSum(grid,m,n,dp,i,j+1);
         // int opt3=minPathSum(grid,m,n,dp,i+1,j+1);
         
         dp[i][j]=grid[i][j]+Math.min(opt1,opt2);
         
         return dp[i][j];
     }
    
}