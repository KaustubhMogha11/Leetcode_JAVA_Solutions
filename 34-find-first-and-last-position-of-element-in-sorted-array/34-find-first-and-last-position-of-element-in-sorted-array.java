class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int ans[]={-1,-1};
        int start=ans(nums,target,true);
        int end=ans(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        
        return ans;
    }
    
    public int ans(int[] nums,int target,boolean firstIndex)
    {
        int res=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=end-(end-start)/2;
            if(target>nums[mid])
            {
                start=mid+1;
            }else if(target<nums[mid])
            {
                end=mid-1;
            }else{
                res=mid;
                if(firstIndex)
                {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        
        return res;
    }
}