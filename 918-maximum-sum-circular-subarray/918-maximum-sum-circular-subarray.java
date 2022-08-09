class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int currMin=0;
        int currMax=0,total=0;
        
        for(int i=0;i<nums.length;i++)
        {
            total+= nums[i];
            currMin+=nums[i];
            currMax+=nums[i];
            min=Math.min(currMin,min);
            max=Math.max(currMax,max);
            
            if(currMin>0)
            {
                currMin=0;
            }
            
            if(currMax<0)
            {
                currMax=0;
            }
        }
        
        if(max<0)
            return max;
        
         return Math.max(max, total - min);
    }
}