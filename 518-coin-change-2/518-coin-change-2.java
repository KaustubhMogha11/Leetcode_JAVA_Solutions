class Solution {
    public int change(int amount, int[] coins) {
        
        int dp[][]=new int[coins.length+1][amount+1];
        
        for(int i=0;i<amount+1;i++)
        {
            dp[0][i]=0;
        }
        for(int i=0;i<coins.length+1;i++)
        {
            dp[i][0]=1;
        }
        
        for(int i=1;i<coins.length+1;i++)
        {
            for(int j=1;j<amount+1;j++)
            {
                if(coins[i-1]<=j)
                {
                    dp[i][j]=dp[i][j-coins[i-1]]+dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        
        return dp[coins.length][amount];
    }
}