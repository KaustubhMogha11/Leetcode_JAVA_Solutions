class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int dp[]=new int[cost.length];
        return Math.min(min(cost,0,dp),min(cost,1,dp));
    }
    
    public int min(int[] cost,int i,int[] dp)
    {
        if(i==cost.length-1)
        {
            return cost[i];
        }
        if(i>=cost.length)
        {
            return 0;
        }
        if(dp[i]!=0)
        {
            return dp[i];
        }
        
        int opt1=min(cost,i+1,dp);
        int opt2=min(cost,i+2,dp);
        dp[i]=Math.min(opt1,opt2)+cost[i];
        
        return dp[i];
    }
}