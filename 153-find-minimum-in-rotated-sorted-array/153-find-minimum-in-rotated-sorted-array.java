class Solution {
    public int findMin(int[] nums) {
        

        int pivot=findPivot(nums);
        
        return nums[pivot+1];
        
    }
    
    public int findPivot(int[] nums)
    {
        int s=0;
        int e=nums.length-1;
        while(s<=e)
        {
            int mid=s-(s-e)/2;
            
            if(mid<e && nums[mid]>nums[mid+1])
            {
                return mid;
            }else if(mid>s && nums[mid-1]>nums[mid])
            {
                return mid-1;
            }
            
            if(nums[mid]<=nums[s])
            {
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
}