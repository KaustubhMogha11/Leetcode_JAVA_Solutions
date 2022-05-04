class Solution {
    public int maxOperations(int[] nums, int k) {
        
        Arrays.sort(nums);
        int lo=0;
        int hi=nums.length-1;
        int count=0;
        while(lo<hi)
        {
            if(nums[lo]+nums[hi]==k)
            {
                count++;
            lo++;
            hi--;
        }else if(nums[lo]+nums[hi]>k)
        {
            hi--;
        }else lo++;
        
        }
        
        return count;
    }
}