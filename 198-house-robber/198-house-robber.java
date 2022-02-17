class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return getMaximumSum(nums.length-1,nums,dp);
    }
    public int getMaximumSum(int index,int [] nums,int []dp)
    {
        if(index==0)return nums[index];
        if(index<0)return 0;
        if(dp[index]!=-1)return dp[index];
        int pick=nums[index]+ getMaximumSum(index-2,nums,dp);
        int notPick=getMaximumSum(index-1,nums,dp);
        dp[index]=Math.max(pick,notPick);
        return dp[index];
    }
        
}


