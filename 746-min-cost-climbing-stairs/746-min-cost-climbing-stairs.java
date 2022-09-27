class Solution {
    public int minCostClimbingStairs(int[] cost) {
       
        int dp[]=new int[cost.length];
        
        return Math.min(ans(cost,dp,0),ans(cost,dp,1));
    }
    
    public static int ans(int[] cost,int[] dp,int i)
    {
        if(i>=cost.length)
        {
            return 0;
        }
        
        if(dp[i]!=0)
        {
            return dp[i];
        }
        
        int opt1=ans(cost,dp,i+1)+cost[i];
        int opt2=ans(cost,dp,i+2)+cost[i];
       return dp[i]=Math.min(opt1,opt2);
    }
}