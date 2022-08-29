class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int j=0;
        int count=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-nums[j]>k)
            {
                count++;
                j=i;
        }
        }
        return count+1;
    }
}