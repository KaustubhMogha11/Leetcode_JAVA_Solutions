class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
         if(((sum - target) % 2 == 1) || (target > sum))
            return 0;
      int s1=(sum-target)/2;
        int[][] dp=new int[nums.length+1][s1+1];
    dp[0][0]=1;
        
        for(int i=1;i<nums.length+1;i++)
        {
            for(int j=0;j<s1+1;j++)
            {
                if(nums[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j-nums[i-1]]+dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        return dp[nums.length][s1];
       }
}