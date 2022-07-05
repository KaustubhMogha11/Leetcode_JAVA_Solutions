class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        int count=1;
        int max=0;
        for(int i=1;i<nums.length;i++)
        {
              if(nums[i] == nums[i-1]){
                continue; //same element as previous skip this
            }
           else if(nums[i]==1+nums[i-1])
            {count++;
            }else{
                max=Math.max(max,count);
                count=1;
            }
        }  
        
        return Math.max(count,max);
        
        
    }
}