class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
       int n=cost.length;
        int dp[]=new int[n];
//         dp[0]=0;
//         dp[1]=0;
        
//         for(int i=2;i<n+1;i++)
//         {
//             dp[i]=Math.min(dp[i-2]+cost[i-1],dp[i-1]);
//         }
        
//         return dp[n];
        return Math.min(ans(cost,dp,0),ans(cost,dp,1));
    }
    public int ans(int[] nums,int[] dp,int i){
        
        if(i==nums.length-1)
        {
            return nums[i];
        }
        if(i>=nums.length)
        {
            return 0;
        }
        
        if(dp[i]!=0)
        {
            return dp[i];
        }
        int opt1=ans(nums,dp,i+1);
        int opt2=ans(nums,dp,i+2);    
        
        dp[i]=Math.min(opt1,opt2)+nums[i];
        return dp[i];
    }
}