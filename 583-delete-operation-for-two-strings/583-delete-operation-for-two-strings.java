class Solution {
    public int minDistance(String word1, String word2) {
        
        int m=word1.length();
        int n=word2.length();
        int dp[][]=new int[m+1][n+1];
        
        for(int i=0;i<m+1;i++)
        {
            dp[i][0]=0;
        }
        
          for(int i=0;i<n+1;i++)
        {
            dp[0][i]=0;
        }
        
        for(int i=1;i<m+1;i++)
        {
            for(int j=1;j<n+1;j++)
            {
                if(word1.charAt(m-i)==word2.charAt(n-j))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return m+n-2*dp[m][n];
    }
}