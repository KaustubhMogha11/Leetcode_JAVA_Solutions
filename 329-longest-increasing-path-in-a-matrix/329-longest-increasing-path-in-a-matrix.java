class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        
        int dp[][]=new int[matrix.length][matrix[0].length];
        int ans=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++)
            {
                ans=Math.max(longestIncreasingPath(matrix,i,j,Integer.MIN_VALUE,dp),ans);
            }
        }
        
        return ans;
    }
      public int longestIncreasingPath(int[][] matrix,int i,int j, int prev, int[][] dp){
          int m=matrix.length;
          int n=matrix[0].length;
          
          if(i>=m || j>=n || i<0 || j<0)
          {
              return 0;
          }
          
          if(matrix[i][j]<=prev)
          {
              return 0;
          }
          
          if(dp[i][j]!=0)
          {
              return dp[i][j];
          }
          
          int leftCell = 1 + longestIncreasingPath(matrix, i, j-1, matrix[i][j], dp);
        int rightCell = 1 + longestIncreasingPath(matrix, i, j+1, matrix[i][j], dp);
        int topCell = 1 + longestIncreasingPath(matrix, i-1, j, matrix[i][j], dp);
        int bottomCell = 1 + longestIncreasingPath(matrix, i+1, j, matrix[i][j], dp);
        
        return dp[i][j] = Math.max(leftCell, Math.max(rightCell, Math.max(topCell, bottomCell)));
      }
    
}