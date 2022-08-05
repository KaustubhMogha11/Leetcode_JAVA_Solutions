class Solution {
   
    public int combinationSum4(int[] nums, int target) {
      int dp[]=new int[target+1];  
           Arrays.fill(dp, -1);
   return ans(nums,target,dp);
       
    }
    
    public static int ans(int[] nums,int target,int[] dp)
    {
      int count=0;   
        if(target<0)
            return 0;
        if(target==0)
            return 1;
        
        if(dp[target]!=-1)
            return dp[target];
        
        for(int i=0;i<nums.length;i++)
        {
            count+=ans(nums,target-nums[i],dp);
        }
        dp[target]=count;
        return count;
    }
}