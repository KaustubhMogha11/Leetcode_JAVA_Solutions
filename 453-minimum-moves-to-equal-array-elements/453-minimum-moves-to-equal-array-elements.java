class Solution {
    public int minMoves(int[] nums) {
        
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            min=Math.min(nums[i],min);
        }
        
      
        
        return sum-nums.length*min;
    }
}