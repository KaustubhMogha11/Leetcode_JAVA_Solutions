class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int dp[]=new int[nums.length+1];
        dp[0]=1;
        int ans=1;
        for(int i=1;i<nums.length;i++)
        {
            int max=1;
            for(int j=i-1;j>=0;j--)
            {
              if(nums[j]<nums[i])
              {
                  int option=1+dp[j];
                  if(max<option)
                      max=option;
              }
            }
            dp[i]=max;
            if(ans<max)
                ans=max;
                
        }
        
        return ans;
    }
}