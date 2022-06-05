class Solution {
    public int jump(int[] nums) {
           int reachable=0;
        int count=0;
        int temp=0;
        for(int i=0;i<nums.length;i++)
        {
            if(temp<i)
            {
               count++;
                temp=reachable;
                reachable=0;
            }
            
            reachable=Math.max(reachable,i+nums[i]);
    
            
        }
        
        return count;
    }
}