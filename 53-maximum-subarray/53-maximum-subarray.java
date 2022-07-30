class Solution {
    public int maxSubArray(int[] nums) {
        
        int max=Integer.MIN_VALUE;
        int currSum=0;
        // int su=0;
        for(int i=0;i<nums.length;i++)
        {
            currSum=currSum+nums[i];
                max=Math.max(max,currSum);
            
            if(currSum<0)
            {
                currSum=0;
            }
        }
        
        return max;
    }
}