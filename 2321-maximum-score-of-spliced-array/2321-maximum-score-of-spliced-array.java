class Solution {
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        
        int sum1=0;
        int sum2=0;
        int[] arr1=new int[nums1.length];
        int[] arr2=new int[nums2.length];
        for(int i=0;i<nums1.length;i++)
        {
            sum1+=nums1[i];
        }
         for(int i=0;i<nums2.length;i++)
        {
            sum2+=nums2[i];
        }
        
        for(int i=0;i<nums1.length;i++)
        {
            arr1[i]=nums1[i]-nums2[i];
        }
        
         for(int i=0;i<nums2.length;i++)
        {
            arr2[i]=nums2[i]-nums1[i];
        }
        int ans1=kadane(arr1);
        int ans2=kadane(arr2);
        
        return Math.max(ans1+sum2,ans2+sum1);
        
    }
    
    public int kadane(int[] nums){
          int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
          sum=sum+nums[i];
            max=Math.max(sum,max);
            if(sum<0)
            {
                sum=0;
            }
        }
        
        return max;
    }
}