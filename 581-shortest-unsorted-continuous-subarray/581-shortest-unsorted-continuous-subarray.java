class Solution {
    public int findUnsortedSubarray(int[] nums) {
      
        int arr[]=nums.clone();
        Arrays.sort(arr);
        int i=0;
        int j=nums.length-1;
        while(i<j)
        {
            if(nums[i]==arr[i] && nums[j]==arr[j])
            {
                i++;
                j--;
            }
            else if(nums[i]==arr[i])
            {
                i++;
            }
            else if(nums[j]==arr[j])
            {
                j--;
            }
            else 
            {
                return j-i+1;
            }
        }
        return 0;
    }
}