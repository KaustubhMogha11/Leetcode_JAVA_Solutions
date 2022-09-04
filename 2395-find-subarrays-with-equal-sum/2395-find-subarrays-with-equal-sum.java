class Solution {
    public boolean findSubarrays(int[] nums) {
        
        int sum=nums[0]+nums[1];
        HashSet<Integer> set=new HashSet<>();
        set.add(sum);
        
        for(int i=2;i<nums.length;i++)
        {
            sum=nums[i-1]+nums[i];
            if(set.contains(sum))
            {
                return true;
            }else{
                set.add(sum);
            }
        }
        
        return false;
    }
}