class Solution {
    public int maxSubArray(int[] nums) {
        
        int currSum=0;
        // int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            currSum+=nums[i];
            max=Math.max(currSum,max);
            
            if(currSum<0)
            {
                currSum=0;
            }
        }
        
        return max;
    }
}