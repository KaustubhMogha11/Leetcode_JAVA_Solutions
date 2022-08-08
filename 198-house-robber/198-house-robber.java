class Solution {
    public int rob(int[] nums) {
       
        int dp[]=new int[nums.length];
//         dp[0]=0;
//         dp[1]=nums[0];
        
//         for(int i=2;i<nums.length+1;i++)
//         {
//             dp[i]=Math.max(dp[i-2]+nums[i-1],dp[i-1]);
//         }
        
//         return dp[nums.length];
        Arrays.fill(dp,-1);
        
        return ans(nums,dp,0);
    }
    
    public static int ans(int[] nums,int[] dp,int i)
    {
        if(i==nums.length-1)
            return nums[i];
        if(i>=nums.length)
            return 0;
        
        if(dp[i]!=-1)
            return dp[i];
        
        int opt1=ans(nums,dp,i+1);
        int opt2=ans(nums,dp,i+2)+nums[i];
        
        return dp[i]=Math.max(opt1,opt2);
    }
}