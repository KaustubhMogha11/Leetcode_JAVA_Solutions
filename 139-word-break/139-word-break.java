class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
     
        int n=s.length();
        boolean dp[]=new boolean[n+1];
          dp[n] = true;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=i;!dp[i] && j<=n;j++)
            {
            dp[i]=dp[j] &  wordDict.contains(s.substring(i,j));
            }
        }
        
        return dp[0];
    }
}