class Solution {
    public int maxSubArray(int[] nums) {
        
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++)
        {
            currsum=currsum+nums[i];
            maxsum=Math.max(maxsum,currsum);
            
            if(currsum<0)
            {
                currsum=0;
            }
        }
        
        return maxsum;
    }
}