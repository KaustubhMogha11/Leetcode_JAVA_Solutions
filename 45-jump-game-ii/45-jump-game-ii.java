class Solution {
    public int jump(int[] nums) {
        
        int count=0;
        int curr=0;
        int reachable=0;
        for(int i=0;i<nums.length;i++)
        {
            if(curr<i)
            {
                count++;
                curr=reachable;
            }
            reachable=Math.max(reachable,nums[i]+i);
        }
        
        return count;
    }
}