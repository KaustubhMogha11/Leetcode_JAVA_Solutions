class Solution {
    public boolean canPartition(int[] nums) {
        
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        
        if(sum%2!=0)
        {
            return false;
        }else 
        {
           boolean dp[][]=new boolean[nums.length+1][sum/2+1];
            
            for(int i=0;i<nums.length;i++){
                dp[i][0]=true;
            }
            
          for(int i=1; i<dp.length; i++){ //nums
            for(int j=1; j<dp[0].length; j++){
                if(nums[i-1]<=j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[nums.length][sum/2];
        }
    }
}