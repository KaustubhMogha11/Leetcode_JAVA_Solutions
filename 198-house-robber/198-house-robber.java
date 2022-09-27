class Solution {
    public int rob(int[] nums) {
        
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
//         dp[0]=0;
//         dp[1]=nums[0];
        
//         for(int i=2;i<nums.length+1;i++)
//         {
//             dp[i]=Math.max(dp[i-2]+nums[i-1],dp[i-1]);
//         }
        
//         return dp[nums.length];
        
        return ans(nums.length-1,nums,dp);
            
        
    }
    
    public static int ans(int i,int[] nums,int[] dp){
        if(i==0)
            return nums[i];
        if(i<0)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        
        int pick=nums[i]+ans(i-2,nums,dp);
        int notpick=ans(i-1,nums,dp);
        
        return dp[i]=Math.max(pick,notpick);
        
    }
}