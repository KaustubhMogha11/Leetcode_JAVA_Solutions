class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int max=Integer.MIN_VALUE;
        int currSum=0;
        int min=Integer.MAX_VALUE;
        int totalSum=0;
        for(int i=0;i<nums.length;i++)
        {
            totalSum+=nums[i];
            currSum=Math.max(currSum+nums[i],nums[i]);
            max=Math.max(max,currSum);
        
        }
        currSum=0;
        for(int i=0;i<nums.length;i++)
        {
            currSum=Math.min(currSum+nums[i],nums[i]);
            min=Math.min(currSum,min);
        }
        
        if(min==totalSum)
        {
            return max;
        }
        return Math.max(totalSum-min,max);
    }
}