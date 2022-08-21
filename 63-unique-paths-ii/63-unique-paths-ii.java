class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
    
      return ans(0,0,m,n,obstacleGrid,dp);
    }
    
    public static int ans(int i,int j,int m,int n,int[][] obstacleGrid,int dp[][])
    {
        if(i>=m || j>=n)
            return 0;
        if(obstacleGrid[i][j]==1)
            return 0;
      
        if(dp[i][j]!=0)
            return dp[i][j];
        
          if(i==m-1 && j==n-1)
            return 1;
        int left=ans(i,j+1,m,n,obstacleGrid,dp);
        int right=ans(i+1,j,m,n,obstacleGrid,dp);
        
        return dp[i][j]=left+right;
            
    }
}