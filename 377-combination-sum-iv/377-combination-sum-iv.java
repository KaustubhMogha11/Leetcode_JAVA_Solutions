class Solution {
    public int combinationSum4(int[] nums, int target) {
        
        int dp[]=new int[target+1];
         Arrays.fill(dp, -1);
        return combinationSum4s(nums,target,dp);
    }
    
    public int combinationSum4s(int[] nums, int target,int[] dp) {
        
        int count=0;
      
        if(target<0)
        {
            return 0;
        }
        if(target==0)
        {
            return 1;
        }
          if(dp[target]!=-1)
        {
            return dp[target];
        }
        
        
       for(int num:nums)
       {
           count+=combinationSum4s(nums,target-num,dp);
       }
        
      dp[target]=count;
        
        return count;
    }
}