class Solution {
    public int maxProfit(int[] nums) {
      
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
             min=Math.min(min,nums[i]);
             ans=Math.max(ans,nums[i]-min);
           
           
        }
    
        return ans;
    }
}