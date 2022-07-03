class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<2)
        {
            return nums.length;
        }
        
        int prev=nums[1]-nums[0];
        int count=prev!=0?2:1;
        
        for(int i=2;i<nums.length;i++)
        {
            int diff=nums[i]-nums[i-1];
            if(diff>0 && prev<=0 || diff<0 && prev>=0)
            {
                count++;
                prev=diff;
            }
        }
        return count;
    }
}