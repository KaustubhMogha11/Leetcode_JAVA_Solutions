class Solution {
    public int maximalSquare(char[][] matrix) {
        
        int m=matrix.length;
        int n= matrix[0].length;
        
        int dp[][]=new int[m+1][n+1];
        int area=0;
        for( int i=0;i<m+1;i++)
        {
            for( int j=0;j<n+1;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;
                }else if(matrix[i-1][j-1]=='1'){
                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]));
                       
                }
                 area=Math.max(area,dp[i][j]);
            }
        }
        
        return area*area;
    }
}