class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//      int dp[][] = new int[obstacleGrid.length+1][obstacleGrid[0].length+1];
//     for(int i=0;i<obstacleGrid.length;i++)
//     {
//         for(int j=0;j<obstacleGrid[0].length;j++)
//         {
//             if(i==0&&j==0&&obstacleGrid[i][j]==0)
//                 dp[i+1][j+1] = 1;
//             else if(obstacleGrid[i][j]==0)
//                 dp[i+1][j+1] = dp[i][j+1]+dp[i+1][j];
//         }
//     }
   
//     return dp[obstacleGrid.length][obstacleGrid[0].length];
  
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        
        int dp[][]=new int[m+1][n+1];
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j==0 && obstacleGrid[i][j]==0)
                {
                    dp[i+1][j+1]=1;
                        
                }else if(obstacleGrid[i][j]==0)
                dp[i+1][j+1] = dp[i][j+1]+dp[i+1][j];
            }
        }
        return dp[m][n];
    }
//         return  uniquePathsWithObstacles(obstacleGrid,0,0,dp);
//     }
//       public int uniquePathsWithObstacles(int[][] grid,int i, int j, int[][] dp)
//       {
//           int m=grid.length;
//           int n=grid[0].length;
         
          
//           if(dp[i][j]!=0)
//           {
//               return dp[i][j];
//           }
//            if(i>=m || j>=n)
//           {
//               dp[i][j]=0;
//               return dp[i][j];
              
//           }
//             if(grid[i][j]==1)
//           {
//               return 0;
//           }
          
//           if(i==m-1 && j==n-1)
//           {
//               dp[i][j]=1;
//               return dp[i][j];
              
//           }
          
         
         
              
//           int left=uniquePathsWithObstacles(grid,i+1,j,dp);
//           int right=uniquePathsWithObstacles(grid,i,j+1,dp);
          
//           dp[i][j]=left+right;
          
//           return dp[i][j];
//       }
    
}